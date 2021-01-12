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
    private int i;
    private Integer number;

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

        number = cartListDTO.getNumber();
        Glide.with(context).load(cartListDTO.getList_pic_url()).into(holder.imageView);
        boolean ifan = fooShoppingBean.isIfan();

        if(ifan){
            holder.checkBox.setChecked(true);
        }else{
            holder.checkBox.setChecked(false);
        }

        Integer judge = fooShoppingBean.getJudge();
       // Toast.makeText(context, judge+"H", Toast.LENGTH_SHORT).show();
        if(judge>0){
            holder.plsu.setVisibility(View.VISIBLE);
            holder.minus.setVisibility(View.VISIBLE);
            holder.checktrue.setVisibility(View.VISIBLE);
            holder.name.setVisibility(View.GONE);
            holder.num.setText(""+cartListDTO.getNumber());
        //    Toast.makeText(context, judge+"/**", Toast.LENGTH_SHORT).show();
        }else{
          //  Toast.makeText(context, judge+".", Toast.LENGTH_SHORT).show();
            holder.plsu.setVisibility(View.GONE);
            holder.minus.setVisibility(View.GONE);
            holder.checktrue.setVisibility(View.GONE);
            holder.name.setVisibility(View.VISIBLE);
        }

        i = 0;
        holder.plsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number>10){
                }else{
                    number++;
                    holder.num.setText(number+"");
                }

            }
        });
        holder.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number<0){
                    Toast.makeText(context, "好家伙给我干到负数去了？", Toast.LENGTH_SHORT).show();
                }else{
                  number--;
                    holder.num.setText(number+"");
                }

            }
        });


        holder.checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onClickItemDelete!=null){
                    onClickItemDelete.delete(position);
                }
            }
        });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public interface OnClickItemDelete{
        void delete(int pos);
    }
    OnClickItemDelete onClickItemDelete;

    public void setOnClickItemDelete(OnClickItemDelete onClickItemDelete) {
        this.onClickItemDelete = onClickItemDelete;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView pic;
        TextView num;
        ImageView imageView;
        CheckBox checkBox;
        TextView minus;
        TextView plsu;
        TextView checktrue;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.tv_name_text6);
            pic=itemView.findViewById(R.id.tv_princ);
            num=itemView.findViewById(R.id.tv_name_number);
            imageView=itemView.findViewById(R.id.image_checked);
            checkBox=itemView.findViewById(R.id.checked);
            minus=itemView.findViewById(R.id.tv_minuse);
            plsu=itemView.findViewById(R.id.tv_plus);
            checktrue=itemView.findViewById(R.id.tv_check_true);
        }
    }
}
