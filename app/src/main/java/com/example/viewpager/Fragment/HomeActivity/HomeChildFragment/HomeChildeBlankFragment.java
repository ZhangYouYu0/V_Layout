package com.example.viewpager.Fragment.HomeActivity.HomeChildFragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylibrary.Base.BaseFragment;
import com.example.viewpager.Contract.C;
import com.example.viewpager.FooBean.Bean;
import com.example.viewpager.FooBean.FooClassfiyBean;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.FooBean.FooHomeClickBean;
import com.example.viewpager.FooBean.FooShoppingBean;
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.FooBean.FooTablayoutBean;
import com.example.viewpager.FooBean.XqBean;
import com.example.viewpager.Fragment.HomeActivity.HomeChildFragment.Activity.HomeChileShoppingMainActivity;
import com.example.viewpager.HomeAdapter.HomeChidelAdapter.MyHomeChildeAdapter;
import com.example.viewpager.P.ImPresenter;
import com.example.viewpager.R;

import java.util.ArrayList;
import java.util.List;


public class HomeChildeBlankFragment extends BaseFragment<ImPresenter> implements C.View {


    private RecyclerView recyclerview;
    private ArrayList<FooHomeClickBean.DataDTO.DataDTOX> list;
    private MyHomeChildeAdapter myHomeChildeAdapter;
    private int id;
    private String name;

    @Override
    public int ID() {
        return R.layout.fragment_home_chide_blank;
    }

    @Override
    protected void initView(View view) {
        Bundle arguments = getArguments();
        name = arguments.getString("name");
        id = arguments.getInt("id");
        recyclerview = view.findViewById(R.id.recyclerview_home_childe);
        recyclerview.setLayoutManager(new GridLayoutManager(getActivity(),2));
        list = new ArrayList<>();
        myHomeChildeAdapter = new MyHomeChildeAdapter(getActivity(),list);
        recyclerview.setAdapter(myHomeChildeAdapter);
        initClickIten();
    }

    private void initClickIten() {
        myHomeChildeAdapter.setDj(new MyHomeChildeAdapter.dj() {
            @Override
            public void dj(int pos) {
                FooHomeClickBean.DataDTO.DataDTOX dataDTOX = list.get(pos);
                Intent intent = new Intent(getActivity(), HomeChileShoppingMainActivity.class);
                intent.putExtra("name",dataDTOX.getName());
                intent.putExtra("id",dataDTOX.getId());
                intent.putExtra("url",dataDTOX.getList_pic_url());
                intent.putExtra("pic",dataDTOX.getRetail_price());
                startActivity(intent);
            }
        });
    }

    @Override
    protected void initData() {
       // Toast.makeText(getActivity(), "P", Toast.LENGTH_SHORT).show();
        presenter.P6(id);
    }

    @Override
    public ImPresenter add() {
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
        List<FooHomeClickBean.DataDTO.DataDTOX> data = c.getData().getData();
        list.addAll(data);
        myHomeChildeAdapter.notifyDataSetChanged();
    }

    @Override
    public void OnSuucessHomeSpxq(FooSpBean c) {

    }

    @Override
    public void OnSuucessHomeGwc(XqBean xqBean) {

    }

    @Override
    public void OnErro(String err) {
      //  Toast.makeText(getActivity(), "失败", Toast.LENGTH_SHORT).show();
        Log.e("TAG", "OnErro:0000 "+err);
    }
}