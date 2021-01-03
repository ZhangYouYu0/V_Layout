package com.example.mylibrary.Utils.Net;

import android.util.Log;

import androidx.recyclerview.widget.RecyclerView;

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

public class RetrofitUtils implements WorkIntefac{
    private static volatile RetrofitUtils retrofitUils;
    private final ApiServcie apiServcie;
    private final ApiServcie apiServcie1;

    private RetrofitUtils() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiServcie.BaseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        Log.e("TAG", "RetrofitUtils: "+ApiServcie.BaseUrl);
        apiServcie = retrofit.create(ApiServcie.class);


        Retrofit build = new Retrofit.Builder()
                .baseUrl(ApiServcie.BaseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        apiServcie1 = build.create(ApiServcie.class);
    }

    public static RetrofitUtils getRetrofitUils() {
        if(retrofitUils==null){
            synchronized (RetrofitUtils.class){
                if(retrofitUils==null){
                    retrofitUils = new RetrofitUtils();
                }
            }
        }
        return retrofitUils;
    }

    @Override
    public <I> void get(String url, CallBack<I> callBack) {
        Log.e("TAG", "get: "+url);
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
                            callBack.OnSuucessHome(o);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }


                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        callBack.OnSuucess("Home:网络异常："+e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public <I> void getColl(int id, CallBack<I> callBack) {
        Log.e("TAG", "get111: "+id);
        apiServcie1.get1(id)
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
                            Type type =actualTypeArguments[0];
                            I o = new Gson().fromJson(string, type);
                            callBack.OnErroColl(o);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        callBack.OnSuucess("Coll:网络异常："+e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
