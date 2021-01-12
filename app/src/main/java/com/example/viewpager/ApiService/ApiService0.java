package com.example.viewpager.ApiService;

import com.example.viewpager.FooBean.FooGwcBean;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService0 {

    String url ="https://cdplay.cn/";
    @FormUrlEncoded
    @POST("api/cart/add")
    Observable<FooGwcBean> get(@Field("goodsId") int goodsId, @Field("number") int number, @Field("productId") int productId);
}
