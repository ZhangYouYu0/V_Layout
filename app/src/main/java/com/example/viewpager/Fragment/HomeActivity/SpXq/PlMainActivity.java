package com.example.viewpager.Fragment.HomeActivity.SpXq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
import com.example.viewpager.HomeAdapter.HomeXq.MyUserAdapter;
import com.example.viewpager.P.ImPresenter;
import com.example.viewpager.R;

import java.util.ArrayList;

public class PlMainActivity extends BaseActivity<ImPresenter> implements C.View {

    private int id;
    private RecyclerView recyclerview;
    private TextView textSize;
    private ArrayList<FooSpBean.DataBeanx.CommentBean.DataBean> userdata;
    private MyUserAdapter myUserAdapter;

    @Override
    protected int ID() {
        return R.layout.activity_pl_main;
    }

    @Override
    protected void initData() {
    presenter.P7(id);
    }

    @Override
    protected void initView() {
        Intent intent = getIntent();
        id = intent.getIntExtra("id", 0);

        textSize = findViewById(R.id.tv_home_usepl);
        recyclerview = findViewById(R.id.rl_home_user);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        userdata = new ArrayList<>();
        myUserAdapter = new MyUserAdapter(userdata,this);
        recyclerview.setAdapter(myUserAdapter);

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
        FooSpBean.DataBeanx.CommentBean.DataBean data = c.getData().getComment().getData();
        Toast.makeText(this, data.getContent()+"", Toast.LENGTH_SHORT).show();
        userdata.add(data);
        myUserAdapter.notifyDataSetChanged();

    }

    @Override
    public void OnSuucessHomeGwc(XqBean xqBean) {

    }

    @Override
    public void OnErro(String err) {

    }
}