package com.example.viewpager.Login.Contract;

import com.example.mylibrary.Base.BaseMode;
import com.example.mylibrary.Base.BaseView;
import com.example.mylibrary.Utils.Net.One.CallBack;

import java.util.ArrayList;

public class C {
    public interface Mode extends BaseMode{

        <I> void Mode(ArrayList<String> list ,CallBack<I> callBack);

    }
    public interface Presenter  {

        void P(ArrayList<String> list);

    }
    public interface View extends BaseView {

        void OnCg();
        void OnFail(String err);

    }
}
