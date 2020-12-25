package com.example.viewpager.Adapter;

import android.content.Context;
import android.text.Html;
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

public class MainGridAdapter2 extends DelegateAdapter.Adapter {
    GridLayoutHelper gridLayoutHelper;
    Context context;
    ArrayList<FooHomeBean.DataDTO.NewGoodsListDTO> list;

    public MainGridAdapter2(GridLayoutHelper gridLayoutHelper, Context context, ArrayList<FooHomeBean.DataDTO.NewGoodsListDTO> list) {
        this.gridLayoutHelper = gridLayoutHelper;
        this.context = context;
        this.list = list;
    }

    public MainGridAdapter2(GridLayoutHelper gridLayoutHelper, Context context) {
        this.gridLayoutHelper = gridLayoutHelper;
        this.context = context;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return gridLayoutHelper;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.gr2_item, parent, false);
        return new YViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        FooHomeBean.DataDTO.NewGoodsListDTO newGoodsListDTO = list.get(position);
        YViewHolder yViewHolder = (YViewHolder) holder;
        yViewHolder.textView.setText(newGoodsListDTO.getName());
        yViewHolder.textView1.setText("￥"+ Html.fromHtml(""+newGoodsListDTO.getRetail_price()+""));
        Glide.with(context).load(newGoodsListDTO.getList_pic_url()).into(yViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class YViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        TextView textView1;
        public YViewHolder(View root) {
            super(root);
            imageView=root.findViewById(R.id.image_view2);
            textView=root.findViewById(R.id.tv_name_text2);
            textView1=root.findViewById(R.id.tv_name_text3);
        }
    }
}
