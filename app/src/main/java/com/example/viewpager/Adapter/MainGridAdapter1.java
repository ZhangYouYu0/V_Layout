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

public class MainGridAdapter1 extends DelegateAdapter.Adapter {
    GridLayoutHelper gridLayoutHelper;
    Context context;
    ArrayList<FooHomeBean.DataDTO.BrandListDTO> list;

    public MainGridAdapter1(GridLayoutHelper gridLayoutHelper, Context context, ArrayList<FooHomeBean.DataDTO.BrandListDTO> list) {
        this.gridLayoutHelper = gridLayoutHelper;
        this.context = context;
        this.list = list;
    }

    private static final int TYPE_Y=0;
    private static final int TYPE_E=1;
    @Override
    public int getItemViewType(int position) {
       if(TYPE_Y==0){
           return TYPE_Y;
       }else{
           return TYPE_E;
       }
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return gridLayoutHelper;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType==0){
            View root = LayoutInflater.from(context).inflate(R.layout.gr_item, parent, false);
            return new YViewHolder(root);
        }else{
            View root = LayoutInflater.from(context).inflate(R.layout.gr1_item, parent, false);
            return new EViewHolder(root);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int itemViewType = getItemViewType(position);
        switch (itemViewType){
            case 0:
                FooHomeBean.DataDTO.BrandListDTO brandListDTO = list.get(position);
                YViewHolder yViewHolder = (YViewHolder) holder;
                Glide.with(context).load(brandListDTO.getPic_url()).into(yViewHolder.imageView);
                yViewHolder.textView.setText(brandListDTO.getName());
                yViewHolder.textView1.setText(brandListDTO.getFloor_price()+"元起");
                break;
            case 1:
//                FooHomeBean.DataDTO.BrandListDTO brandListDTO1 = list.get(position);
//                EViewHolder eViewHolder = (EViewHolder) holder;
//                Glide.with(context).load(brandListDTO1.getPic_url()).into(eViewHolder.imageView);
//                eViewHolder.textView.setText(brandListDTO1.getName());
//                eViewHolder.textView1.setText(brandListDTO1.getFloor_price()+"元起");
                break;
        }
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
            imageView=root.findViewById(R.id.image_view);
            textView=root.findViewById(R.id.tv_name_text);
            textView1=root.findViewById(R.id.tv_desc);
        }
    }

    private class EViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        TextView textView1;
        public EViewHolder(View root) {
            super(root);
            imageView=root.findViewById(R.id.image_view1);
            textView=root.findViewById(R.id.tv_name_text1);
            textView1=root.findViewById(R.id.tv_desc1);
        }
    }
}
