package com.example.viewpager.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.bumptech.glide.Glide;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.R;

import java.util.ArrayList;

public class MainGridAdapter7 extends DelegateAdapter.Adapter {
    GridLayoutHelper gridLayoutHelper;
    ArrayList<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> list;
    Context context;

    public MainGridAdapter7(GridLayoutHelper gridLayoutHelper, ArrayList<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> list, Context context) {
        this.gridLayoutHelper = gridLayoutHelper;
        this.list = list;
        this.context = context;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return gridLayoutHelper;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.sl2_item, parent, false);
        return new GridViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        GridViewHolder gridViewHolder = (GridViewHolder) holder;
        FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO goodsListDTO = list.get(position);
        gridViewHolder.textView.setText(goodsListDTO.getName());
        gridViewHolder.textView1.setText("￥"+goodsListDTO.getRetail_price());
        Glide.with(context).load(goodsListDTO.getList_pic_url()).into(gridViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        TextView textView1;
        public GridViewHolder(View root) {
            super(root);
            imageView=root.findViewById(R.id.image_view00);
            textView=root.findViewById(R.id.tv_name_text00);
            textView1=root.findViewById(R.id.tv_name_text000);
        }
    }
}
