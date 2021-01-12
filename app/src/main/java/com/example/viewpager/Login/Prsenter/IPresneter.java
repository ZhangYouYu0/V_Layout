package com.example.viewpager.Login.Prsenter;

import com.example.mylibrary.Base.BasePresenter;
import com.example.mylibrary.Utils.Net.One.CallBack;
import com.example.viewpager.Login.Bean.FooLoginBean;
import com.example.viewpager.Login.Contract.C;
import com.example.viewpager.Login.Mode.IMode;
import com.tencent.mmkv.MMKV;

import java.util.ArrayList;

public class IPresneter extends BasePresenter<C.View,C.Mode> implements C.Presenter {

    @Override
    public void P(ArrayList<String> list) {

        imode.Mode(list, new CallBack<FooLoginBean>() {
            @Override
            public void OnSuucessHome(FooLoginBean fooLoginBean) {

            }

            @Override
            public void OnSuucess(String err) {
            iview.OnFail(err);
            }

            @Override
            public void OnSuucessColl(FooLoginBean fooLoginBean) {

            }

            @Override
            public void OnSuucessTab(FooLoginBean fooLoginBean) {

            }

            @Override
            public void OnSuucessClassfiy(FooLoginBean fooLoginBean) {

            }

            @Override
            public void OnSuucessUserToke(FooLoginBean fooLoginBean) {

            }

            @Override
            public void OnSuucessShopping(FooLoginBean fooLoginBean) {

            }

            @Override
            public void OnSuucessHomeClick(FooLoginBean fooLoginBean) {

            }

            @Override
            public void OnSuucessHomeSpXq(FooLoginBean fooLoginBean) {

            }

            @Override
            public void OnSuucessGWC(FooLoginBean fooLoginBean) {

            }

            @Override
            public void OnLogin(FooLoginBean fooLoginBean) {
                iview.OnCg();
                Integer code = fooLoginBean.getData().getCode();
                if (code == 200) {
                    MMKV mmkv = MMKV.defaultMMKV();
                    mmkv.encode("loginInfo", fooLoginBean.getData());
                    iview.OnCg();
                }
            }
        });


    }


    @Override
    public C.Mode setImode() {
        return new IMode(this);

    }
}
