package com.example.mylibrary.Utils.Net.Two;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface API {
    String url ="https://cdplay.cn/";
    @FormUrlEncoded
    @POST("api/cart/add")
    Observable<ResponseBody> get(@Field("goodsId") int goodsId,@Field("number") int number,@Field("productId") int productId);

}
