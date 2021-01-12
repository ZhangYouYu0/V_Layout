package com.example.viewpager.HomeAdapter.HomeChidelAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.viewpager.FooBean.FooHomeClickBean;
import com.example.viewpager.R;

import java.util.ArrayList;

public class MyHomeChildeAdapter extends RecyclerView.Adapter<MyHomeChildeAdapter.ViewHolder> {
    Context context;
    ArrayList<FooHomeClickBean.DataDTO.DataDTOX> list;

    public MyHomeChildeAdapter(Context context, ArrayList<FooHomeClickBean.DataDTO.DataDTOX> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHomeChildeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.home_child_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHomeChildeAdapter.ViewHolder holder, int position) {
        FooHomeClickBean.DataDTO.DataDTOX dataDTOX = list.get(position);
        holder.textView1.setText(dataDTOX.getName());
        holder.textView2.setText(dataDTOX.getRetail_price()+"");
        Glide.with(context).load(dataDTOX.getList_pic_url()).into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
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

    public void setDj(MyHomeChildeAdapter.dj dj) {
        this.dj = dj;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView1;
        TextView textView2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.im_home);
            textView1=itemView.findViewById(R.id.tv_home_chid_name);
            textView2=itemView.findViewById(R.id.tv_home_chid_pic);
        }
    }
}
