package com.example.viewpager.CollAdaoter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.LinearLayoutHelper;
import com.bumptech.glide.Glide;
import com.example.viewpager.FooBean.Bean;
import com.example.viewpager.FooBean.FooCollBean;
import com.example.viewpager.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainLinearAdapter1 extends DelegateAdapter.Adapter {
    Context context;
    ArrayList<Bean.DataBeanX.DataBean> list;
    LinearLayoutHelper linearLayoutHelper;

    public MainLinearAdapter1(Context context,   ArrayList<Bean.DataBeanX.DataBean> list, LinearLayoutHelper linearLayoutHelper) {
        this.context = context;
        this.list = list;
        this.linearLayoutHelper = linearLayoutHelper;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return linearLayoutHelper ;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.ll_item, parent, false);
        return new LinViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Bean.DataBeanX.DataBean dataDTO = list.get(position);
        LinViewHolder linViewHolder = (LinViewHolder) holder;
        linViewHolder.textView1.setText(dataDTO.getTitle());
        linViewHolder.textView2.setText(dataDTO.getPrice_info()+"￥");
        View root = LayoutInflater.from(context).inflate(R.layout.ll_item, null, false);
        TextView viewById = root.findViewById(R.id.tv123);
        Glide.with(context).load(dataDTO.getScene_pic_url()).into(linViewHolder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dj!=null){
                    dj.dj(position);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public interface dj{
        void dj(int pos);
    }
    dj dj;

    public void setDj(MainLinearAdapter1.dj dj) {
        this.dj = dj;
    }

    private class LinViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView1;
        TextView textView2;
        TextView textView3;
        public LinViewHolder(View root) {
            super(root);
            imageView=root.findViewById(R.id.image_Vp);
            textView1=root.findViewById(R.id.tv_Vp_title);
            textView2=root.findViewById(R.id.tv_Vp_pirce);
            textView3=root.findViewById(R.id.tv123);
        }
    }
}
