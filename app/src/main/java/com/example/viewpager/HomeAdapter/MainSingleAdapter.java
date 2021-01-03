package com.example.viewpager.HomeAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.example.viewpager.R;

public class MainSingleAdapter extends DelegateAdapter.Adapter {
    SingleLayoutHelper floatLayoutHelper;
    Context context;

    public MainSingleAdapter(SingleLayoutHelper floatLayoutHelper, Context context) {
        this.floatLayoutHelper = floatLayoutHelper;
        this.context = context;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return floatLayoutHelper;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.ed_item, parent, false);
        return new ImViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    private class ImViewHolder extends RecyclerView.ViewHolder {
        public ImViewHolder(View inflate) {
            super(inflate);
        }
    }
}
