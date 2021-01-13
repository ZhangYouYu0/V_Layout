package com.example.viewpager.HomeAdapter.HomeXq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.R;

import java.util.ArrayList;

public class MyUserAdapter extends RecyclerView.Adapter<MyUserAdapter.ViewHolder> {
    ArrayList<FooSpBean.DataBeanx.CommentBean.DataBean> list;
    Context context;

    public MyUserAdapter(ArrayList<FooSpBean.DataBeanx.CommentBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyUserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.rl_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull MyUserAdapter.ViewHolder holder, int position) {
//        FooSpBean.DataBeanx.CommentBean.DataBean dataBean = list.get(position);
//        holder.name.setText(dataBean.getNickname());
//        holder.title.setText(dataBean.getAdd_time());
//        holder.pl.setText(dataBean.getContent());
//        Glide.with(context).load(dataBean.getAvatar()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView title;
        TextView pl;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            name=itemView.findViewById(R.id.tv_user_name);
//            title=itemView.findViewById(R.id.tv_user_title);
//            pl=itemView.findViewById(R.id.tv_user_desc);
//            imageView=itemView.findViewById(R.id.im_user);
        }
    }
}
