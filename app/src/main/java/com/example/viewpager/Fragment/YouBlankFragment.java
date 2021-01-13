package com.example.viewpager.Fragment;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylibrary.Base.BaseFragment;
import com.example.viewpager.Login.View.LoginMainActivity;
import com.example.viewpager.MainActivity;
import com.example.viewpager.P.ImPresenter;
import com.example.viewpager.R;
import com.example.viewpager.YouAdapter.Adapasda;
import com.tencent.mmkv.MMKV;

import java.util.Set;
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
    private TextView login;
    private int j;

    @Override
    public int ID() {
        return R.layout.fragment_you_blank;
    }

    @Override
    protected void initView(View view) {
        Adapasda adapasda = new Adapasda(getActivity());


        login = view.findViewById(R.id.tv_you_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Thread(){
                    @Override
                    public void run() {

                        j = 0;
                        MMKV mmkv = MMKV.defaultMMKV();
//                        Set<String> loginInfo = 、
//                        for (String string: loginInfo) {
//                            j++;
//                        }
//                        if (j>0){
//                            Toast.makeText(getContext(), "请勿重复登录", Toast.LENGTH_SHORT).show();
//                        }else{
//
//                            Intent intent = new Intent(getActivity(), LoginMainActivity.class);
//                            startActivityForResult(intent,0);
//                        }


                    }
                }.start();

            }
        });

    }

    @Override
    protected void initData() {

    }

    @Override
    public ImPresenter add() {
        return new ImPresenter();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0&&resultCode==1){
          login.setText("退出登录");
        }
    }
}