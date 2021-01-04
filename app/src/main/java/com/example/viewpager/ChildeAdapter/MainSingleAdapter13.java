package com.example.viewpager.ChildeAdapter;

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
import com.example.viewpager.R;

import java.util.ArrayList;

public class MainSingleAdapter13 extends DelegateAdapter.Adapter {
    ArrayList<String> list;
    SingleLayoutHelper singleLayoutHelper;
    Context context;

    public MainSingleAdapter13(ArrayList<String> list, SingleLayoutHelper singleLayoutHelper, Context context) {
        this.list = list;
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
        View root = LayoutInflater.from(context).inflate(R.layout.sl_item, parent, false);
        return new SinViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SinViewHolder sinViewHolder = (SinViewHolder) holder;
        String s = list.get(position);
        sinViewHolder.textView.setText("------------"+s+"分类------------");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class SinViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public SinViewHolder(View root) {
            super(root);
            textView=root.findViewById(R.id.tv_title);
        }
    }
}
