package com.example.viewpager.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.example.mylibrary.Base.BaseFragment;
import com.example.mylibrary.Base.BasePresenter;
import com.example.viewpager.Adapter.MainSingleAdapter;
import com.example.viewpager.Contract.C;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.ImPresenter.Presenter;
import com.example.viewpager.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeBlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeBlankFragment extends BaseFragment implements C.View {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerview;

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


        SingleLayoutHelper singleLayoutHelper1 = new SingleLayoutHelper();
        MainSingleAdapter mainSingleAdapter1 = new MainSingleAdapter(singleLayoutHelper1,getActivity());


        DelegateAdapter delegateAdapter = new DelegateAdapter(virtualLayoutManager);
        delegateAdapter.addAdapter(mainSingleAdapter);
        delegateAdapter.addAdapter(mainSingleAdapter1);
        recyclerview.setLayoutManager(virtualLayoutManager);
        recyclerview.setAdapter(delegateAdapter);



    }

    @Override
    protected void initData() {

    }

    @Override
    public BasePresenter add() {
        return new Presenter();
    }

    @Override
    public void OnSuucess(FooHomeBean o) {

    }

    @Override
    public void OnErro(String err) {

    }
}