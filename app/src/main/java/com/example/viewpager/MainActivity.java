package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.viewpager.Fragment.CollBlankFragment;
import com.example.viewpager.Fragment.HomeBlankFragment;

public class MainActivity extends AppCompatActivity {

    HomeBlankFragment homeBlankFragment;
    CollBlankFragment collBlankFragment;
    RadioGroup mrg;
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         initView();
         initFragment();
    }

    private void initFragment() {
        homeBlankFragment = new HomeBlankFragment();
        collBlankFragment = new CollBlankFragment();
        FragmentTransaction supportFragmentManager = getSupportFragmentManager().beginTransaction();
        supportFragmentManager.add(R.id.bnt_ll,homeBlankFragment)
                .add(R.id.bnt_ll,collBlankFragment)
                .show(homeBlankFragment)
                .hide(collBlankFragment)
                .commit();

    }

    private void initView() {
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
}