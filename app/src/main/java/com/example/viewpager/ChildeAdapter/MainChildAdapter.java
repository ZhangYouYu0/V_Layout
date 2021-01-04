package com.example.viewpager.ChildeAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MainChildAdapter extends FragmentPagerAdapter {
    private ArrayList<String> TabList;
    private ArrayList<Fragment> list;

    public MainChildAdapter(@NonNull FragmentManager fm, ArrayList<String> tabList, ArrayList<Fragment> list) {
        super(fm);
        this.TabList = tabList;
        this.list = list;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return TabList.get(position);
    }
}
