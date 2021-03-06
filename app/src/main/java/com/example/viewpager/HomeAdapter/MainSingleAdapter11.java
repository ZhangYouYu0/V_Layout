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
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.R;

import java.util.ArrayList;

public class MainSingleAdapter11 extends DelegateAdapter.Adapter {
    SingleLayoutHelper singleLayoutHelper;
    ArrayList<FooHomeBean.DataDTO.CategoryListDTO> list;
    Context context;

    public MainSingleAdapter11(SingleLayoutHelper singleLayoutHelper, ArrayList<FooHomeBean.DataDTO.CategoryListDTO> list, Context context) {
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
        View root = LayoutInflater.from(context).inflate(R.layout.sl1_item, parent, false);
        return new SingViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SingViewHolder singViewHolder = (SingViewHolder) holder;
        FooHomeBean.DataDTO.CategoryListDTO categoryListDTO = list.get(position);
        singViewHolder.textView.setText(categoryListDTO.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class SingViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public SingViewHolder(View root) {
            super(root);
            textView =root.findViewById(R.id.tv_title1);
        }
    }
}
