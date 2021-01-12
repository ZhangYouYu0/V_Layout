package com.example.viewpager.Contract;

import com.example.mylibrary.Base.BaseMode;
import com.example.mylibrary.Base.BaseView;
import com.example.mylibrary.Utils.Net.One.CallBack;
import com.example.mylibrary.Utils.Net.Two.CallBack1;

public class C1 {

    public interface Mode extends BaseMode {
       <I> void Next(int goodsId, int number, int productId, CallBack1<I> callBack);
    }


    public interface Presenter{
        void P1(int goodsId, int number, int productId);
    }

    public interface View extends BaseView {
        void Cg(Object o);
        void Sb(String err);
    }


}
