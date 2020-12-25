package com.example.viewpager.P;

import com.example.mylibrary.Base.BasePresenter;
import com.example.mylibrary.Utils.Net.CallBack;
import com.example.mylibrary.Utils.Net.ConUrl;
import com.example.viewpager.Contract.C;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.m.ImMode;

public class ImPresenter  extends BasePresenter<C.View,C.Mode> implements C.Presenter {
    @Override
    public C.Mode setImode() {
        return new ImMode(this);
    }

    @Override
    public void P1() {
    imode.Next(ConUrl.BannUrl, new CallBack<FooHomeBean>() {
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
}
