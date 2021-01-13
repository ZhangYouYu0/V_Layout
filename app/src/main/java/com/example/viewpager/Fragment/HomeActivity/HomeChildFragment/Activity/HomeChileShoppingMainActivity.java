package com.example.viewpager.Fragment.HomeActivity.HomeChildFragment.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.bumptech.glide.Glide;
import com.example.mylibrary.Base.BaseActivity;
import com.example.viewpager.Contract.C;
import com.example.viewpager.FooBean.Bean;
import com.example.viewpager.FooBean.FooClassfiyBean;
import com.example.viewpager.FooBean.FooGwcBean;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.FooBean.FooHomeClickBean;
import com.example.viewpager.FooBean.FooShoppingBean;
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.FooBean.FooTablayoutBean;
import com.example.viewpager.FooBean.XqBean;
import com.example.viewpager.Fragment.HomeActivity.SpXq.PlMainActivity;
import com.example.viewpager.Fragment.HomeActivity.SpXq.SpXqMainActivity;
import com.example.viewpager.HomeAdapter.HomePopuarit.MySingepopAdapter;
import com.example.viewpager.HomeAdapter.HomePopuarit.MySingepopAdapter1;
import com.example.viewpager.HomeAdapter.HomePopuarit.MySingepopAdapter2;
import com.example.viewpager.HomeAdapter.HomePopuarit.MySingepopAdapter3;
import com.example.viewpager.HomeAdapter.HomePopuarit.MySingepopAdapter4;
import com.example.viewpager.HomeAdapter.HomePopuarit.MySingepopAdapter5;
import com.example.viewpager.HomeAdapter.HomePopuarit.MySingepopAdapter6;
import com.example.viewpager.HomeAdapter.HomeXq.MyHomeActivityAdapterItem;
import com.example.viewpager.HomeAdapter.HomeXq.MySingleAdapter2;
import com.example.viewpager.MainActivity;
import com.example.viewpager.P.ImPresenter;
import com.example.viewpager.R;
import com.example.viewpager.TwoPresenter.TwoPresenter;
import com.example.viewpager.TwoView.TwoView;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class HomeChileShoppingMainActivity extends BaseActivity<ImPresenter> implements C.View, TwoView {


//    private MyHomeActivityAdapterItem myHomeActivityAdapterItem;
//    private ArrayList<FooSpBean.DataBeanX.AttributeBean> desc;
//    private ArrayList<FooSpBean.DataBeanX.GalleryBean> banner;
    private int id;

    TextView bnt;
    int i = 0;
    private TextView tv_popuarity;
   // private RecyclerView recycleview;
    private ArrayList<FooSpBean.DataBeanx.GalleryBean> bannlist;
    private MySingepopAdapter mySingepopAdapter;
    private MySingepopAdapter1 mySingepopAdapter1;
    private ArrayList<FooSpBean.DataBeanx.InfoBean> namelist;
    private MySingepopAdapter2 mySingepopAdapter2;
    private VirtualLayoutManager virtualLayoutManager;
    private RecyclerView recyclerview;
    private MySingepopAdapter3 mySingepopAdapter3;
    private MySingepopAdapter4 mySingepopAdapter4;
    private ArrayList<FooSpBean.DataBeanx.CommentBean> commentBeanArrayList;
    private ArrayList<FooSpBean.DataBeanx.AttributeBean> attributeBeans;
    private MySingepopAdapter5 mySingepopAdapter5;
    private ImageView gwc;
    private TextView add;

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

        gwc = findViewById(R.id.im_home_spxq_gwc1);
        add = findViewById(R.id.tv_home_spxq_add1);
        TextView sho = findViewById(R.id.tv_home_sqxq_Shop1);



        sho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeChileShoppingMainActivity.this, MainActivity.class));
            }
        });

        recyclerview = findViewById(R.id.recyclerview_home_Popuarity);

        virtualLayoutManager = new VirtualLayoutManager(HomeChileShoppingMainActivity.this);
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recyclerview.setRecycledViewPool(recycledViewPool);


        recycledViewPool.setMaxRecycledViews(0,10);



        //banner
        bannlist = new ArrayList<>();
        SingleLayoutHelper singleLayoutHelper = new SingleLayoutHelper();
        mySingepopAdapter = new MySingepopAdapter(singleLayoutHelper,bannlist,this);

        //通栏
        SingleLayoutHelper singleLayoutHelper1 = new SingleLayoutHelper();
        mySingepopAdapter1 = new MySingepopAdapter1(singleLayoutHelper1,this);

        //姓名价格
        namelist = new ArrayList<>();
        SingleLayoutHelper singleLayoutHelper2 = new SingleLayoutHelper();
        mySingepopAdapter2 = new MySingepopAdapter2(singleLayoutHelper2,namelist,this);

        //杂
        SingleLayoutHelper singleLayoutHelper3 = new SingleLayoutHelper();
        mySingepopAdapter3 = new MySingepopAdapter3(singleLayoutHelper3,this);


        //评论
        commentBeanArrayList = new ArrayList<>();
        SingleLayoutHelper singleLayoutHelper4 = new SingleLayoutHelper();
        mySingepopAdapter4 = new MySingepopAdapter4(singleLayoutHelper4,this,commentBeanArrayList);

        //杂
        SingleLayoutHelper singleLayoutHelper6 = new SingleLayoutHelper();
        MySingepopAdapter6 mySingepopAdapter6 = new MySingepopAdapter6(singleLayoutHelper6,this);

        //参数
        attributeBeans = new ArrayList<>();
        SingleLayoutHelper singleLayoutHelper5 = new SingleLayoutHelper();
        mySingepopAdapter5 = new MySingepopAdapter5(singleLayoutHelper5,this,attributeBeans);

        DelegateAdapter delegateAdapter = new DelegateAdapter(virtualLayoutManager);
        delegateAdapter.addAdapter(mySingepopAdapter);
        delegateAdapter.addAdapter(mySingepopAdapter1);
        delegateAdapter.addAdapter(mySingepopAdapter2);
        delegateAdapter.addAdapter(mySingepopAdapter2);
        delegateAdapter.addAdapter(mySingepopAdapter3);
        delegateAdapter.addAdapter(mySingepopAdapter4);
        delegateAdapter.addAdapter(mySingepopAdapter6);
        delegateAdapter.addAdapter(mySingepopAdapter5);



        recyclerview.setLayoutManager(virtualLayoutManager);
        recyclerview.setAdapter(delegateAdapter);


        initClick();
    }

    private void initClick() {

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
        List<FooSpBean.DataBeanx.GalleryBean> gallery = c.getData().getGallery();
        bannlist.addAll(gallery);


        mySingepopAdapter.notifyDataSetChanged();
        FooSpBean.DataBeanx.InfoBean info = c.getData().getInfo();
        namelist.add(info);
        mySingepopAdapter2.notifyDataSetChanged();

        FooSpBean.DataBeanx.CommentBean comment = c.getData().getComment();
        commentBeanArrayList.add(comment);
        mySingepopAdapter4.notifyDataSetChanged();

        List<FooSpBean.DataBeanx.AttributeBean> attribute = c.getData().getAttribute();
        attributeBeans.addAll(attribute);
        mySingepopAdapter5.notifyDataSetChanged();

        gwc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<FooSpBean.DataBeanx.ProductListBean> productList = c.getData().getProductList();
                TwoPresenter twoPresenter = new TwoPresenter(HomeChileShoppingMainActivity.this);
                twoPresenter.p0(productList.get(0).getGoods_id(),1,productList.get(0).getId());
            }
        });
    }

    @Override
    public void OnSuucessHomeGwc(XqBean xqBean) {

    }

    @Override
    public void OnErro(String err) {

    }

    @Override
    public void Data(FooGwcBean fooGwcBean) {
        i++;
        Toast.makeText(this, "添加成功"+i+"次", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void Err(String e) {
        Toast.makeText(this, "添加失败"+e,Toast.LENGTH_LONG).show();
        Log.e("TAG", "Err: 添加失败"+e );
    }
}