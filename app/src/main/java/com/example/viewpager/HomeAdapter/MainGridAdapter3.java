package com.example.viewpager.HomeAdapter;

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

public class MainGridAdapter3 extends DelegateAdapter.Adapter {
    GridLayoutHelper gridLayoutHelper;
    ArrayList<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> list;
    Context context;

    public MainGridAdapter3(GridLayoutHelper gridLayoutHelper, ArrayList<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> list, Context context) {
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
        View inflate = LayoutInflater.from(context).inflate(R.layout.gr2_item, parent, false);
        return new GirdViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        GirdViewHolder girdViewHolder = (GirdViewHolder) holder;
        FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO goodsListDTO = list.get(position);
        girdViewHolder.textView.setText(goodsListDTO.getName());
        girdViewHolder.textView1.setText("￥"+goodsListDTO.getRetail_price());
        Glide.with(context).load(goodsListDTO.getList_pic_url()).into(girdViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class GirdViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView1;
        ImageView imageView;
        public GirdViewHolder(View inflate) {
            super(inflate);
            imageView=inflate.findViewById(R.id.image_view2);
            textView =inflate.findViewById(R.id.tv_name_text2);
            textView1 =inflate.findViewById(R.id.tv_name_text3);
        }
    }
}
