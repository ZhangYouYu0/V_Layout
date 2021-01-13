package com.example.viewpager.TwoMode;

import android.util.Log;

import com.example.mylibrary.Utils.Net.One.CallBack;
import com.example.mylibrary.Utils.Net.Two.CallBack1;
import com.example.mylibrary.Utils.Net.Two.RetrofitUils1;
import com.example.viewpager.ApiService.ApiService0;
import com.example.viewpager.Ca.CallBack0;
import com.example.viewpager.Contract.C1;
import com.example.viewpager.FooBean.FooGwcBean;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class TwoMode implements Mode1 {


    @Override
    public void Mode1(int goodsId, int number, int productId, CallBack0 callBack0) {
        Log.e("TAG", "Mode1: "+goodsId+number+productId );
        new Retrofit.Builder()
                .baseUrl(ApiService0.url)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService0.class)
                .get(goodsId,number,productId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<FooGwcBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull FooGwcBean fooGwcBean) {
                    callBack0.Data(fooGwcBean);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                    callBack0.Err("购物车"+e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
