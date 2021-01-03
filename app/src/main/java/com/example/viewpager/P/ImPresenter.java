package com.example.viewpager.P;

import com.example.mylibrary.Base.BasePresenter;
import com.example.mylibrary.Utils.Net.CallBack;
import com.example.mylibrary.Utils.Net.ConUrl;
import com.example.viewpager.Contract.C;
import com.example.viewpager.FooBean.Bean;
import com.example.viewpager.FooBean.FooCollBean;
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
            public void OnSuucessHome(FooHomeBean fooHomeBean) {
                iview.OnSuucessHome(fooHomeBean);
            }

            @Override
            public void OnSuucess(String err) {
                iview.OnErro(err);
            }

            @Override
            public void OnErroColl(FooHomeBean fooHomeBean) {

            }

            @Override
            public void OnLogin(FooHomeBean fooHomeBean) {

            }

        });
    }

    @Override
    public void P2(int id) {
        imode.Next1(id,new CallBack<Bean>() {
         @Override
         public void OnSuucessHome(Bean fooCollBean) {

         }

         @Override
         public void OnSuucess(String err) {
            iview.OnErro(err);
         }

         @Override
         public void OnErroColl(Bean fooCollBean) {
             iview.OnSuucessColl(fooCollBean);
         }

            @Override
            public void OnLogin(Bean bean) {

            }
        });
    }


}
