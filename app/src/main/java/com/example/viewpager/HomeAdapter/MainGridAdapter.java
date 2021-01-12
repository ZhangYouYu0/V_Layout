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
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.bumptech.glide.Glide;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.R;

import java.util.ArrayList;

public class MainGridAdapter extends DelegateAdapter.Adapter {
    GridLayoutHelper singleLayoutHelper;
    Context context;
    ArrayList<FooHomeBean.DataDTO.ChannelDTO> list;

    public MainGridAdapter(GridLayoutHelper singleLayoutHelper, Context context, ArrayList<FooHomeBean.DataDTO.ChannelDTO> list) {
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
        View root = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        return new GridViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        FooHomeBean.DataDTO.ChannelDTO channelDTO = list.get(position);
        GridViewHolder gridLayoutHelper = (GridViewHolder) holder;
        Glide.with(context).load(channelDTO.getIcon_url()).into(gridLayoutHelper.imageView);
        gridLayoutHelper.textView.setText(channelDTO.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onClickItem!=null){
                    Integer categoryid = channelDTO.getCategoryid();
                    onClickItem.ItemId(categoryid,channelDTO.getId());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public interface OnClickItem{
        void ItemId(int categoryId,int id);
    }
    OnClickItem onClickItem;

    public void setOnClickItem(OnClickItem onClickItem) {
        this.onClickItem = onClickItem;
    }

    private class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public GridViewHolder(View root) {
            super(root);
            imageView=root.findViewById(R.id.image1);
            textView=root.findViewById(R.id.tv_name);
        }
    }
}
