package com.example.viewpager.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.alibaba.android.vlayout.layout.LinearLayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.example.mylibrary.Base.BaseFragment;
import com.example.viewpager.Adapter.MainGridAdapter1;
import com.example.viewpager.Adapter.MainGridAdapter2;
import com.example.viewpager.Adapter.MainLineranAdapter;
import com.example.viewpager.Adapter.MainSingleAdapter2;
import com.example.viewpager.Adapter.MainSingleAdapter;
import com.example.viewpager.Adapter.MainSingleAdapter1;
import com.example.viewpager.Adapter.MainGridAdapter;
import com.example.viewpager.Adapter.MainSingleAdapter3;
import com.example.viewpager.Adapter.MainSingleAdapter4;
import com.example.viewpager.Contract.C;
import com.example.viewpager.FooBean.FooHomeBean;
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
        VirtualLayoutManager virtualLayoutManager = new VirtualLayoutManager(getActivity());
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recyclerview.setRecycledViewPool(recycledViewPool);

        recycledViewPool.setMaxRecycledViews(0,10);

        SingleLayoutHelper singleLayoutHelper = new SingleLayoutHelper();
        MainSingleAdapter mainSingleAdapter = new MainSingleAdapter(singleLayoutHelper,getActivity());

        bannerDTOS = new ArrayList<>();
        SingleLayoutHelper singleLayoutHelper1 = new SingleLayoutHelper();
        mainSingleAdapter1 = new MainSingleAdapter1(singleLayoutHelper1,getActivity(),bannerDTOS);


        channelDTOS = new ArrayList<>();
        GridLayoutHelper gridLayoutHelper = new GridLayoutHelper(5);
        gridLayoutHelper.setSpanCount(5);
        mainGridAdapter = new MainGridAdapter(gridLayoutHelper, getActivity(), channelDTOS);

        SingleLayoutHelper singleLayoutHelper2 = new SingleLayoutHelper();
        mainSingleAdapte2r = new MainSingleAdapter2(singleLayoutHelper2,getActivity());

        brandListDTOS = new ArrayList<>();
        GridLayoutHelper gridLayoutHelper1 = new GridLayoutHelper(2);
        mainGridAdapter1 = new MainGridAdapter1(gridLayoutHelper1, getActivity(),brandListDTOS);

        SingleLayoutHelper singleLayoutHelper3 = new SingleLayoutHelper();
        mainSingleAdapter3 = new MainSingleAdapter3(singleLayoutHelper3,getActivity());

        newGoodsListDTOS = new ArrayList<>();
        GridLayoutHelper gridLayoutHelper2 = new GridLayoutHelper(2);
        mainGridAdapter2 = new MainGridAdapter2(gridLayoutHelper2,getActivity(),newGoodsListDTOS);

        SingleLayoutHelper singleLayoutHelper4 = new SingleLayoutHelper();
        mainSingleAdapter4 = new MainSingleAdapter4(singleLayoutHelper4, getActivity());

        hotGoodsListDTOS = new ArrayList<>();
        LinearLayoutHelper linearLayoutHelper = new LinearLayoutHelper();
        mainGridAdapter3 = new MainLineranAdapter(linearLayoutHelper,getActivity(),hotGoodsListDTOS);


        
        DelegateAdapter delegateAdapter = new DelegateAdapter(virtualLayoutManager);
        delegateAdapter.addAdapter(mainSingleAdapter);
        delegateAdapter.addAdapter(mainSingleAdapter1);
        delegateAdapter.addAdapter(mainGridAdapter);
        delegateAdapter.addAdapter(mainSingleAdapte2r);
        delegateAdapter.addAdapter(mainGridAdapter1);
        delegateAdapter.addAdapter(mainSingleAdapter3);
        delegateAdapter.addAdapter(mainGridAdapter2);
        delegateAdapter.addAdapter(mainSingleAdapter4);
        delegateAdapter.addAdapter(mainGridAdapter3);
        recyclerview.setLayoutManager(virtualLayoutManager);
        recyclerview.setAdapter(delegateAdapter);

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
    public void OnSuucess(FooHomeBean i) {
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

            }

    @Override
    public void OnErro(String err) {
        Log.e("TAG", "OnErro: "+err );
    }
//
//    @Override
//    public void OnSuucess(FooHomeBean i) {

//    }
//
//    @Override
//    public void OnErro(String err) {
//        Log.e("TAG", "OnErro: "+err );
//    }
}