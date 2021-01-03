package com.example.viewpager.HomeAdapter;

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

public class MainSingleAdapter6 extends DelegateAdapter.Adapter {
    SingleLayoutHelper singleLayoutHelper;
    Context context;

    public MainSingleAdapter6(SingleLayoutHelper singleLayoutHelper, Context context) {
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
        View root = LayoutInflater.from(context).inflate(R.layout.sl1_item, parent, false);
        return new SingViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SingViewHolder singViewHolder = (SingViewHolder) holder;
        singViewHolder.textView.setText("居家");
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    private class SingViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public SingViewHolder(View root) {
            super(root);
            textView =root.findViewById(R.id.tv_title1);
        }
    }
}
