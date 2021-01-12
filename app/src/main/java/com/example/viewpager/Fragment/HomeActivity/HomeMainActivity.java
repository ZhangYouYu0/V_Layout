package com.example.viewpager.Fragment.HomeActivity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

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
import com.example.viewpager.Fragment.HomeActivity.HomeChildFragment.HomeChildeBlankFragment;
import com.example.viewpager.P.ImPresenter;
import com.example.viewpager.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class HomeMainActivity extends BaseActivity<ImPresenter>  implements C.View {


    private ViewPager viewpager;
    private TabLayout tablayout;
    private int id1;

    @Override
    protected int ID() {
        return R.layout.activity_home_main;
    }

    @Override
    protected void initData() {
    presenter.P1();
    }

    @Override
    protected void initView() {
        Intent intent = getIntent();
        id1 = intent.getIntExtra("id1", 0);
        // int id = intent.getIntExtra("id",0);
     //   Toast.makeText(this, id+"", Toast.LENGTH_SHORT).show();
        viewpager = findViewById(R.id.viewpager_home);
        tablayout = findViewById(R.id.Tablayout_home);
    }

    @Override
    protected ImPresenter add() {
        return new ImPresenter();
    }

    @Override
    public void OnSuucessHome(FooHomeBean i) {
        List<FooHomeBean.DataDTO.ChannelDTO> channel = i.getData().getChannel();
        ArrayList<Fragment> list = new ArrayList<>();
        for (int j = 0; j < channel.size(); j++) {
            HomeChildeBlankFragment homeChildeBlankFragment = new HomeChildeBlankFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("id",channel.get(j).getCategoryid());
//            bundle.putInt("id1",channel.get(j).getId());
            bundle.putString("name",channel.get(j).getName());
            homeChildeBlankFragment.setArguments(bundle);
            list.add(homeChildeBlankFragment);
        }



        viewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
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


        viewpager.setCurrentItem(id1-1);
        tablayout.setupWithViewPager(viewpager);
        for (int j = 0; j < channel.size(); j++) {
            tablayout.getTabAt(j).setText(channel.get(j).getName());
        }

//        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//             //   Toast.makeText(HomeMainActivity.this, "点1", Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//                for (int j = 0; j < channel.size(); j++) {
//                    if(tab.getText().toString().equals(channel.get(j).getName())){
//                        Toast.makeText(HomeMainActivity.this, channel.get(j).getId()+"0", Toast.LENGTH_SHORT).show();
//                    }
//                }
//
//                Toast.makeText(HomeMainActivity.this, "点2", Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//                Toast.makeText(HomeMainActivity.this, "点3", Toast.LENGTH_SHORT).show();
//            }
//        });

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
        Log.e("TAG", "OnErro: "+err );
    }
}