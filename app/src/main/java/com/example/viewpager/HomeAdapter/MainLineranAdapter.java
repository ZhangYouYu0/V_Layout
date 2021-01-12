package com.example.viewpager.HomeAdapter;

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
import com.alibaba.android.vlayout.layout.LinearLayoutHelper;
import com.bumptech.glide.Glide;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.R;

import java.util.ArrayList;

public class MainLineranAdapter extends DelegateAdapter.Adapter{
    //LinearLayoutManager gridLayoutHelper;
    LinearLayoutHelper linearLayoutHelper;
    Context context;
    ArrayList<FooHomeBean.DataDTO.HotGoodsListDTO> list;

    public MainLineranAdapter(LinearLayoutHelper gridLayoutHelper, Context context, ArrayList<FooHomeBean.DataDTO.HotGoodsListDTO> list) {
        this.linearLayoutHelper = gridLayoutHelper;
        this.context = context;
        this.list = list;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return linearLayoutHelper;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.gr3_item, parent, false);
        return new ImViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ImViewHolder imViewHolder = (ImViewHolder) holder;
        FooHomeBean.DataDTO.HotGoodsListDTO hotGoodsListDTO = list.get(position);
        imViewHolder.textView.setText(hotGoodsListDTO.getName());
        imViewHolder.textView1.setText(hotGoodsListDTO.getGoods_brief());
        imViewHolder.textView2.setText("￥"+hotGoodsListDTO.getRetail_price());
        Glide.with(context).load(hotGoodsListDTO.getList_pic_url()).into(imViewHolder.imageView);
        imViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dj!=null){
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

    public void setDj(MainLineranAdapter.dj dj) {
        this.dj = dj;
    }

    private class ImViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        TextView textView1;
        TextView textView2;
        public ImViewHolder(View root) {
            super(root);
            imageView=root.findViewById(R.id.image_view3);
            textView=root.findViewById(R.id.tv_name_text4);
            textView1=root.findViewById(R.id.tv_desc2);
            textView2=root.findViewById(R.id.tv_pic);
        }
    }
}
