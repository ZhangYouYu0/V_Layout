package com.example.viewpager.HomeAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.R;

import java.util.ArrayList;

public class MainSingleadapter14 extends DelegateAdapter.Adapter {
    ArrayList<FooHomeBean.DataDTO.TopicListDTO> list;
    Context context;
    SingleLayoutHelper singleLayoutHelper;

    public MainSingleadapter14(ArrayList<FooHomeBean.DataDTO.TopicListDTO> list, Context context, SingleLayoutHelper singleLayoutHelper) {
        this.list = list;
        this.context = context;
        this.singleLayoutHelper = singleLayoutHelper;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return singleLayoutHelper;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.sl4_item, parent, false);
        return new SlViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SlViewHolder slViewHolder = (SlViewHolder) holder;
        slViewHolder.recyclerView.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
        MyAdapter addpter = new MyAdapter(context, list);
        slViewHolder.recyclerView.setAdapter(addpter);
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    private class SlViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;
        public SlViewHolder(View root) {
            super(root);
            recyclerView=root.findViewById(R.id.recyclerview_hor);
        }
    }
}
