package com.example.viewpager.ImPresenter;

import com.example.mylibrary.Base.BasePresenter;
import com.example.viewpager.Contract.C;
import com.example.viewpager.ImMode.Model;

public class Presenter extends BasePresenter<C.View,C.Mode> implements C.Presenter {

    @Override
    public void P() {

    }

    @Override
    public C.Mode setImode() {
        return new Model(this);
    }
}
