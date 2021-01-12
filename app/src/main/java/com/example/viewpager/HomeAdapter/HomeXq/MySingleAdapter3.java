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
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.R;

import java.util.ArrayList;

public class MySingleAdapter3 extends DelegateAdapter.Adapter {
    SingleLayoutHelper singleLayoutHelper;
    Context context;
    ArrayList<FooSpBean.DataBeanx.IssueBean> list;

    public MySingleAdapter3(SingleLayoutHelper singleLayoutHelper, Context context, ArrayList<FooSpBean.DataBeanx.IssueBean> list) {
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
        View root = LayoutInflater.from(context).inflate(R.layout.home_spxq_spcs_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        FooSpBean.DataBeanx.IssueBean issueBean = list.get(position);
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.sq.setText(issueBean.getQuestion()+"\n");
        viewHolder.sq1.setText(issueBean.getAnswer()+"\n");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    private class ViewHolder extends RecyclerView.ViewHolder {
        TextView sq;
        TextView sq1;
        public ViewHolder(View root) {
            super(root);
            sq=root.findViewById(R.id.tv_home_spxq_sp1);

            sq1=root.findViewById(R.id.tv_home_spxq_sq2);
        }
    }
}
