package com.example.viewpager.HomeAdapter.HomeXq;

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

public class MyGridApdater extends DelegateAdapter.Adapter {
    GridLayoutHelper gridLayoutHelper;
    ArrayList<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> list;
    Context context;

    public MyGridApdater(GridLayoutHelper gridLayoutHelper, ArrayList<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> list, Context context) {
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
        View root = LayoutInflater.from(context).inflate(R.layout.grid1_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO goodsListDTO = list.get(position);
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.name.setText(goodsListDTO.getName());
        viewHolder.pic.setText("￥"+goodsListDTO.getRetail_price());
        Glide.with(context).load(goodsListDTO.getList_pic_url()).into(viewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView pic;
        ImageView imageView;
        public ViewHolder(View root) {
            super(root);
            name=root.findViewById(R.id.tv_home_spxq_name1);
            pic=root.findViewById(R.id.tv_home_spxq_pic1);
            imageView=root.findViewById(R.id.im_home_spxq);
        }
    }
}
