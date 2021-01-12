package com.example.viewpager.HomeAdapter.HomeXq;

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
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.R;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

public class MySingleAdapter1 extends DelegateAdapter.Adapter {
    SingleLayoutHelper singleLayoutHelper;
    Context context;
    ArrayList<FooSpBean.DataBeanx.InfoBean> list;

    public MySingleAdapter1(SingleLayoutHelper singleLayoutHelper, Context context, ArrayList<FooSpBean.DataBeanx.InfoBean> list) {
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
        View root = LayoutInflater.from(context).inflate(R.layout.xq_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.banner.setImages(list)
                .setImageLoader(new ImageLoader() {
                    @Override
                    public void displayImage(Context context, Object path, ImageView imageView) {
                        FooSpBean.DataBeanx.InfoBean infoBean = (FooSpBean.DataBeanx.InfoBean) path;
                        Glide.with(context).load(infoBean.getList_pic_url()).into(imageView);
                    }
                }).start();

        FooSpBean.DataBeanx.InfoBean infoBean = list.get(position);
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
        Banner banner;
        public ViewHolder(View root) {
            super(root);
            banner=root.findViewById(R.id.banner_home_spxq);
            name=root.findViewById(R.id.tv_home_spxq_name);
            desc=root.findViewById(R.id.tv_home_spxq_desc);
            pic=root.findViewById(R.id.tv_home_spxq_pic);
        }
    }
}
