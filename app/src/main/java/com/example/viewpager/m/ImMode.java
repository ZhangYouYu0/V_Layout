package com.example.viewpager.m;

import com.example.mylibrary.Utils.Net.CallBack;
import com.example.mylibrary.Utils.Net.RetrofitUtils;
import com.example.viewpager.Contract.C;
;
import com.example.viewpager.P.ImPresenter;

public class ImMode implements C.Mode{
    ImPresenter imPresenter;

    public ImMode(ImPresenter imPresenter) {
        this.imPresenter = imPresenter;
    }


    @Override
    public <I> void Next(String url, CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUils().get(url,callBack);
    }
}
