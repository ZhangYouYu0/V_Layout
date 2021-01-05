package com.example.viewpager.Login.View;

import com.example.mylibrary.Base.BaseActivity;
import com.example.viewpager.Login.Contract.StartContract.C;
import com.example.viewpager.Login.Prsenter.StartPresenter.StartPresneter;
import com.example.viewpager.R;

public class StartMainActivity extends BaseActivity<StartPresneter> implements C.StartView {


    @Override
    protected int ID() {
        return R.layout.activity_start_main;
    }

    @Override
    protected void initData() {
        presenter.startpresenter();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected StartPresneter add() {
        return new StartPresneter();
    }

    @Override
    public void tokenRefreshSuccess() {

    }

    @Override
    public void tokenInvalid() {

    }
}