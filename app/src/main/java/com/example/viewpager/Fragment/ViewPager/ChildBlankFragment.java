package com.example.viewpager.Fragment.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
import com.example.viewpager.FooBean.FooTablayoutBean;
import com.example.viewpager.HomeAdapter.MainGridAdapter;
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

    @Override
    public int ID() {
        return R.layout.fragment_child_blank;
    }

    @Override
    protected void initView(View view) {
        recyclerview = view.findViewById(R.id.recyclerview_Chide);

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
    }

    @Override
    protected void initData() {
        int id = getArguments().getInt("id");
        Toast.makeText(getContext(), id+"", Toast.LENGTH_SHORT).show();
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


        List<FooClassfiyBean.DataDTO.CurrentCategoryDTO.SubCategoryListDTO> subCategoryList1 = c.getData().getCurrentCategory().getSubCategoryList();
        subCategoryListDTOS.addAll(subCategoryList1);
        mainGridAdapter9.notifyDataSetChanged();
    }

    @Override
    public void OnErro(String err) {
        Log.e("TAG", "OnErro: "+err);
    }
}