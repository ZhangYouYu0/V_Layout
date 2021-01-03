package com.example.mylibrary.Utils.Net;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ApiServcie {
//    https://cdplay.cn/api/index
    String BaseUrl = " https://cdplay.cn/";
    @GET
    Observable<ResponseBody> get(@Url String baseUrl);
 //  String TopicUrlone =";

    @GET("api/topic/list?&size=10")
    Observable<ResponseBody> get1(@Query("page") int page);


//    https://cdplay.cn/api/topic/list?page=1&size=10

}
