package com.example.viewpager.Fragment.HomeActivity.HomeChildFragment.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.mylibrary.Base.BaseActivity;
import com.example.viewpager.Contract.C;
import com.example.viewpager.FooBean.Bean;
import com.example.viewpager.FooBean.FooClassfiyBean;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.FooBean.FooHomeClickBean;
import com.example.viewpager.FooBean.FooShoppingBean;
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.FooBean.FooTablayoutBean;
import com.example.viewpager.FooBean.XqBean;
import com.example.viewpager.Fragment.HomeActivity.SpXq.PlMainActivity;
import com.example.viewpager.Fragment.HomeActivity.SpXq.SpXqMainActivity;
import com.example.viewpager.HomeAdapter.HomeXq.MyHomeActivityAdapterItem;
import com.example.viewpager.HomeAdapter.HomeXq.MySingleAdapter2;
import com.example.viewpager.P.ImPresenter;
import com.example.viewpager.R;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class HomeChileShoppingMainActivity extends BaseActivity<ImPresenter> implements C.View {


    private RecyclerView recyclerview;
//    private MyHomeActivityAdapterItem myHomeActivityAdapterItem;
//    private ArrayList<FooSpBean.DataBeanX.AttributeBean> desc;
//    private ArrayList<FooSpBean.DataBeanX.GalleryBean> banner;
    private int id;
    private ArrayList<String> list;
    private Banner banner;
    private TextView desc;
    private TextView pic;
    private TextView name;
    private TextView cc;
    private TextView zl;
    private TextView mj;
    private TextView bz;
    private TextView hh;
    private TextView pl;
    private TextView username;
    private TextView usertitle;
    private TextView userpl;
    private ImageView userimageView;


    @Override
    protected int ID() {
        return R.layout.activity_home_chile_shopping_main;
    }

    @Override
    protected void initData() {
    presenter.P7(id);
    }

    @Override
    protected void initView() {
        Intent intent = getIntent();
        String name1 = intent.getStringExtra("name");
        String url = intent.getStringExtra("url");
        String desc1 = intent.getStringExtra("desc");
        id = intent.getIntExtra("id", 0);

        Toast.makeText(this, id+"", Toast.LENGTH_SHORT).show();

        banner = findViewById(R.id.home_ac_banner);
        desc = findViewById(R.id.home_ac_desc);
        pic = findViewById(R.id.home_ac_pic);
        name = findViewById(R.id.home_ac_name);
        cc = findViewById(R.id.home_ac_cc);
        zl = findViewById(R.id.home_ac_zl);
        mj = findViewById(R.id.home_ac_mj);
        bz = findViewById(R.id.home_ac_bz);
        hh = findViewById(R.id.home_ac_hh);
        pl = findViewById(R.id.tv_pl);


        username = findViewById(R.id.tv_user_name);
        usertitle = findViewById(R.id.tv_user_title);
        userpl = findViewById(R.id.tv_user_desc);
        userimageView = findViewById(R.id.im_user);

        initClick();
    }

    private void initClick() {
//        pl.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(HomeChileShoppingMainActivity.this, PlMainActivity.class);
//                intent.putExtra("id",id);
//                startActivity(intent);
//            }
//        });
    }

    @Override
    protected ImPresenter add() {
        return new ImPresenter();
    }

    @Override
    public void OnSuucessHome(FooHomeBean i) {

    }

    @Override
    public void OnSuucessColl(Bean i) {

    }

    @Override
    public void OnSuucessTab(FooTablayoutBean f) {

    }

    @Override
    public void OnSuucessClassfiy(FooClassfiyBean c) {

    }

    @Override
    public void OnSuucessShooping(FooShoppingBean s) {

    }

    @Override
    public void OnSuucessHomeClick(FooHomeClickBean c) {

    }

    @Override
    public void OnSuucessHomeSpxq(FooSpBean c) {
//        viewHolder.name.setText(name.getName());
//        viewHolder.desc.setText(name.getGoods_brief());
//        viewHolder.pic.setText("￥"+name.getRetail_price());
        List<FooSpBean.DataBeanx.AttributeBean> attribute = c.getData().getAttribute();

            cc.setText(attribute.get(0).getName()+"\n"+attribute.get(0).getValue());

            if(attribute.get(1).getName()!=null){
                zl.setText(attribute.get(1).getName()+"\n"+attribute.get(1).getValue());
            }else{
                zl.setText("这个商品贸易这个描述"+"\n");

            }

            if(attribute.get(2).getName()!=null){
                mj.setText(attribute.get(2).getName()+"\n"+attribute.get(2).getValue());
            }else{
                mj.setText("商品没有该描述"+"\n");
            }

            if(attribute.get(3).getName()!=null){
                bz.setText(attribute.get(3).getName()+"\n"+attribute.get(3).getValue());
            }else{
                bz.setText("商品没有该描述"+"\n");
            }

           if(attribute.get(4).getName()!=null){
               hh.setText(attribute.get(4).getName()+"\n"+attribute.get(4).getValue());
           }else{
               hh.setText("该商品没有描述"+"\n");
           }


//        List<FooSpBean.DataBeanX.GalleryBean> gallery = c.getData().getGallery();
        FooSpBean.DataBeanx.InfoBean info = c.getData().getInfo();
//
//        list.add(info.getName());
//        list.add(info.getGoods_brief());
//        list.add(info.getRetail_price()+"");

        List<FooSpBean.DataBeanx.GalleryBean> gallery = c.getData().getGallery();
        banner.setImages(gallery)
                .setImageLoader(new ImageLoader() {
                    @Override
                    public void displayImage(Context context, Object path, ImageView imageView) {
                        FooSpBean.DataBeanx.GalleryBean f = (FooSpBean.DataBeanx.GalleryBean) path;
                        Glide.with(HomeChileShoppingMainActivity.this).load(f.getImg_url()).into(imageView);
                    }
                }).start();

        name.setText(info.getName());
        desc.setText(info.getGoods_brief());
        pic.setText("￥"+info.getRetail_price());

        FooSpBean.DataBeanx.CommentBean.DataBean data = c.getData().getComment().getData();
        username.setText(data.getNickname());
        userpl.setText(data.getContent());
        usertitle.setText(data.getAdd_time());
//        userimageView;
        Glide.with(this).load(data.getAvatar()).into(userimageView);
//        desc.addAll(attribute);
//        banner.addAll(gallery);
//        myHomeActivityAdapterItem.notifyDataSetChanged();
    }

    @Override
    public void OnSuucessHomeGwc(XqBean xqBean) {

    }

    @Override
    public void OnErro(String err) {

    }
}