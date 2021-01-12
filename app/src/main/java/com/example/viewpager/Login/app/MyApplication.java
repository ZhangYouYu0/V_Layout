package com.example.viewpager.Login.app;

import android.app.Application;

import com.example.viewpager.Login.Bean.FooLoginBean;
import com.tencent.mmkv.MMKV;

public class MyApplication extends Application {

    public MyApplication application;

    public static FooLoginBean.DataDTO dataDTO;


    @Override
    public void onCreate() {
        super.onCreate();
        this.application = this;
        MMKV.initialize(this);
    }
}
