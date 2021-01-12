package com.example.viewpager.HomeAdapter.HomeXq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.example.viewpager.R;

public class MySingleAdapter2 extends DelegateAdapter.Adapter {
    SingleLayoutHelper singleLayoutHelper;
    Context context;

    public MySingleAdapter2(SingleLayoutHelper singleLayoutHelper, Context context) {
        this.singleLayoutHelper = singleLayoutHelper;
        this.context = context;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return singleLayoutHelper;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.sl6_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    ViewHolder viewHolder  = (ViewHolder) holder;
    viewHolder.textView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(dj!=null){
                dj.dj();
            }
        }
    });
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public interface dj{
        void dj();
    }
dj dj;

    public void setDj(MySingleAdapter2.dj dj) {
        this.dj = dj;
    }

    private class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ViewHolder(View root) {
            super(root);
            textView=root.findViewById(R.id.tv_dayu);
        }
    }
}
