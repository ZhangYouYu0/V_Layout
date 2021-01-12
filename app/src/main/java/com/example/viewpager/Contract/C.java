package com.example.viewpager.Contract;

import com.example.mylibrary.Base.BaseMode;
import com.example.mylibrary.Base.BaseView;
import com.example.mylibrary.Utils.Net.One.CallBack;
import com.example.viewpager.FooBean.Bean;
import com.example.viewpager.FooBean.FooClassfiyBean;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.FooBean.FooHomeClickBean;
import com.example.viewpager.FooBean.FooShoppingBean;
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.FooBean.FooTablayoutBean;
import com.example.viewpager.FooBean.XqBean;

public  class C {


    public interface Mode extends BaseMode {
         <I> void Next1(String url, CallBack<I> callBack);
         <I> void Next2(int id, CallBack<I> callBack);
         <I> void Next3(String url, CallBack<I> callBack);
         <I> void Next4(int id, CallBack<I> callBack);
         <I> void Next5(String url, CallBack<I> callBack);
         <I> void Next5(int categoryId, CallBack<I> callBack);
         <I> void Next7(int id, CallBack<I> callBack);
         <I> void Next8(int id, CallBack<I> callBack);
    }

    public interface Presenter {
        void P1();
        void P2(int i);
        void P3();
        void P4(int id);
        void P5();
        void P6(int categoryId);
        void P7(int id);
        void P8(int id);
    }

    public interface View extends BaseView{
        void OnSuucessHome(FooHomeBean i);
        void OnSuucessColl(Bean i);
        void OnSuucessTab(FooTablayoutBean f);
        void OnSuucessClassfiy(FooClassfiyBean c);
        void OnSuucessShooping(FooShoppingBean s);
        void OnSuucessHomeClick(FooHomeClickBean c);
        void OnSuucessHomeSpxq(FooSpBean c);
        void OnSuucessHomeGwc(XqBean xqBean);
        void OnErro(String err);
    }
}
