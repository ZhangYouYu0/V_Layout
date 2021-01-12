package com.example.viewpager.ChildeAdapter;

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
import com.example.viewpager.FooBean.FooClassfiyBean;
import com.example.viewpager.R;

import java.util.ArrayList;

public class MainGridAdapter9 extends DelegateAdapter.Adapter{
    ArrayList<FooClassfiyBean.DataDTO.CurrentCategoryDTO.SubCategoryListDTO> list;
    GridLayoutHelper gridLayoutHelper;
    Context context;

    public MainGridAdapter9(ArrayList<FooClassfiyBean.DataDTO.CurrentCategoryDTO.SubCategoryListDTO> list, GridLayoutHelper gridLayoutHelper, Context context) {
        this.list = list;
        this.gridLayoutHelper = gridLayoutHelper;
        this.context = context;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return gridLayoutHelper;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.gr2_item, parent, false);
        return new GrViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    GrViewHolder grViewHolder = (GrViewHolder) holder;
        FooClassfiyBean.DataDTO.CurrentCategoryDTO.SubCategoryListDTO subCategoryListDTO = list.get(position);
        grViewHolder.textView.setText(subCategoryListDTO.getName());
        Glide.with(context).load(subCategoryListDTO.getWap_banner_url()).into(grViewHolder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dj!=null){
//                    dj.dj(subCategoryListDTO.getId());
                    dj.dj(subCategoryListDTO.getShow_index());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public interface dj{
        void dj(int id);
    }
    dj dj;

    public void setDj(MainGridAdapter9.dj dj) {
        this.dj = dj;
    }

    private class GrViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public GrViewHolder(View root) {
            super(root);
            textView=root.findViewById(R.id.tv_name_text2);
            imageView=root.findViewById(R.id.image_view2);
        }
    }
}
