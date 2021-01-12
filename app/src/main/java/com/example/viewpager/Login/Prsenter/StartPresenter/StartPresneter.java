package com.example.viewpager.Login.Prsenter.StartPresenter;

import com.example.mylibrary.Base.BasePresenter;
import com.example.mylibrary.Utils.Net.One.CallBack;
import com.example.mylibrary.Utils.Net.One.ConUrl;
import com.example.viewpager.Login.Bean.FooLoginBean;
import com.example.viewpager.Login.Bean.StartBean.FooTokeBean;
import com.example.viewpager.Login.Contract.StartContract.C;
import com.example.viewpager.Login.Mode.StartMode.StartMode;
import com.tencent.mmkv.MMKV;

import java.util.HashMap;

public class StartPresneter extends BasePresenter<C.StartView,C.StartMode> implements C.StartPresenter {
    @Override
    public C.StartMode setImode() {
        return new StartMode();
    }

    @Override
    public void startpresenter() {

        MMKV mmkv = MMKV.defaultMMKV();
        FooLoginBean.DataDTO loginInfo = mmkv.decodeParcelable("loginInfo", FooLoginBean.DataDTO.class);
        if(loginInfo.getToken()!=null && loginInfo.getToken().length()>0){
            HashMap<String, String> heads = new HashMap<>();

            heads.put("X-Nideshop-Token",loginInfo.getToken());
            imode.refreshToken(ConUrl.TokeUrl, null, heads, new CallBack<FooTokeBean>() {
                @Override
                public void OnSuucessHome(FooTokeBean fooTokeBean) {

                }

                @Override
                public void OnSuucess(String err) {

                }

                @Override
                public void OnSuucessColl(FooTokeBean fooTokeBean) {

                }

                @Override
                public void OnSuucessTab(FooTokeBean fooTokeBean) {

                }

                @Override
                public void OnSuucessClassfiy(FooTokeBean fooTokeBean) {

                }

                @Override
                public void OnSuucessUserToke(FooTokeBean fooTokeBean) {

                    if(fooTokeBean.getErrno() == 0){
                        loginInfo.setToken(fooTokeBean.getData());
                        mmkv.encode("loginInfo",loginInfo);
                    }
                }

                @Override
                public void OnSuucessShopping(FooTokeBean fooTokeBean) {

                }

                @Override
                public void OnSuucessHomeClick(FooTokeBean fooTokeBean) {

                }

                @Override
                public void OnSuucessHomeSpXq(FooTokeBean fooTokeBean) {

                }

                @Override
                public void OnSuucessGWC(FooTokeBean fooTokeBean) {

                }

                @Override
                public void OnLogin(FooTokeBean fooTokeBean) {

                }
            });
        }

    }
}
