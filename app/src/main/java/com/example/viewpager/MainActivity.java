package com.example.viewpager;

import androidx.fragment.app.FragmentTransaction;

import android.widget.LinearLayout;
import android.widget.RadioGroup;

import com.example.mylibrary.Base.BaseActivity;
import com.example.viewpager.Contract.C;
import com.example.viewpager.Fragment.CollBlankFragment;
import com.example.viewpager.Fragment.HomeBlankFragment;
import com.example.viewpager.ImPresenter.Presenter;

public class MainActivity  extends BaseActivity<Presenter> implements C.View {

    HomeBlankFragment homeBlankFragment;
    CollBlankFragment collBlankFragment;
    RadioGroup mrg;
    LinearLayout ll;

    @Override
    protected int ID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        homeBlankFragment = new HomeBlankFragment();
        collBlankFragment = new CollBlankFragment();
        FragmentTransaction supportFragmentManager = getSupportFragmentManager().beginTransaction();
        supportFragmentManager.add(R.id.bnt_ll,homeBlankFragment)
                .add(R.id.bnt_ll,collBlankFragment)
                .show(homeBlankFragment)
                .hide(collBlankFragment)
                .commit();
    }

    @Override
    protected void initView() {
        ll = findViewById(R.id.bnt_ll);
        mrg = findViewById(R.id.rg);
        mrg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                switch (checkedId){
                    case R.id.rb1:
                        fragmentTransaction.show(homeBlankFragment).hide(collBlankFragment).commit();
                        // Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb2:
                        // Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                        fragmentTransaction.show(collBlankFragment).hide(homeBlankFragment).commit();
                        break;

                    case R.id.rb3:
                        // Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                        fragmentTransaction.show(collBlankFragment).hide(homeBlankFragment).commit();
                        break;


                    case R.id.rb4:
                        // Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                        fragmentTransaction.show(collBlankFragment).hide(homeBlankFragment).commit();
                        break;


                    case R.id.rb5:
                        // Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                        fragmentTransaction.show(collBlankFragment).hide(homeBlankFragment).commit();
                        break;
                }
            }
        });
    }



    @Override
    protected Presenter add() {
        return new Presenter();
    }

    @Override
    public void OnSuucess(Object o) {
        
    }

    @Override
    public void OnErro(String err) {

    }
}