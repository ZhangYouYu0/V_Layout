package com.example.viewpager.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.alibaba.android.vlayout.layout.LinearLayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.example.mylibrary.Base.BaseFragment;
import com.example.viewpager.FooBean.Bean;
import com.example.viewpager.FooBean.FooClassfiyBean;
import com.example.viewpager.FooBean.FooHomeClickBean;
import com.example.viewpager.FooBean.FooShoppingBean;
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.FooBean.FooTablayoutBean;
import com.example.viewpager.FooBean.XqBean;
import com.example.viewpager.Fragment.HomeActivity.HomeChildFragment.Activity.HomeChileShoppingMainActivity;
import com.example.viewpager.Fragment.HomeActivity.HomeChildFragment.HomeChildeBlankFragment;
import com.example.viewpager.Fragment.HomeActivity.HomeClickMainActivity;
import com.example.viewpager.Fragment.HomeActivity.HomeMainActivity;
import com.example.viewpager.Fragment.HomeActivity.SpXq.SpXqMainActivity;
import com.example.viewpager.HomeAdapter.MainGridAdapter1;
import com.example.viewpager.HomeAdapter.MainGridAdapter2;
import com.example.viewpager.HomeAdapter.MainGridAdapter3;
import com.example.viewpager.HomeAdapter.MainGridAdapter4;
import com.example.viewpager.HomeAdapter.MainGridAdapter5;
import com.example.viewpager.HomeAdapter.MainGridAdapter6;
import com.example.viewpager.HomeAdapter.MainGridAdapter7;
import com.example.viewpager.HomeAdapter.MainGridAdapter8;
import com.example.viewpager.HomeAdapter.MainLineranAdapter;
import com.example.viewpager.HomeAdapter.MainSingleAdapter10;
import com.example.viewpager.HomeAdapter.MainSingleAdapter11;
import com.example.viewpager.HomeAdapter.MainSingleAdapter2;
import com.example.viewpager.HomeAdapter.MainSingleAdapter;
import com.example.viewpager.HomeAdapter.MainSingleAdapter1;
import com.example.viewpager.HomeAdapter.MainGridAdapter;
import com.example.viewpager.HomeAdapter.MainSingleAdapter3;
import com.example.viewpager.HomeAdapter.MainSingleAdapter4;
import com.example.viewpager.HomeAdapter.MainSingleAdapter5;
import com.example.viewpager.HomeAdapter.MainSingleAdapter6;
import com.example.viewpager.HomeAdapter.MainSingleAdapter7;
import com.example.viewpager.HomeAdapter.MainSingleAdapter8;
import com.example.viewpager.HomeAdapter.MainSingleAdapter9;
import com.example.viewpager.Contract.C;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.HomeAdapter.MainSingleadapter14;
import com.example.viewpager.P.ImPresenter;
import com.example.viewpager.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeBlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeBlankFragment extends BaseFragment<ImPresenter> implements C.View {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerview;
    private ArrayList<FooHomeBean.DataDTO.BannerDTO> bannerDTOS;
    private MainSingleAdapter1 mainSingleAdapter1;
    private ArrayList<FooHomeBean.DataDTO.ChannelDTO> channelDTOS;
    private MainGridAdapter mainGridAdapter;
    private MainSingleAdapter2 mainSingleAdapte2r;
    private ArrayList<FooHomeBean.DataDTO.BrandListDTO> brandListDTOS;
    private MainGridAdapter1 mainGridAdapter1;
    private MainSingleAdapter3 mainSingleAdapter3;
    private MainGridAdapter2 mainGridAdapter2;
    private ArrayList<FooHomeBean.DataDTO.NewGoodsListDTO> newGoodsListDTOS;
    private MainSingleAdapter4 mainSingleAdapter4;
    private MainLineranAdapter mainGridAdapter3;
    private ArrayList<FooHomeBean.DataDTO.HotGoodsListDTO> hotGoodsListDTOS;
    private ArrayList<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> goodsListDTOS;
    private MainGridAdapter3 mainGridAdapter31;
    private ArrayList<FooHomeBean.DataDTO.CategoryListDTO> singGoods;
    private MainSingleAdapter7 mainSingleAdapter7;
    private ArrayList<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> goodsListDTOS1;
    private MainGridAdapter4 mainGridAdapter4;
    private ArrayList<FooHomeBean.DataDTO.CategoryListDTO> categoryListDTOS;
    private MainSingleAdapter8 mainSingleAdapter8;
    private ArrayList<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> goodsListDTOS2;
    private MainGridAdapter5 mainGridAdapter5;
    private ArrayList<FooHomeBean.DataDTO.CategoryListDTO> categoryListDTOS1;
    private MainSingleAdapter9 mainSingleAdapter9;
    private ArrayList<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> goodsListDTOS3;
    private MainGridAdapter6 mainGridAdapter6;
    private ArrayList<FooHomeBean.DataDTO.CategoryListDTO> categoryListDTOS2;
    private MainSingleAdapter10 mainSingleAdapter10;
    private ArrayList<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> goodsListDTOS4;
    private MainGridAdapter7 mainGridAdapter7;
    private ArrayList<FooHomeBean.DataDTO.CategoryListDTO> categoryListDTOS3;
    private MainSingleAdapter11 mainSingleAdapter11;
    private MainGridAdapter8 mainGridAdapter8;
    private ArrayList<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> goodsListDTOS5;
    private ArrayList<FooHomeBean.DataDTO.TopicListDTO> topicListDTOS;
    private SingleLayoutHelper singleLayoutHelper12;
    private MainSingleadapter14 mainSingleadapter14;
    private  MainSingleAdapter mainSingleAdapter;
    MainSingleAdapter5 mainSingleAdapter5;
    MainSingleAdapter6 mainSingleAdapter6;
    DelegateAdapter delegateAdapter;
    VirtualLayoutManager virtualLayoutManager;
    public HomeBlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeBlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeBlankFragment newInstance(String param1, String param2) {
        HomeBlankFragment fragment = new HomeBlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }



    @Override
    public int ID() {
        return R.layout.fragment_home_blank;
    }

    @Override
    protected void initView(View view) {
        recyclerview = view.findViewById(R.id.recyclerview);
        virtualLayoutManager = new VirtualLayoutManager(getActivity());
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recyclerview.setRecycledViewPool(recycledViewPool);

        recycledViewPool.setMaxRecycledViews(0,10);

        //搜索栏
        initSearch();

        //banner图展示
        initBanner();

        //1网格布局
        initOneGrid();

        //品牌制造商
        initBrand();

        //2网格布局
        initTwoGrid();

        //新品首发
        initNewproduct();

        //3网格布局
        initThreeGrid();

        //人气推荐
        initPopuarity();

        //1线性布局
        initOnwLinear();

        //专题精选
        initSpecial();

        //recyclerview嵌套recyclerview
        initRecyclview();

        //居家
        initFamily();

        //4网格布局
        initFourGrid();

        //餐厨
        initEathutch();

        //5网格布局
        initFiveGrid();

        //饮食
        initFood();

        //6网格布局
        initSixGrid();

        //配件
        initAccessories();

        //7网格布局
        initSevenGrid();

        //服装
        initClothing();

        //8网格布局
        initEightGrid();

        //婴童
        initBaby();

        //9网格布局
        initNineGrid();


        //添加适配器
        initAdapter();

        initItemClick();
    }

    private void initAdapter() {
        delegateAdapter = new DelegateAdapter(virtualLayoutManager);
        delegateAdapter.addAdapter(mainSingleAdapter);
        delegateAdapter.addAdapter(mainSingleAdapter1);
        delegateAdapter.addAdapter(mainGridAdapter);
        delegateAdapter.addAdapter(mainSingleAdapte2r);
        delegateAdapter.addAdapter(mainGridAdapter1);
        delegateAdapter.addAdapter(mainSingleAdapter3);
        delegateAdapter.addAdapter(mainGridAdapter2);
        delegateAdapter.addAdapter(mainSingleAdapter4);
        delegateAdapter.addAdapter(mainGridAdapter3);
        delegateAdapter.addAdapter(mainSingleAdapter5);
        delegateAdapter.addAdapter(mainSingleadapter14);
        delegateAdapter.addAdapter(mainSingleAdapter6);
        delegateAdapter.addAdapter(mainGridAdapter31);
        delegateAdapter.addAdapter(mainSingleAdapter7);
        delegateAdapter.addAdapter(mainGridAdapter4);
        delegateAdapter.addAdapter(mainSingleAdapter8);
        delegateAdapter.addAdapter(mainGridAdapter5);
        delegateAdapter.addAdapter(mainSingleAdapter9);
        delegateAdapter.addAdapter(mainGridAdapter6);
        delegateAdapter.addAdapter(mainSingleAdapter10);
        delegateAdapter.addAdapter(mainGridAdapter7);
        delegateAdapter.addAdapter(mainSingleAdapter11);
        delegateAdapter.addAdapter(mainGridAdapter8);
        recyclerview.setLayoutManager(virtualLayoutManager);
        recyclerview.setAdapter(delegateAdapter);
    }

    private void initNineGrid() {
        goodsListDTOS5 = new ArrayList<>();
        GridLayoutHelper gridLayoutHelper8 = new GridLayoutHelper(2);
        mainGridAdapter8 = new MainGridAdapter8(gridLayoutHelper8,goodsListDTOS5,getActivity());
    }

    private void initBaby() {
        categoryListDTOS3 = new ArrayList<>();
        SingleLayoutHelper singleLayoutHelper11 = new SingleLayoutHelper();
        mainSingleAdapter11 = new MainSingleAdapter11(singleLayoutHelper11,categoryListDTOS3,getActivity());

    }

    private void initEightGrid() {
        goodsListDTOS4 = new ArrayList<>();
        GridLayoutHelper gridLayoutHelper7 = new GridLayoutHelper(2);
        mainGridAdapter7 = new MainGridAdapter7(gridLayoutHelper7,goodsListDTOS4,getActivity());
    }

    private void initClothing() {
        categoryListDTOS2 = new ArrayList<>();
        SingleLayoutHelper singleLayoutHelper10 = new SingleLayoutHelper();
        mainSingleAdapter10 = new MainSingleAdapter10(singleLayoutHelper10, categoryListDTOS2, getActivity());
    }

    private void initSevenGrid() {
        goodsListDTOS3 = new ArrayList<>();
        GridLayoutHelper gridLayoutHelper6 = new GridLayoutHelper(2);
        mainGridAdapter6 = new MainGridAdapter6(gridLayoutHelper6, goodsListDTOS3, getActivity());
    }

    private void initAccessories() {
        categoryListDTOS1 = new ArrayList<>();
        SingleLayoutHelper singleLayoutHelper9 = new SingleLayoutHelper();
        mainSingleAdapter9 = new MainSingleAdapter9(singleLayoutHelper9,categoryListDTOS1,getActivity());
    }

    private void initSixGrid() {
        GridLayoutHelper gridLayoutHelper5 = new GridLayoutHelper(2);
        goodsListDTOS2 = new ArrayList<>();
        mainGridAdapter5 = new MainGridAdapter5(gridLayoutHelper5,goodsListDTOS2,getActivity());
    }

    private void initFood() {
        SingleLayoutHelper singleLayoutHelper8 = new SingleLayoutHelper();
        categoryListDTOS = new ArrayList<>();
        mainSingleAdapter8 = new MainSingleAdapter8(singleLayoutHelper8,categoryListDTOS,getActivity());
    }

    private void initFiveGrid() {
        goodsListDTOS1 = new ArrayList<>();
        GridLayoutHelper gridLayoutHelper4 = new GridLayoutHelper(2);
        mainGridAdapter4 = new MainGridAdapter4(gridLayoutHelper4,goodsListDTOS1,getActivity());
    }

    private void initEathutch() {
        singGoods = new ArrayList<>();
        SingleLayoutHelper singleLayoutHelper7 = new SingleLayoutHelper();
        mainSingleAdapter7 = new MainSingleAdapter7(singleLayoutHelper7, singGoods, getActivity());
    }

    private void initFourGrid() {
        GridLayoutHelper gridLayoutHelper3 = new GridLayoutHelper(2);
        goodsListDTOS = new ArrayList<>();
        mainGridAdapter31 = new MainGridAdapter3(gridLayoutHelper3,goodsListDTOS,getActivity());
    }

    private void initFamily() {
        SingleLayoutHelper singleLayoutHelper6 = new SingleLayoutHelper();
         mainSingleAdapter6 = new MainSingleAdapter6(singleLayoutHelper6,getActivity());

    }

    private void initRecyclview() {
        topicListDTOS = new ArrayList<>();
        singleLayoutHelper12 = new SingleLayoutHelper();
        mainSingleadapter14 = new MainSingleadapter14(topicListDTOS,getActivity(),singleLayoutHelper12);
    }

    private void initSpecial() {
        SingleLayoutHelper singleLayoutHelper5 = new SingleLayoutHelper();
        mainSingleAdapter5 = new MainSingleAdapter5(singleLayoutHelper5,getActivity());
    }

    private void initOnwLinear() {
        hotGoodsListDTOS = new ArrayList<>();
        LinearLayoutHelper linearLayoutHelper = new LinearLayoutHelper();
        mainGridAdapter3 = new MainLineranAdapter(linearLayoutHelper,getActivity(),hotGoodsListDTOS);
    }

    private void initPopuarity() {
        SingleLayoutHelper singleLayoutHelper4 = new SingleLayoutHelper();
        mainSingleAdapter4 = new MainSingleAdapter4(singleLayoutHelper4, getActivity());

    }

    private void initThreeGrid() {
        newGoodsListDTOS = new ArrayList<>();
        GridLayoutHelper gridLayoutHelper2 = new GridLayoutHelper(2);
        mainGridAdapter2 = new MainGridAdapter2(gridLayoutHelper2,getActivity(),newGoodsListDTOS);

    }

    private void initNewproduct() {
        SingleLayoutHelper singleLayoutHelper3 = new SingleLayoutHelper();
        mainSingleAdapter3 = new MainSingleAdapter3(singleLayoutHelper3,getActivity());

    }

    private void initTwoGrid() {

        brandListDTOS = new ArrayList<>();
        GridLayoutHelper gridLayoutHelper1 = new GridLayoutHelper(2);
        mainGridAdapter1 = new MainGridAdapter1(gridLayoutHelper1, getActivity(),brandListDTOS);

    }

    private void initBrand() {
        SingleLayoutHelper singleLayoutHelper2 = new SingleLayoutHelper();
        mainSingleAdapte2r = new MainSingleAdapter2(singleLayoutHelper2,getActivity());

    }

    private void initOneGrid() {
        channelDTOS = new ArrayList<>();
        GridLayoutHelper gridLayoutHelper = new GridLayoutHelper(5);
        gridLayoutHelper.setSpanCount(5);
        mainGridAdapter = new MainGridAdapter(gridLayoutHelper, getActivity(), channelDTOS);
    }

    private void initBanner() {
        bannerDTOS = new ArrayList<>();
        SingleLayoutHelper singleLayoutHelper1 = new SingleLayoutHelper();
        mainSingleAdapter1 = new MainSingleAdapter1(singleLayoutHelper1,getActivity(),bannerDTOS);

    }

    private void initSearch() {
        SingleLayoutHelper singleLayoutHelper = new SingleLayoutHelper();
        mainSingleAdapter = new MainSingleAdapter(singleLayoutHelper,getActivity());
    }

    private void initItemClick() {
        //居家跳转购物车详情页
        mainGridAdapter31.setDj(new MainGridAdapter3.dj() {
            @Override
            public void dj(int pos) {
                Intent intent = new Intent(getActivity(), SpXqMainActivity.class);
                intent.putExtra("id",pos);
                startActivity(intent);
            }
        });

        //锅具跳转购物车详情页
        mainGridAdapter4.setDj(new MainGridAdapter4.dj() {
            @Override
            public void dj(int pos) {
                Intent intent = new Intent(getActivity(), SpXqMainActivity.class);
                intent.putExtra("id",pos);
                startActivity(intent);
            }
        });


        //人气推送点击事件
        mainGridAdapter3.setDj(new MainLineranAdapter.dj() {
            @Override
            public void dj(int pos) {
                FooHomeBean.DataDTO.HotGoodsListDTO hotGoodsListDTO = hotGoodsListDTOS.get(pos);
                Intent intent = new Intent(getActivity(), HomeChileShoppingMainActivity.class);
                intent.putExtra("id",hotGoodsListDTO.getId());
                startActivity(intent);
            }
        });

        //新品首发，购物车
        mainGridAdapter2.setDj(new MainGridAdapter2.dj() {
            @Override
            public void dj(int i) {
                Toast.makeText(getContext(), i+"", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), SpXqMainActivity.class);
                intent.putExtra("id",i);
                startActivity(intent);
            }
        });


        //品牌直供商商品详情页
        mainGridAdapter1.setDj(new MainGridAdapter1.dj() {
            @Override
            public void dj(String url, String desc, String name) {
                Intent intent = new Intent(getActivity(), HomeClickMainActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("url",url);
                intent.putExtra("desc",desc);
                startActivity(intent);
            }
        });

        //购物车详情页
        mainGridAdapter.setOnClickItem(new MainGridAdapter.OnClickItem() {
            @Override
            public void ItemId(int categoryId,int id) {
                Intent intent = new Intent(getActivity(),HomeMainActivity.class);
                intent.putExtra("id",categoryId);
                intent.putExtra("id1",id);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void initData() {
        presenter.P1();
    }

    @Override
    public ImPresenter add() {
        return new ImPresenter();
    }

    @Override
    public void OnSuucessHome(FooHomeBean i) {
        List<FooHomeBean.DataDTO.BannerDTO> banner = i.getData().getBanner();
        bannerDTOS.addAll(banner);
        mainSingleAdapter1.notifyDataSetChanged();

        List<FooHomeBean.DataDTO.ChannelDTO> channel = i.getData().getChannel();
        channelDTOS.addAll(channel);
        mainGridAdapter.notifyDataSetChanged();


        List<FooHomeBean.DataDTO.BrandListDTO> brandList = i.getData().getBrandList();
        brandListDTOS.addAll(brandList);
        mainGridAdapter1.notifyDataSetChanged();

        List<FooHomeBean.DataDTO.NewGoodsListDTO> newGoodsList = i.getData().getNewGoodsList();
        newGoodsListDTOS.addAll(newGoodsList);
        mainGridAdapter2.notifyDataSetChanged();

        List<FooHomeBean.DataDTO.HotGoodsListDTO> hotGoodsList = i.getData().getHotGoodsList();
        hotGoodsListDTOS.addAll(hotGoodsList);
        mainGridAdapter3.notifyDataSetChanged();

        List<FooHomeBean.DataDTO.TopicListDTO> topicList = i.getData().getTopicList();
        topicListDTOS.addAll(topicList);
        mainSingleadapter14.notifyDataSetChanged();

        List<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> goodsList = i.getData().getCategoryList().get(0).getGoodsList();
        goodsListDTOS.addAll(goodsList);
        mainGridAdapter31.notifyDataSetChanged();

        List<FooHomeBean.DataDTO.CategoryListDTO> categoryList = (List<FooHomeBean.DataDTO.CategoryListDTO>) i.getData().getCategoryList();
        FooHomeBean.DataDTO.CategoryListDTO categoryListDTO = categoryList.get(1);
        singGoods.add(categoryListDTO);
        mainSingleAdapter7.notifyDataSetChanged();

        List<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> goodsList1 = i.getData().getCategoryList().get(1).getGoodsList();
        goodsListDTOS1.addAll(goodsList1);
        mainGridAdapter4.notifyDataSetChanged();

        List<FooHomeBean.DataDTO.CategoryListDTO> categoryList1 = i.getData().getCategoryList();
        FooHomeBean.DataDTO.CategoryListDTO categoryListDTO1 = categoryList1.get(2);
        categoryListDTOS.add(categoryListDTO1);
        mainSingleAdapter8.notifyDataSetChanged();

        List<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> goodsList2 = i.getData().getCategoryList().get(2).getGoodsList();
        goodsListDTOS2.addAll(goodsList2);
        mainGridAdapter5.notifyDataSetChanged();

        FooHomeBean.DataDTO.CategoryListDTO categoryListDTO2 = i.getData().getCategoryList().get(3);
        categoryListDTOS1.add(categoryListDTO2);
        mainSingleAdapter9.notifyDataSetChanged();

        List<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> goodsList3 = i.getData().getCategoryList().get(3).getGoodsList();
        goodsListDTOS3.addAll(goodsList3);
        mainGridAdapter6.notifyDataSetChanged();

        FooHomeBean.DataDTO.CategoryListDTO categoryListDTO3 = i.getData().getCategoryList().get(4);
        categoryListDTOS2.add(categoryListDTO3);
        mainSingleAdapter10.notifyDataSetChanged();

        List<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> goodsList4 = i.getData().getCategoryList().get(4).getGoodsList();
        goodsListDTOS4.addAll(goodsList4);
        mainGridAdapter7.notifyDataSetChanged();

        FooHomeBean.DataDTO.CategoryListDTO categoryListDTO4 = i.getData().getCategoryList().get(5);
        categoryListDTOS3.add(categoryListDTO4);
        mainSingleAdapter11.notifyDataSetChanged();

        List<FooHomeBean.DataDTO.CategoryListDTO.GoodsListDTO> goodsList5 = i.getData().getCategoryList().get(5).getGoodsList();
        goodsListDTOS5.addAll(goodsList5);
        mainGridAdapter8.notifyDataSetChanged();
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

    }

    @Override
    public void OnSuucessHomeGwc(XqBean xqBean) {

    }


    @Override
    public void OnErro(String err) {
        Log.e("TAG", "OnErro: "+err );
    }
}