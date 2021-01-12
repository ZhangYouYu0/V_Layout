package com.example.viewpager.m;

import com.example.mylibrary.Utils.Net.One.CallBack;
import com.example.mylibrary.Utils.Net.One.RetrofitUtils;
import com.example.viewpager.Contract.C;
;

public class ImMode implements C.Mode{



    @Override
    public <I> void Next1(String url, CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUils().get(url,callBack);
    }

    @Override
    public <I> void Next2(int  id, CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUils().getColl(id,callBack);
    }

    @Override
    public <I> void Next3(String url, CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUils().getTab(url,callBack);
    }

    @Override
    public <I> void Next4(int id, CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUils().getClassfiy(id,callBack);
    }

    @Override
    public <I> void Next5(String url, CallBack<I> callBack) {
    RetrofitUtils.getRetrofitUils().getShopping(url,callBack);
    }

    @Override
    public <I> void Next5(int categoryId, CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUils().getHomeClick(categoryId,callBack);
    }

    @Override
    public <I> void Next7(int id, CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUils().getHomeSpXq(id,callBack);
    }

    @Override
    public <I> void Next8(int id, CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUils().getHomeGwc(id,callBack);
    }
}
