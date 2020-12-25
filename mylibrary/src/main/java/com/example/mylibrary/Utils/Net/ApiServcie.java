package com.example.mylibrary.Utils.Net;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiServcie {

    String BaseUrl = "https://cdwan.cn/";
    @GET
    Observable<ResponseBody> get(@Url String baseUrl);
}
