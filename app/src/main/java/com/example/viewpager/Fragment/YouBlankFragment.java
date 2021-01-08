package com.example.viewpager.Fragment;

import android.content.Intent;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylibrary.Base.BaseFragment;
import com.example.viewpager.Login.View.LoginMainActivity;
import com.example.viewpager.MainActivity;
import com.example.viewpager.P.ImPresenter;
import com.example.viewpager.R;
import com.example.viewpager.YouAdapter.Adapasda;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


public class YouBlankFragment extends BaseFragment<ImPresenter> {


    private Adapasda adapasda;
    private Disposable subscribe;
    private int num;
    boolean AnIf = false;
    private RecyclerView recycerview;

    @Override
    public int ID() {
        return R.layout.fragment_you_blank;
    }

    @Override
    protected void initView(View view) {


//        if(AnIf){
//            AnIf=true;
//        }else{
//            num = 0;
//            subscribe = Observable.interval(1, 1, TimeUnit.SECONDS)
//                    .subscribeOn(Schedulers.io())
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .subscribe(new Consumer<Long>() {
//                        @Override
//                        public void accept(Long aLong) throws Exception {
//                            num++;
//                            if(num==1){
//                                startActivity(new Intent(getActivity(), LoginMainActivity.class));
//                                subscribe.dispose();
//                            }
//                        }
//                    });
//        }

    }

    @Override
    protected void initData() {

    }

    @Override
    public ImPresenter add() {
        return new ImPresenter();
    }
}