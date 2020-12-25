package com.example.viewpager.Contract;

import com.example.mylibrary.Base.BaseMode;
import com.example.mylibrary.Base.BaseView;
import com.example.mylibrary.Utils.Net.CallBack;

public abstract class C {


    public interface Mode extends BaseMode {
         <I> void Inface(String url, CallBack<I> callBack);
    }

    public interface Presenter {
        void P();
    }

    public interface View<I> extends BaseView{
        void OnSuucess(I i);
        void OnErro(String err);
    }
}
