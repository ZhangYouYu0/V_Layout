package com.example.viewpager.Contract;

import com.example.mylibrary.Base.BaseMode;
import com.example.mylibrary.Base.BaseView;
import com.example.mylibrary.Utils.Net.CallBack;
import com.example.viewpager.FooBean.Bean;
import com.example.viewpager.FooBean.FooCollBean;
import com.example.viewpager.FooBean.FooHomeBean;

public  class C {


    public interface Mode extends BaseMode {
         <I> void Next(String url, CallBack<I> callBack);
         <I> void Next1(int id,CallBack<I> callBack);
    }

    public interface Presenter {
        void P1();
        void P2(int i);
        //void P2(int id);
    }

    public interface View extends BaseView{
        void OnSuucessHome(FooHomeBean i);
        void OnSuucessColl(Bean i);
        void OnErro(String err);
    }
}
