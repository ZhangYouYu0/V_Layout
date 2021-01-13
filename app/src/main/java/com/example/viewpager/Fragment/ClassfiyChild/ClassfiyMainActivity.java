package com.example.viewpager.Fragment.ClassfiyChild;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

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
import com.example.viewpager.P.ImPresenter;
import com.example.viewpager.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class ClassfiyMainActivity extends BaseActivity<ImPresenter> implements C.View{


    private TabLayout tablayout;
    private ViewPager viewpagwe;
    private ArrayList<Fragment> list;
    private int id0;
    private Intent intent;
    private String title;

    @Override
    protected int ID() {
        return R.layout.activity_classfiy_main;
    }

    @Override
    protected void initData() {
    presenter.P3();
    }

    @Override
    protected void initView() {
        Intent intent = getIntent();
        id0 = intent.getIntExtra("id", 0);
        title = intent.getStringExtra("title");
        viewpagwe = findViewById(R.id.viewpager_classfiy);
         tablayout = findViewById(R.id.Tablayout_classfiy);
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


        List<FooTablayoutBean.DataDTO.CategoryListDTO> categoryList = f.getData().getCategoryList();
        list = new ArrayList<>();
        for (int i = 0; i < categoryList.size(); i++) {
            Integer id = categoryList.get(i).getId();
            ClassChilBlankFragment classChilBlankFragment = new ClassChilBlankFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("id",id);
            bundle.putString("title",categoryList.get(i).getFront_name());
            classChilBlankFragment.setArguments(bundle);
            list.add(classChilBlankFragment);
        }
        viewpagwe.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });

        viewpagwe.setCurrentItem(id0);
        tablayout.setupWithViewPager(viewpagwe);
        for (int i = 0; i < categoryList.size(); i++) {
            tablayout.getTabAt(i).setText(categoryList.get(i).getName());
        }
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