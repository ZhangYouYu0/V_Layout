package com.example.viewpager.Fragment.HomeActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mylibrary.Base.BaseActivity;
import com.example.viewpager.Contract.C;
import com.example.viewpager.FooBean.Bean;
import com.example.viewpager.FooBean.FooClassfiyBean;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.FooBean.FooHomeClickBean;
import com.example.viewpager.FooBean.FooShoppingBean;
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.FooBean.FooTablayoutBean;
import com.example.viewpager.FooBean.XqBean;
import com.example.viewpager.HomeAdapter.HomeClickAdapter.MyHomeClickAdapter;
import com.example.viewpager.P.ImPresenter;
import com.example.viewpager.R;

import java.util.ArrayList;

public class HomeClickMainActivity extends BaseActivity<ImPresenter> implements C.View {


    private RecyclerView recyclerview;
    private MyHomeClickAdapter myHomeClickAdapter;

    @Override
    protected int ID() {
        return R.layout.activity_home_click_main;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String url = intent.getStringExtra("url");
        String desc = intent.getStringExtra("desc");
        recyclerview = findViewById(R.id.recyclerview_home_click);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        myHomeClickAdapter = new MyHomeClickAdapter(this,name,url,desc);
        recyclerview.setAdapter(myHomeClickAdapter);
        myHomeClickAdapter.notifyDataSetChanged();
    }

    @Override
    protected ImPresenter add() {
        return new ImPresenter();
    }

    @Override
    public void OnSuucessHome(FooHomeBean i) {

    }

    @Override
    public void OnSuucessColl(Bean i) {

    }

    @Override
    public void OnSuucessTab(FooTablayoutBean f) {

    }

    @Override
    public void OnSuucessClassfiy(FooClassfiyBean c) {

    }

    @Override
    public void OnSuucessShooping(FooShoppingBean s) {

    }

    @Override
    public void OnSuucessHomeClick(FooHomeClickBean c) {

    }

    @Override
    public void OnSuucessHomeSpxq(FooSpBean c) {

    }

    @Override
    public void OnSuucessHomeGwc(XqBean xqBean) {

    }

    @Override
    public void OnErro(String err) {

    }
}