package com.example.viewpager.TwoPresenter;

import android.view.View;

import com.example.mylibrary.Base.BasePresenter;
import com.example.mylibrary.Utils.Net.Two.CallBack1;
import com.example.viewpager.Ca.CallBack0;
import com.example.viewpager.Contract.C;
import com.example.viewpager.Contract.C1;
import com.example.viewpager.FooBean.FooAddShoppingBean;
import com.example.viewpager.FooBean.FooGwcBean;
import com.example.viewpager.TwoMode.TwoMode;
import com.example.viewpager.TwoView.TwoView;

public class TwoPresenter implements Presenter0, CallBack0 {


    private static TwoView twoView;
    private final TwoMode twoMode;

    public TwoPresenter(TwoView twoView) {
        this.twoMode = new TwoMode();
        this.twoView=twoView;
    }


    @Override
    public void p0(int goodsId, int number, int productId) {
        twoMode.Mode1(goodsId,number,productId,this);
    }

    @Override
    public void Data(FooGwcBean fooGwcBean) {
        twoView.Data(fooGwcBean);
    }

    @Override
    public void Err(String e) {
    twoView.Err(e);
    }


//    @Override
//    public void P1(int goodsId, int number, int productId) {
//       // twoMode.Next(goodsId,number,productId);
////        imode.Next(goodsId, number, productId, new CallBack1<FooAddShoppingBean>() {
////            @Override
////            public void Data(FooAddShoppingBean fooAddShoppingBean) {
////                iview.Cg(fooAddShoppingBean);
////            }
////
////            @Override
////            public void Err(String e) {
////                iview.Sb(e);
////            }
////        });
//
//
//    }
}
