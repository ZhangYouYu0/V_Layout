package com.example.viewpager.Fragment.HomeActivity.SpXq;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.example.mylibrary.Base.BaseActivity;
import com.example.viewpager.Contract.C;
import com.example.viewpager.Contract.C1;
import com.example.viewpager.FooBean.Bean;
import com.example.viewpager.FooBean.FooClassfiyBean;
import com.example.viewpager.FooBean.FooGwcBean;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.FooBean.FooHomeClickBean;
import com.example.viewpager.FooBean.FooShoppingBean;
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.FooBean.FooTablayoutBean;
import com.example.viewpager.FooBean.XqBean;
import com.example.viewpager.HomeAdapter.HomeXq.MyGridApdater;
import com.example.viewpager.HomeAdapter.HomeXq.MyGridApdater1;
import com.example.viewpager.HomeAdapter.HomeXq.MySingleAdapter1;
import com.example.viewpager.HomeAdapter.HomeXq.MySingleAdapter2;
import com.example.viewpager.HomeAdapter.HomeXq.MySingleAdapter3;
import com.example.viewpager.HomeAdapter.HomeXq.MySingleAdapter4;
import com.example.viewpager.HomeAdapter.HomeXq.MyXhx;
import com.example.viewpager.HomeAdapter.HomeXq.Myxx;
import com.example.viewpager.MainActivity;
import com.example.viewpager.P.ImPresenter;
import com.example.viewpager.R;
import com.example.viewpager.TwoPresenter.TwoPresenter;
import com.example.viewpager.TwoView.TwoView;

import java.util.ArrayList;
import java.util.List;

public class SpXqMainActivity extends BaseActivity<ImPresenter> implements C.View, C1.View, TwoView {
    int ss=0;
    private RecyclerView recyclerview;
    private int id;
    private ArrayList<FooSpBean.DataBeanx.InfoBean> infoBeans;
    private MySingleAdapter1 mySingleAdapter1;
    private MySingleAdapter2 mySingleAdapter2;
    private MySingleAdapter3 mySingleAdapter3;
    private ArrayList<FooSpBean.DataBeanx.IssueBean> issueBeans;
    private ArrayList<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> goodsListDTOS;
    private MyGridApdater myGridApdater;
    private TextView add;
    private TwoPresenter twoPresenter;
    private ImageView im_gwc;
    private int nu;
    private TextView shop;
    private ArrayList<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> list;
    private MyGridApdater1 myGridApdater1;


    @Override
    protected int ID() {
        return R.layout.activity_sp_xq_main;
    }

    @Override
    protected void initData() {

        presenter.P7(id);
        presenter.P1();

    }

    @Override
    protected void initView() {
        Intent intent = getIntent();
        id = intent.getIntExtra("id", 0);
        add = findViewById(R.id.tv_home_spxq_add1);
        recyclerview = findViewById(R.id.recyclerview_home_spxq);
        im_gwc = findViewById(R.id.im_home_spxq_gwc);
        shop = findViewById(R.id.tv_home_sqxq_Shop);


        VirtualLayoutManager virtualLayoutManager = new VirtualLayoutManager(this);
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();

        recycledViewPool.setMaxRecycledViews(0,20);
        recyclerview.setRecycledViewPool(recycledViewPool);

        infoBeans = new ArrayList<>();
        SingleLayoutHelper singleLayoutHelper = new SingleLayoutHelper();
        mySingleAdapter1 = new MySingleAdapter1(singleLayoutHelper,this,infoBeans);

        SingleLayoutHelper xhx = new SingleLayoutHelper();
        MyXhx myXhx = new MyXhx(xhx,this);

        SingleLayoutHelper singleLayoutHelper1 = new SingleLayoutHelper();
        mySingleAdapter2 = new MySingleAdapter2(singleLayoutHelper1,this);

        SingleLayoutHelper singleLayoutHelper3 = new SingleLayoutHelper();
        Myxx myxx = new Myxx(singleLayoutHelper3,this);

        issueBeans = new ArrayList<>();
        SingleLayoutHelper singleLayoutHelper2 = new SingleLayoutHelper();
        mySingleAdapter3 = new MySingleAdapter3(singleLayoutHelper2,this,issueBeans);


        SingleLayoutHelper singleLayoutHelper4 = new SingleLayoutHelper();
        MySingleAdapter4 mySingleAdapter4 = new MySingleAdapter4(singleLayoutHelper4,this);




        goodsListDTOS = new ArrayList<>();
        GridLayoutHelper gridLayoutHelper = new GridLayoutHelper(3);
        myGridApdater = new MyGridApdater(gridLayoutHelper,goodsListDTOS,this);


        list = new ArrayList<>();
        GridLayoutHelper gridLayoutHelper1 = new GridLayoutHelper(2);
        myGridApdater1 = new MyGridApdater1(gridLayoutHelper1,list,this);

        DelegateAdapter delegateAdapter = new DelegateAdapter(virtualLayoutManager);
        delegateAdapter.addAdapter(mySingleAdapter1);
        delegateAdapter.addAdapter(myXhx);
        delegateAdapter.addAdapter(mySingleAdapter2);
        delegateAdapter.addAdapter(myxx);
        delegateAdapter.addAdapter(mySingleAdapter3);
        delegateAdapter.addAdapter(mySingleAdapter4);
     //   delegateAdapter.addAdapter(myGridApdater1);
        //delegateAdapter.addAdapter(myGridApdater);

        recyclerview.setLayoutManager(virtualLayoutManager);
        recyclerview.setAdapter(delegateAdapter);

        initOnClickItem();
    }

    private void setback(float v) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.alpha = v;
        getWindow().setAttributes(attributes);
    }

    private void initOnClickItem() {


        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpXqMainActivity.this, MainActivity.class));
            }
        });

    }

    @Override
    protected ImPresenter add() {
        return new ImPresenter();
    }

    @Override
    public void OnSuucessHome(FooHomeBean i) {


        List<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> goodsList = i.getData().getCategoryList().get(2).getGoodsList();
        goodsListDTOS.addAll(goodsList);
        myGridApdater.notifyDataSetChanged();
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
        FooSpBean.DataBeanx.InfoBean info = c.getData().getInfo();
        infoBeans.add(info);
        mySingleAdapter1.notifyDataSetChanged();



        List<FooSpBean.DataBeanx.ProductListBean> productList = c.getData().getProductList();


        im_gwc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View root = LayoutInflater.from(SpXqMainActivity.this).inflate(R.layout.pop_item, null, false);
                PopupWindow popupWindow = new PopupWindow(root, ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
                popupWindow.setFocusable(true);
                popupWindow.setOutsideTouchable(true);

                TextView jia = root.findViewById(R.id.tv_plus1);
                TextView jian = root.findViewById(R.id.tv_minus1);
                Button bnt = root.findViewById(R.id.bnt_ok);
                TextView num = root.findViewById(R.id.tv_home_spxq_number);
                nu = 0;

                num.setText(""+nu);
                jia.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            nu++;
                            num.setText(""+nu);
                            bnt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(SpXqMainActivity.this, nu+"", Toast.LENGTH_SHORT).show();
                                    twoPresenter = new TwoPresenter(SpXqMainActivity.this);
                                    twoPresenter.p0(productList.get(0).getGoods_id(),nu,productList.get(0).getId());
                                    popupWindow.dismiss();
                                }

                            });
                    }
                });
                jian.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(nu>=0) {
                                nu--;
                                num.setText(""+nu);
                                bnt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    int i = nu;
                                    Toast.makeText(SpXqMainActivity.this, i+"", Toast.LENGTH_SHORT).show();
                                    twoPresenter = new TwoPresenter(SpXqMainActivity.this);
                                    twoPresenter.p0(productList.get(0).getGoods_id(),nu,productList.get(0).getId());
                                    popupWindow.dismiss();
                                }
                            });
                        }

                    }
                });

                bnt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int i = nu;
                        Toast.makeText(SpXqMainActivity.this, i+"", Toast.LENGTH_SHORT).show();
                        twoPresenter = new TwoPresenter(SpXqMainActivity.this);
                        twoPresenter.p0(productList.get(0).getGoods_id(),nu,productList.get(0).getId());
                        popupWindow.dismiss();
                    }

                });
                setback(0.5f);
                popupWindow.showAsDropDown(root,200,400);
                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public void onDismiss() {
                        setback(1f);
                    }
                });

            }
        });

        List<FooSpBean.DataBeanx.IssueBean> issue = c.getData().getIssue();
        issueBeans.addAll(issue);
        mySingleAdapter3.notifyDataSetChanged();

    }

    @Override
    public void OnSuucessHomeGwc(XqBean xqBean) {
        Toast.makeText(this, "cg", Toast.LENGTH_SHORT).show();
        List<XqBean.DataDTO.AttributeDTO> attribute = xqBean.getData().getAttribute();
    //    Toast.makeText(this, attribute.get(0).getName()+"", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnErro(String err) {
        Toast.makeText(this, err+"", Toast.LENGTH_SHORT).show();
        Log.e("TAG", "OnErro: "+err );
    }

    @Override
    public void Cg(Object o) {

    }

    @Override
    public void Sb(String err) {

    }

    @Override
    public void Data(FooGwcBean fooGwcBean) {
        List<FooGwcBean.DataDTO.CartListDTO> cartList = fooGwcBean.getData().getCartList();
        Toast.makeText(this, "添加成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void Err(String e) {
        Log.e("TAG", "Err: "+e );
    }
}