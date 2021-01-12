package com.example.viewpager.HomeAdapter.HomeClickAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.viewpager.R;

public class MyHomeClickAdapter extends RecyclerView.Adapter<MyHomeClickAdapter.ViewHolder> {
    Context context;
    String name;
    String url;
    String desc;

    public MyHomeClickAdapter(Context context, String name, String url, String desc) {
        this.context = context;
        this.name = name;
        this.url = url;
        this.desc = desc;
    }

    @NonNull
    @Override
    public MyHomeClickAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.home_click_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHomeClickAdapter.ViewHolder holder, int position) {
        holder.name.setText(name);
        holder.desc.setText(desc);
        Glide.with(context).load(url).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView url;
        TextView desc;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.im_home_click);
            name=itemView.findViewById(R.id.tv_home_click_name);
            desc=itemView.findViewById(R.id.tv_home_click_desc);
        }
    }
}
