package com.example.viewpager.Fragment.ClassfiyChild;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

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
import com.example.viewpager.HomeAdapter.HomeChidelAdapter.MyHomeChildeAdapter;
import com.example.viewpager.P.ImPresenter;
import com.example.viewpager.R;

import java.util.ArrayList;
import java.util.List;


public class ClassChilBlankFragment extends BaseFragment<ImPresenter> implements C.View {


    private RecyclerView recyclerview;
    private ArrayList<FooHomeClickBean.DataDTO.DataDTOX> list;
    private MyHomeChildeAdapter myHomeChildeAdapter;
    private TextView title;
    private int id;

    @Override
    public int ID() {
        return R.layout.fragment_class_chil_blank;
    }

    @Override
    protected void initView(View view) {

        Bundle arguments = getArguments();
        id = arguments.getInt("id", 0);
        String name = arguments.getString("title");


        title = view.findViewById(R.id.tv_classfiy_child_title);
        recyclerview = view.findViewById(R.id.recyclerview_classfiy);
        recyclerview.setLayoutManager(new GridLayoutManager(getActivity(),2));

        title.setText(name);

        list = new ArrayList<>();
        myHomeChildeAdapter = new MyHomeChildeAdapter(getActivity(),list);
        recyclerview.setAdapter(myHomeChildeAdapter);
    }

    @Override
    protected void initData() {

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

    }
}