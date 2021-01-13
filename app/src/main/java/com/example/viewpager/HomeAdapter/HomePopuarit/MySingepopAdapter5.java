package com.example.viewpager.HomeAdapter.HomePopuarit;

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

public class MySingepopAdapter5 extends DelegateAdapter.Adapter {
    SingleLayoutHelper singleLayoutHelper;
    Context context;
    ArrayList<FooSpBean.DataBeanx.AttributeBean> list;

    public MySingepopAdapter5(SingleLayoutHelper singleLayoutHelper, Context context, ArrayList<FooSpBean.DataBeanx.AttributeBean> list) {
        this.singleLayoutHelper = singleLayoutHelper;
        this.context = context;
        this.list = list;
    }

    public MySingepopAdapter5(SingleLayoutHelper singleLayoutHelper, Context context) {
        this.singleLayoutHelper = singleLayoutHelper;
        this.context = context;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return singleLayoutHelper;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.cs_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        FooSpBean.DataBeanx.AttributeBean attributeBean = list.get(position);
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.cc.setText(attributeBean.getName());
        viewHolder.zl.setText(attributeBean.getValue());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder {
        TextView cc;
        TextView zl;
        public ViewHolder(View root) {
            super(root);
            cc=root.findViewById(R.id.home_ac_cc);
            zl=root.findViewById(R.id.home_ac_zl);
        }
    }
}
