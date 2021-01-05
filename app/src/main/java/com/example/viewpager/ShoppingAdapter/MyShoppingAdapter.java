package com.example.viewpager.ShoppingAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.viewpager.FooBean.FooShoppingBean;
import com.example.viewpager.R;

import java.util.ArrayList;

public class MyShoppingAdapter extends RecyclerView.Adapter<MyShoppingAdapter.ViewHolder> {
    ArrayList<FooShoppingBean.DataDTO.CartListDTO> list;
    Context context;
    FooShoppingBean fooShoppingBean;
    public MyShoppingAdapter(ArrayList<FooShoppingBean.DataDTO.CartListDTO> list, Context context,FooShoppingBean fooShoppingBean) {
        this.list = list;
        this.context = context;
        this.fooShoppingBean =fooShoppingBean;
    }

    @NonNull
    @Override
    public MyShoppingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.sh_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull MyShoppingAdapter.ViewHolder holder, int position) {
        FooShoppingBean.DataDTO.CartListDTO cartListDTO = list.get(position);
        holder.num.setText("X"+cartListDTO.getNumber());
        holder.name.setText(cartListDTO.getGoods_name());
        holder.pic.setText(cartListDTO.getMarket_price()+"￥");

        Glide.with(context).load(cartListDTO.getList_pic_url()).into(holder.imageView);
        boolean ifan = fooShoppingBean.isIfan();
        if(ifan){
            holder.checkBox.setChecked(true);
        }else{
            holder.checkBox.setChecked(false);
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

  public   interface OnClickitemcheckbox{
        void box(int sum);
    }
    OnClickitemcheckbox onClickitemcheckbox;

    public void setOnClickitemcheckbox(OnClickitemcheckbox onClickitemcheckbox) {
        this.onClickitemcheckbox = onClickitemcheckbox;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView pic;
        TextView num;
        ImageView imageView;
        CheckBox checkBox;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.tv_name_text6);
            pic=itemView.findViewById(R.id.tv_princ);
            num=itemView.findViewById(R.id.tv_name_number);
            imageView=itemView.findViewById(R.id.image_checked);
            checkBox=itemView.findViewById(R.id.checked);
        }
    }
}
