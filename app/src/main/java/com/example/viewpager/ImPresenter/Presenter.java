package com.example.viewpager.ImPresenter;

import com.example.mylibrary.Base.BasePresenter;
import com.example.mylibrary.Utils.Net.CallBack;
import com.example.mylibrary.Utils.Net.ConUrl;
import com.example.mylibrary.Utils.Net.WorkIntefac;
import com.example.viewpager.Contract.C;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.ImMode.Model;

import java.net.URI;

public class Presenter extends BasePresenter<C.View,C.Mode> implements C.Presenter {

    @Override
    public void P1() {
//        imode.Inface(ConUrl.BannUrl, new CallBack<FooHomeBean>() {
//            @Override
//            public void OnSuucess(FooHomeBean) {
//                iview.OnSuucess(FooHomeBean);
//            }
//
//            @Override
//            public void OnErro(String err) {
//                iview.OnErro(err);
//            }
//        });
        imode.Inface(ConUrl.BannUrl, new CallBack<FooHomeBean>() {
            @Override
            public void OnSuucess(FooHomeBean fooHomeBean) {
                iview.OnSuucess(fooHomeBean);
            }

            @Override
            public void OnErro(String err) {
            iview.OnErro(err);
            }
        });
    }

    @Override
    public void P2() {

    }

    @Override
    public C.Mode setImode() {
        return new Model(this);
    }
}
