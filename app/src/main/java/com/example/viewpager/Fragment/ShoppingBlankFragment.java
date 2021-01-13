package com.example.viewpager.Fragment;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylibrary.Base.BaseFragment;
import com.example.viewpager.Contract.C;
import com.example.viewpager.FooBean.Bean;
import com.example.viewpager.FooBean.FooClassfiyBean;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.FooBean.FooHomeClickBean;
import com.example.viewpager.FooBean.FooShoppingBean;
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.FooBean.FooTablayoutBean;
import com.example.viewpager.FooBean.XqBean;
import com.example.viewpager.P.ImPresenter;
import com.example.viewpager.R;
import com.example.viewpager.ShoppingAdapter.MyShoppingAdapter;

import java.util.ArrayList;
import java.util.List;


public class ShoppingBlankFragment extends BaseFragment<ImPresenter> implements C.View {


    private RecyclerView recyclerview;
    private CheckBox checked;
    private TextView edit;

    private MyShoppingAdapter adapter;
    private int o;
    private FooShoppingBean fooShoppingBean;
    private ArrayList<FooShoppingBean.DataDTO.CartListDTO> list;
    private Button bnt;
    private TextView tv_pirc1;
    private int length;
    private int j;
    private int newpotions;

    @Override
    public int ID() {
        return R.layout.fragment_page_blank;
    }


    //首页添加数据时，调动懒加载刷新数据
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser){
            list.clear();
        }else{
            presenter.P5();
        }
    }

    @Override
    protected void initView(View view) {
        o = 0;
        j = 0;

        recyclerview = view.findViewById(R.id.Shopping_recy);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        checked = view.findViewById(R.id.checked_all);
        edit = view.findViewById(R.id.editing);
        bnt = view.findViewById(R.id.bnt);
        tv_pirc1 = view.findViewById(R.id.tv_pirc1);
        fooShoppingBean = new FooShoppingBean();
        fooShoppingBean.setIfan(false);

        checked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //通过奇偶数判断点击变化
                o++;
                if(o%2==0 && o!=0){
                    fooShoppingBean.setIfan(false);
                    tv_pirc1.setText("￥");
                }else{
                    fooShoppingBean.setIfan(true);
                    int sum = 0;
                    for (int i = 0; i <list.size() ; i++) {
                        sum+=list.get(i).getRetail_price()*list.get(i).getNumber();
                    }
                    tv_pirc1.setText(sum+"￥");
                }
                adapter.notifyDataSetChanged();


            }


        });
        length = 0;


        fooShoppingBean.setJudge(0);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //通过奇偶数判断点击变化
                j++;
                if(j%2==0 && j!=0){
                    fooShoppingBean.setJudge(0);
                    edit.setText("编辑");
                }else{
                    fooShoppingBean.setJudge(1);
                    edit.setText("完成");
                }
                adapter.notifyDataSetChanged();

            }
        });

        list = new ArrayList<>();
        adapter = new MyShoppingAdapter(list,getActivity(),fooShoppingBean);
        recyclerview.setAdapter(adapter);
        initDelete();
    }



    public void initDelete(){

        //点击方法
        adapter.setOnClickItemDelete(new MyShoppingAdapter.OnClickItemDelete() {
            @Override
            public void delete(int pos) {
                newpotions = pos;
            }
        });
        //删除条目
        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.remove(newpotions);
                adapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    protected void initData() {
            presenter.P5(); //请求数据
    }

    @Override
    public ImPresenter add() {
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
        //加载数据
        List<FooShoppingBean.DataDTO.CartListDTO> cartList = s.getData().getCartList();

        list.addAll(cartList);
        length =list.size();
        boolean ifan = fooShoppingBean.isIfan();
        //根据通过bean里设置的boolean值判断是否全选
        if(ifan){
            checked.setText("全选"+"("+length+")");
        }else{
            checked.setText("全选"+"(0)");
        }
        //刷新适配器
        adapter.notifyDataSetChanged();

    }

    @Override
    public void OnSuucessHomeClick(FooHomeClickBean c) {

    }

    @Override
    public void OnSuucessHomeSpxq(FooSpBean c) {

    }

    @Override
    public void OnSuucessHomeGwc(XqBean xqBean) {

    }

    @Override
    public void OnErro(String err) {
        Log.e("TAG", "OnErro: "+err );
    }
}