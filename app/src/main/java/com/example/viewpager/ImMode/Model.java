package com.example.viewpager.ImMode;

import com.example.mylibrary.Utils.Net.CallBack;
import com.example.mylibrary.Utils.Net.RetrofitUils;
import com.example.viewpager.Contract.C;

public class Model implements C.Mode{
    C.Presenter presenter;

    public Model(C.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <I> void Inface(String url, CallBack<I> callBack) {
         RetrofitUils.getRetrofitUils().Inface(url,callBack);
    }
}
