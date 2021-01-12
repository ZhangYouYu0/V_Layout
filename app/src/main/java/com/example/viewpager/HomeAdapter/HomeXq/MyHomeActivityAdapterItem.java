package com.example.viewpager.HomeAdapter.HomeXq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.bumptech.glide.Glide;
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.R;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

public class MyHomeActivityAdapterItem extends RecyclerView.Adapter {
    ArrayList<String> list;
    ArrayList<FooSpBean.DataBeanx.AttributeBean> desc;
    ArrayList<FooSpBean.DataBeanx.GalleryBean> baner;
    Context context;

    public MyHomeActivityAdapterItem(   ArrayList<String> list, ArrayList<FooSpBean.DataBeanx.AttributeBean> desc, ArrayList<FooSpBean.DataBeanx.GalleryBean> baner, Context context) {
        this.list = list;
        this.desc = desc;
        this.baner = baner;
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

       // FooSpBean.DataBeanX.AttributeBean attributeBean = desc.get(position);
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.banner.setImages(baner)
                .setImageLoader(new ImageLoader() {
                    @Override
                    public void displayImage(Context context, Object path, ImageView imageView) {
                        FooSpBean.DataBeanx.GalleryBean f = (FooSpBean.DataBeanx.GalleryBean) path;
                        Glide.with(context).load(f.getImg_url()).into(imageView);
                    }
                }).start();

//        list.add(info.getName());
//        list.add(info.getGoods_brief());
//        list.add(info.getRetail_price()+"");

        viewHolder.name.setText(list.get(0));
        viewHolder.desc.setText(list.get(1));
        viewHolder.pic.setText("￥"+list.get(2));

//        viewHolder.cc.setText(attributeBean.getValue());
//        viewHolder.zl.setText(attributeBean.getName());
    }

    @Override
    public int getItemCount() {
        return desc.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder {
         Banner banner;
         TextView desc;
         TextView pic;
         TextView name;
         TextView cc;
        TextView zl;
       //  TextView mj;

//         TextView bz;
//          <TextView
//        android:layout_width="match_parent"
//        android:layout_height="wrap_content"
//        android:background="#BDBDBD"
//        android:layout_marginTop="10dp"
//        android:id="@+id/home_ac_mj"
//        app:layout_constraintTop_toBottomOf="@id/home_ac_zl"/>
//
//    <TextView
//        android:layout_marginTop="10dp"
//        android:layout_width="match_parent"
//        android:layout_height="wrap_content"
//        android:background="#BDBDBD"
//        android:id="@+id/home_ac_bz"
//        app:layout_constraintTop_toBottomOf="@id/home_ac_mj"/>

        public ViewHolder(View root) {
            super(root);
//            banner = root.findViewById(R.id.home_ac_banner);
//            desc =  root.findViewById(R.id.home_ac_desc);
//            pic =  root.findViewById(R.id.home_ac_pic);
//            name =  root.findViewById(R.id.home_ac_name);
//            cc =  root.findViewById(R.id.home_ac_cc);
//          //  mj =  root.findViewById(R.id.home_ac_mj);
//            zl =  root.findViewById(R.id.home_ac_zl);
//            bz =  root.findViewById(R.id.home_ac_bz);
        }
    }
}
