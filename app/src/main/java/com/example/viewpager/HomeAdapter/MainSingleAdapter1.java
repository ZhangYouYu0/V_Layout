package com.example.viewpager.HomeAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.bumptech.glide.Glide;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.R;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

public class MainSingleAdapter1 extends DelegateAdapter.Adapter {
    SingleLayoutHelper singleLayoutHelper;
    Context context;
    ArrayList<FooHomeBean.DataDTO.BannerDTO> list;

    public MainSingleAdapter1(SingleLayoutHelper singleLayoutHelper, Context context, ArrayList<FooHomeBean.DataDTO.BannerDTO> list) {
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
        View root = LayoutInflater.from(context).inflate(R.layout.bann_item, parent, false);
        return new ImViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ImViewHolder viewHolder = (ImViewHolder) holder;
        viewHolder.banner.setImages(list)
                .setImageLoader(new ImageLoader() {
                    @Override
                    public void displayImage(Context context, Object path, ImageView imageView) {
                        FooHomeBean.DataDTO.BannerDTO f = (FooHomeBean.DataDTO.BannerDTO) path;
                        Glide.with(context).load(f.getImage_url()).into(imageView);
                    }
                }).start();
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    private class ImViewHolder extends RecyclerView.ViewHolder {
        Banner banner;
        public ImViewHolder(View root) {
            super(root);
            banner=root.findViewById(R.id.banner);
        }
    }
}
