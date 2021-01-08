package com.example.viewpager;

import androidx.fragment.app.FragmentTransaction;

import android.widget.LinearLayout;
import android.widget.RadioGroup;

import com.example.mylibrary.Base.BaseActivity;
import com.example.viewpager.Fragment.ClassfiyBlankFragment;
import com.example.viewpager.Fragment.CollBlankFragment;
import com.example.viewpager.Fragment.HomeBlankFragment;
import com.example.viewpager.Fragment.ShoppingBlankFragment;
import com.example.viewpager.Fragment.YouBlankFragment;
import com.example.viewpager.P.ImPresenter;

public class MainActivity  extends BaseActivity {

    HomeBlankFragment homeBlankFragment;
    CollBlankFragment collBlankFragment;
    RadioGroup mrg;
    LinearLayout ll;

    private ShoppingBlankFragment pageBlankFragment;
    private ClassfiyBlankFragment classfiyBlankFragment;
    private YouBlankFragment youBlankFragment;

    @Override
    protected int ID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        homeBlankFragment = new HomeBlankFragment();
        collBlankFragment = new CollBlankFragment();
        pageBlankFragment = new ShoppingBlankFragment();
        classfiyBlankFragment = new ClassfiyBlankFragment();
        youBlankFragment = new YouBlankFragment();
        FragmentTransaction supportFragmentManager = getSupportFragmentManager().beginTransaction();
        supportFragmentManager.add(R.id.bnt_ll,homeBlankFragment)
                .add(R.id.bnt_ll,collBlankFragment)
                .add(R.id.bnt_ll,pageBlankFragment)
                .add(R.id.bnt_ll,classfiyBlankFragment)
                .add(R.id.bnt_ll,youBlankFragment)
                .show(homeBlankFragment)
                .hide(collBlankFragment)
                .hide(pageBlankFragment)
                .hide(classfiyBlankFragment)
                .hide(youBlankFragment)
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
                        fragmentTransaction.show(homeBlankFragment).hide(collBlankFragment).hide(classfiyBlankFragment).hide(youBlankFragment).hide(pageBlankFragment).commit();
                        // Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb2:
                        // Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();

                        fragmentTransaction.show(collBlankFragment).hide(homeBlankFragment).hide(classfiyBlankFragment).hide(youBlankFragment).hide(pageBlankFragment).commit();



                        break;

                    case R.id.rb3:
                        // Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                        fragmentTransaction.show(classfiyBlankFragment).hide(collBlankFragment).hide(pageBlankFragment).hide(homeBlankFragment).hide(youBlankFragment).commit();
                        break;


                    case R.id.rb4:
                        // Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                        fragmentTransaction.show(pageBlankFragment).hide(collBlankFragment).hide(homeBlankFragment).hide(classfiyBlankFragment).hide(youBlankFragment).commit();
                        break;


                    case R.id.rb5:
                        fragmentTransaction.show(youBlankFragment).hide(collBlankFragment).hide(homeBlankFragment).hide(classfiyBlankFragment).hide(pageBlankFragment).commit();

                        break;
                }
            }
        });
    }



    @Override
    protected ImPresenter add() {
        return new ImPresenter();
    }

}