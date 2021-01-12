package com.example.mylibrary.Utils.Net.Two;

import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUils1 implements Workinteface1{
    private static volatile RetrofitUils1 retrofitUils1;
    private final API api;

    public RetrofitUils1() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API.url)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(API.class);
    }

    public static RetrofitUils1 getRetrofitUils1() {
        if (retrofitUils1==null){
            synchronized (RetrofitUils1.class){
                if(retrofitUils1==null){
                    retrofitUils1 = new RetrofitUils1();
                }
            }
        }
        return retrofitUils1;
    }


    @Override
    public <I> void getData(int goodsId, int number, int productId, CallBack1<I> callBack1) {
        Log.e("TAG", "getData: "+goodsId+number+productId);
        api.get(goodsId,number,productId)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<ResponseBody>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ResponseBody responseBody) {
                try {
                    String string = responseBody.string();
                    Type[] genericInterfaces = callBack1.getClass().getGenericInterfaces();
                    Type[] actualTypeArguments = ((ParameterizedType) genericInterfaces[0]).getActualTypeArguments();
                    Type type =actualTypeArguments[0];
                    I o = new Gson().fromJson(string, type);
                    callBack1.Data(o);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(@NonNull Throwable e) {
            callBack1.Err("购物车"+e.getMessage());
            }

            @Override
            public void onComplete() {

            }
        });
    }
}
