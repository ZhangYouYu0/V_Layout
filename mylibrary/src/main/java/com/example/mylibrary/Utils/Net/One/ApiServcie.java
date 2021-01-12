package com.example.mylibrary.Utils.Net.One;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ApiServcie {
//    https://cdplay.cn/api/index
    String BaseUrl = " https://cdplay.cn/";
    @GET
    Observable<ResponseBody> get(@Url String baseUrl);


    @GET("api/topic/list?&size=10")
    Observable<ResponseBody> get1(@Query("page") int page);

//    https://cdplay.cn/

    @GET("api/goods/list?")
    Observable<ResponseBody> getHomeClick(@Query("categoryId") int categoryId);

//    https://cdplay.cn/api/auth/login
    @FormUrlEncoded
    @POST("api/auth/login")
    Observable<ResponseBody> getLogin(@Field("username") String username, @Field("password")String password);


    @GET
    Observable<ResponseBody> getTab(@Url String TabUrl);

    @GET("api/catalog/current?")
    Observable<ResponseBody> getClassfiy(@Query("id") int id);

    @FormUrlEncoded
    @POST()
    Observable<ResponseBody> getNext(@Url String url, @Header("Token")String Token);


    @GET
    Observable<ResponseBody> getShopping(@Url String url);
//    https://cdplay.cn/

//    https://cdplay.cn/
    @GET("api/goods/detail?")
    Observable<ResponseBody> getHomeSpXq(@Query("id") int id);

    String gwcUrl = "https://cdwan.cn/api/";

//
    @GET("goods/detail?")
    Observable<ResponseBody> getGwc(@Query("id") int id);

}
