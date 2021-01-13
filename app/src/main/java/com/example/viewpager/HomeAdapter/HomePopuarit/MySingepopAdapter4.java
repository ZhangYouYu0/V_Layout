package com.example.viewpager.HomeAdapter.HomePopuarit;

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
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.bumptech.glide.Glide;
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.R;

import java.util.ArrayList;

public class MySingepopAdapter4 extends DelegateAdapter.Adapter {
    SingleLayoutHelper singleLayoutHelper;
    Context context;
    ArrayList<FooSpBean.DataBeanx.CommentBean> list;

    public MySingepopAdapter4(SingleLayoutHelper singleLayoutHelper, Context context, ArrayList<FooSpBean.DataBeanx.CommentBean> list) {
        this.singleLayoutHelper = singleLayoutHelper;
        this.context = context;
        this.list = list;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return singleLayoutHelper;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.pl_item, parent, false);
        return new VIewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        FooSpBean.DataBeanx.CommentBean commentBean = list.get(position);
        VIewHolder vIewHolder = (VIewHolder) holder;
        vIewHolder.name.setText(commentBean.getData().getNickname());
        vIewHolder.desc.setText(commentBean.getData().getContent());
        vIewHolder.time.setText(commentBean.getData().getAdd_time());
        Glide.with(context).load(commentBean.getData().getAvatar()).into(vIewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class VIewHolder extends RecyclerView.ViewHolder {
        TextView pl;
        TextView name;
        TextView desc;
        TextView time;
        ImageView imageView;
        public VIewHolder(View root) {
            super(root);
            pl=root.findViewById(R.id.tv_pl);
            name=root.findViewById(R.id.tv_user_name);
            desc=root.findViewById(R.id.tv_user_desc);
            time=root.findViewById(R.id.tv_user_title);
            imageView=root.findViewById(R.id.im_user);
        }
    }
}
