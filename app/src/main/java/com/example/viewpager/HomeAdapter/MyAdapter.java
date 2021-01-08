package com.example.viewpager.HomeAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    Context context;
    ArrayList<FooHomeBean.DataDTO.TopicListDTO> list;

    public MyAdapter(Context context, ArrayList<FooHomeBean.DataDTO.TopicListDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.sl5_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        FooHomeBean.DataDTO.TopicListDTO topicListDTO = list.get(position);
        ViewHolder holder1 = (ViewHolder) holder;
        holder1.title.setText(topicListDTO.getTitle());
        holder1.name.setText(topicListDTO.getSubtitle());
        holder1.jin.setText("¥"+topicListDTO.getPrice_info()+"元起");
        Glide.with(holder1.image).load(topicListDTO.getItem_pic_url()).into(holder1.image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView title;
        private final ImageView image;
        private final TextView jin;
        private final TextView name;
        public ViewHolder(@NonNull View view) {
            super(view);
            title = itemView.findViewById(R.id.itemm_title);
            image = itemView.findViewById(R.id.itemm_image);
            jin = itemView.findViewById(R.id.itemm_jin);
            name = itemView.findViewById(R.id.itemm_name);
        }
    }
}
