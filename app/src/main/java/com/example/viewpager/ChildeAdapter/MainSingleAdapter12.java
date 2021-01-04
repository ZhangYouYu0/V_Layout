package com.example.viewpager.ChildeAdapter;

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
import com.example.viewpager.FooBean.FooClassfiyBean;
import com.example.viewpager.R;

import java.util.ArrayList;

public class MainSingleAdapter12 extends DelegateAdapter.Adapter {
    ArrayList<FooClassfiyBean.DataDTO.CurrentCategoryDTO> list;

    SingleLayoutHelper singleLayoutHelper;

    Context context;

    public MainSingleAdapter12(ArrayList<FooClassfiyBean.DataDTO.CurrentCategoryDTO> list, SingleLayoutHelper singleLayoutHelper, Context context) {
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
        View root = LayoutInflater.from(context).inflate(R.layout.sl3_item, parent, false);
        return new SlViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SlViewHolder slViewHolder = (SlViewHolder) holder;
        FooClassfiyBean.DataDTO.CurrentCategoryDTO subCategoryListDTO = list.get(position);
        slViewHolder.textView.setText(subCategoryListDTO.getFront_name());
        Glide.with(context).load(subCategoryListDTO.getWap_banner_url()).into(slViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class SlViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public SlViewHolder(View root) {
            super(root);
            imageView=root.findViewById(R.id.image4);
            textView=root.findViewById(R.id.tv_name_text5);
        }
    }
}
