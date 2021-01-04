package com.example.viewpager.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.mylibrary.Base.BaseFragment;
import com.example.viewpager.Contract.C;
import com.example.viewpager.FooBean.Bean;
import com.example.viewpager.FooBean.FooClassfiyBean;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.FooBean.FooTablayoutBean;
import com.example.viewpager.Fragment.ViewPager.ChildBlankFragment;
import com.example.viewpager.P.ImPresenter;
import com.example.viewpager.R;

import java.util.ArrayList;
import java.util.List;

import q.rorbin.verticaltablayout.VerticalTabLayout;
import q.rorbin.verticaltablayout.adapter.TabAdapter;
import q.rorbin.verticaltablayout.widget.ITabView;
import q.rorbin.verticaltablayout.widget.QTabView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ClassfiyBlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ClassfiyBlankFragment extends BaseFragment<ImPresenter> implements C.View {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private VerticalTabLayout tablayout;
    private ViewPager viewpager;


    public ClassfiyBlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ClassfiyBlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ClassfiyBlankFragment newInstance(String param1, String param2) {
        ClassfiyBlankFragment fragment = new ClassfiyBlankFragment();
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
        return R.layout.fragment_classfiy_blank;
    }

    @Override
    protected void initView(View view) {
        tablayout = view.findViewById(R.id.Tablayout);
        viewpager = view.findViewById(R.id.viewpager);
    }

    @Override
    protected void initData() {
      presenter.P3();
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
         ArrayList<Fragment> list = new ArrayList<>();
        List<FooTablayoutBean.DataDTO.CategoryListDTO> categoryList = f.getData().getCategoryList();
        for (int i = 0; i <categoryList.size() ; i++) {
            Integer id = categoryList.get(i).getId();
            ChildBlankFragment childBlankFragment = new ChildBlankFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("id",id);
            childBlankFragment.setArguments(bundle);
            list.add(childBlankFragment);
        }


        viewpager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });

        tablayout.setupWithViewPager(viewpager);

        tablayout.setTabAdapter(new TabAdapter() {
            @Override
            public int getCount() {
                return categoryList.size();
            }

            @Override
            public ITabView.TabBadge getBadge(int position) {
                return null;
            }

            @Override
            public ITabView.TabIcon getIcon(int position) {
                return null;
            }

            @Override
            public ITabView.TabTitle getTitle(int position) {
                QTabView.TabTitle title = new QTabView.TabTitle.Builder()
                        .setContent(categoryList.get(position).getName())//设置数据   也有设置字体颜色的方法
                        .build();
                return title;
            }

            @Override
            public int getBackground(int position) {
                return 0;
            }
        });

    }

    @Override
    public void OnSuucessClassfiy(FooClassfiyBean c) {

    }

    @Override
    public void OnErro(String err) {
        Log.e("TAG", "OnErro: "+err );
    }
}