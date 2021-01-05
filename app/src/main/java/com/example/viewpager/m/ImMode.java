package com.example.viewpager.m;

import com.example.mylibrary.Utils.Net.CallBack;
import com.example.mylibrary.Utils.Net.RetrofitUtils;
import com.example.viewpager.Contract.C;
;
import com.example.viewpager.P.ImPresenter;

import retrofit2.http.Url;

public class ImMode implements C.Mode{



    @Override
    public <I> void Next(String url, CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUils().get(url,callBack);
    }

    @Override
    public <I> void Next1(int  id, CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUils().getColl(id,callBack);
    }

    @Override
    public <I> void Next2(String url,CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUils().getTab(url,callBack);
    }

    @Override
    public <I> void Next3(int id, CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUils().getClassfiy(id,callBack);
    }

    @Override
    public <I> void Next4(String url, CallBack<I> callBack) {
    RetrofitUtils.getRetrofitUils().getShopping(url,callBack);
    }
}
