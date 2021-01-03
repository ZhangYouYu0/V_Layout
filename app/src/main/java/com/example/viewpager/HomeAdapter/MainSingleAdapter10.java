package com.example.viewpager.HomeAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.R;

import java.util.ArrayList;

public class MainSingleAdapter10 extends DelegateAdapter.Adapter {
    SingleLayoutHelper singleLayoutHelper;
    ArrayList<FooHomeBean.DataDTO.CategoryListDTO> list;
    Context context;

    public MainSingleAdapter10(SingleLayoutHelper singleLayoutHelper, ArrayList<FooHomeBean.DataDTO.CategoryListDTO> list, Context context) {
        this.singleLayoutHelper = singleLayoutHelper;
        this.list = list;
        this.context = context;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return singleLayoutHelper;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.sl1_item, parent, false);
        return new GridViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        GridViewHolder gridViewHolder = (GridViewHolder) holder;
        FooHomeBean.DataDTO.CategoryListDTO categoryListDTO = list.get(position);
        gridViewHolder.textView.setText(categoryListDTO.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class GridViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public GridViewHolder(View root) {
            super(root);
            textView =root.findViewById(R.id.tv_title1);
        }
    }
}
