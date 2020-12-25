package com.example.mylibrary.Utils.Net;

import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public class RetrofitUils implements WorkIntefac{
    private static volatile RetrofitUils retrofitUils;
    private final ApiServcie apiServcie;

    private RetrofitUils() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiServcie.BaseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        apiServcie = retrofit.create(ApiServcie.class);
    }

    public static RetrofitUils getRetrofitUils() {
        if(retrofitUils==null){
            synchronized (RetrofitUils.class){
                if(retrofitUils==null){
                    retrofitUils = new RetrofitUils();
                }
            }
        }
        return retrofitUils;
    }

    @Override
    public <I> void Inface(String url, CallBack<I> callBack) {
        apiServcie.get(url)
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
                            Type[] genericInterfaces = callBack.getClass().getGenericInterfaces();
                            Type[] actualTypeArguments = ((ParameterizedType) genericInterfaces[0]).getActualTypeArguments();
                            Type t = actualTypeArguments[0];
                            I o = new Gson().fromJson(string, t);
                            callBack.OnSuucess(o);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                    callBack.OnErro("网络异常："+e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
