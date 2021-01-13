package com.example.viewpager.HomeAdapter.HomePopuarit;

import android.app.slice.Slice;
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
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.R;

import java.util.ArrayList;

public class MySingepopAdapter2 extends DelegateAdapter.Adapter {
    SingleLayoutHelper singleLayoutHelper;
    ArrayList<FooSpBean.DataBeanx.InfoBean> list;
    Context context;

    public MySingepopAdapter2(SingleLayoutHelper singleLayoutHelper, ArrayList<FooSpBean.DataBeanx.InfoBean> list, Context context) {
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
        View root = LayoutInflater.from(context).inflate(R.layout.name_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        FooSpBean.DataBeanx.InfoBean infoBean = list.get(position);
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.name.setText(infoBean.getName());
        viewHolder.desc.setText(infoBean.getGoods_brief());
        viewHolder.pic.setText("￥"+infoBean.getRetail_price());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView desc;
        TextView pic;
        public ViewHolder(View root) {
            super(root);
            name=root.findViewById(R.id.home_ac_name);
            desc=root.findViewById(R.id.home_ac_desc);
            pic=root.findViewById(R.id.home_ac_pic);
        }
    }
}
