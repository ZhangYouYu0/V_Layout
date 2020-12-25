package com.example.mylibrary.Base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.zip.Inflater;

public abstract class BaseFragment<p extends BasePresenter>  extends Fragment implements BaseView{
    public p presenter;
//    View inflate = inflater.inflate(ID(), container, false);
    private Context context =getActivity();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(ID(), container, false);
        if(presenter==null){
            presenter=add();
            presenter.attch(this);
        }
        initView(inflate);
        initData();
        return inflate;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.destroy();
    }

    public abstract int ID();
    protected abstract void initView(View view);
    protected abstract void initData();
    public abstract p  add();
}
