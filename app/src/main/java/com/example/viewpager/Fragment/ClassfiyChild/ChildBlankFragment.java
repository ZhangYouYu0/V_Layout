package com.example.viewpager.Fragment.ClassfiyChild;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.example.mylibrary.Base.BaseFragment;
import com.example.viewpager.ChildeAdapter.MainGridAdapter9;
import com.example.viewpager.ChildeAdapter.MainSingleAdapter12;
import com.example.viewpager.ChildeAdapter.MainSingleAdapter13;
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

import java.util.ArrayList;
import java.util.List;


public class ChildBlankFragment extends BaseFragment<ImPresenter> implements C.View {


    private RecyclerView recyclerview;
    private ArrayList<FooClassfiyBean.DataDTO.CurrentCategoryDTO> list;
    private MainSingleAdapter12 mainSingleAdapter12;
    private ArrayList<FooClassfiyBean.DataDTO.CurrentCategoryDTO.SubCategoryListDTO> subCategoryListDTOS;
    private MainGridAdapter9 mainGridAdapter9;
    private ArrayList<String> strings;
    private MainSingleAdapter13 mainSingleAdapter13;
    private int id;
    private int index;

    @Override
    public int ID() {
        return R.layout.fragment_child_blank;
    }

    @Override
    protected void initView(View view) {
        recyclerview = view.findViewById(R.id.recyclerview_Chide);
        Bundle arguments = getArguments();
        id = arguments.getInt("id");
        index = arguments.getInt("index", 0);
        VirtualLayoutManager virtualLayoutManager = new VirtualLayoutManager(getContext());
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recyclerview.setRecycledViewPool(recycledViewPool);


        list = new ArrayList<>();
        SingleLayoutHelper singleLayoutHelper = new SingleLayoutHelper();
        mainSingleAdapter12 = new MainSingleAdapter12(list,singleLayoutHelper,getActivity());

        strings = new ArrayList<>();
        SingleLayoutHelper singleLayoutHelper1 = new SingleLayoutHelper();
        mainSingleAdapter13 = new MainSingleAdapter13(strings,singleLayoutHelper1,getActivity());

        subCategoryListDTOS = new ArrayList<>();
        GridLayoutHelper gridLayoutHelper = new GridLayoutHelper(3);
        mainGridAdapter9 = new MainGridAdapter9(subCategoryListDTOS,gridLayoutHelper,getActivity());

        DelegateAdapter delegateAdapter = new DelegateAdapter(virtualLayoutManager);
        delegateAdapter.addAdapter(mainSingleAdapter12);
        delegateAdapter.addAdapter(mainSingleAdapter13);
        delegateAdapter.addAdapter(mainGridAdapter9);
        recyclerview.setLayoutManager(virtualLayoutManager);
        recyclerview.setAdapter(delegateAdapter);
        initDj();
    }

    private void initDj() {

    }

    @Override
    protected void initData() {

     //   Toast.makeText(getContext(), id+"", Toast.LENGTH_SHORT).show();
        presenter.P4(id);
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
    //    Toast.makeText(getContext(), c.getData().getCurrentCategory().getSubCategoryList().get(0).getName()+"0000000000", Toast.LENGTH_SHORT).show();

        FooClassfiyBean.DataDTO.CurrentCategoryDTO currentCategory = c.getData().getCurrentCategory();
        list.add(currentCategory);
        mainSingleAdapter12.notifyDataSetChanged();

        String name = c.getData().getCurrentCategory().getName();
        strings.add(name);
        mainSingleAdapter13.notifyDataSetChanged();



        mainGridAdapter9.setDj(new MainGridAdapter9.dj() {
            @Override
            public void dj(int pos) {
                String front_name = c.getData().getCurrentCategory().getFront_name();
                Toast.makeText(getContext(), pos+"", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), ClassfiyMainActivity.class);
                intent.putExtra("id",index-1);
                intent.putExtra("title",front_name);
                startActivity(intent);
            }
        });

        List<FooClassfiyBean.DataDTO.CurrentCategoryDTO.SubCategoryListDTO> subCategoryList1 = c.getData().getCurrentCategory().getSubCategoryList();
        subCategoryListDTOS.addAll(subCategoryList1);
        mainGridAdapter9.notifyDataSetChanged();
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
        Log.e("TAG", "OnErro: "+err);
    }
}