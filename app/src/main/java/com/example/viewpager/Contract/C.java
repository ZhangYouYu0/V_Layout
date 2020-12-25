package com.example.viewpager.Contract;

import com.example.mylibrary.Base.BaseMode;
import com.example.mylibrary.Base.BaseView;
import com.example.mylibrary.Utils.Net.CallBack;
import com.example.viewpager.FooBean.FooHomeBean;

public abstract class C {


    public interface Mode extends BaseMode {
         <I> void Inface(String url, CallBack<I> callBack);
    }

    public interface Presenter {
        void P1();
        void P2();
    }

    public interface View extends BaseView{
        void OnSuucess(FooHomeBean i);
        void OnErro(String err);
    }
}
