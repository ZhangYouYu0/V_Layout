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
import com.example.viewpager.R;

public class  MainSingleAdapter3 extends DelegateAdapter.Adapter {
    SingleLayoutHelper singleLayoutHelpe;
    Context context;

    public MainSingleAdapter3(SingleLayoutHelper singleLayoutHelpe, Context context) {
        this.singleLayoutHelpe = singleLayoutHelpe;
        this.context = context;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return singleLayoutHelpe;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.sl1_item, parent, false);
        return new ImViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ImViewHolder imViewHolder = (ImViewHolder) holder;
        imViewHolder.textView.setText("周一周四,新品首发");
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    private class ImViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ImViewHolder(View root) {
            super(root);
            textView=root.findViewById(R.id.tv_title1);
        }
    }
}
