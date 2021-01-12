package com.example.viewpager.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.alibaba.android.vlayout.layout.LinearLayoutHelper;
import com.example.mylibrary.Base.BaseFragment;
import com.example.viewpager.CollAdaoter.MainLinearAdapter1;
import com.example.viewpager.Contract.C;
import com.example.viewpager.FooBean.Bean;
import com.example.viewpager.FooBean.FooClassfiyBean;
import com.example.viewpager.FooBean.FooCollBean;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.FooBean.FooHomeClickBean;
import com.example.viewpager.FooBean.FooShoppingBean;
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.FooBean.FooTablayoutBean;
import com.example.viewpager.FooBean.XqBean;
import com.example.viewpager.Login.View.LoginMainActivity;
import com.example.viewpager.MainActivity;
import com.example.viewpager.P.ImPresenter;
import com.example.viewpager.R;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CollBlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CollBlankFragment extends BaseFragment<ImPresenter> implements C.View {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerview;
    private Button s;
    private Button x;
    int i=1;
    private   ArrayList<Bean.DataBeanX.DataBean> list;
    private LinearLayoutHelper linearSnapHelper;

    private NestedScrollView n;
    private Button z;

    private MainLinearAdapter1 mainLinearAdapter11;

    public CollBlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CollBlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CollBlankFragment newInstance(String param1, String param2) {
        CollBlankFragment fragment = new CollBlankFragment();
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
        return R.layout.fragment_coll_blank;
    }

    @Override
    protected void initView(View view) {

        recyclerview = view.findViewById(R.id.VP_recycler);
        s = view.findViewById(R.id.bnt_S);
        x = view.findViewById(R.id.bnt_X);
        n = view.findViewById(R.id.N_view);
        z = view.findViewById(R.id.bnt_Z);
        VirtualLayoutManager virtualLayoutManager = new VirtualLayoutManager(getActivity());
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recyclerview.setRecycledViewPool(recycledViewPool);


        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), LoginMainActivity.class));
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    i--;
                    if(i<0){
                        Toast.makeText(getContext(), "前面没有数据了噢", Toast.LENGTH_SHORT).show();
                    }else{
                        list.clear();
                        presenter.P2(i);
                    }
                s.setEnabled(false);
            }
        });

     x.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
                 i++;
                 if(i>2){
                     Toast.makeText(getContext(), "后面没有数据了噢", Toast.LENGTH_SHORT).show();
                 }else{
                     list.clear();
                     presenter.P2(i);
                 }
            x.setEnabled(false);
         }
     });

        list = new ArrayList<>();
        linearSnapHelper = new LinearLayoutHelper();
        mainLinearAdapter11 = new MainLinearAdapter1(getActivity(),list,linearSnapHelper);


        DelegateAdapter delegateAdapter = new DelegateAdapter(virtualLayoutManager);
        delegateAdapter.addAdapter(mainLinearAdapter11);


        recyclerview.setLayoutManager(virtualLayoutManager);
        recyclerview.setAdapter(delegateAdapter);

    }

    @Override
    protected void initData() {
        presenter.P2(i);
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
        List<Bean.DataBeanX.DataBean> data = i.getData().getData();
        list.addAll(data);
        mainLinearAdapter11.notifyDataSetChanged();

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