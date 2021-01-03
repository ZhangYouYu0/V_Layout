package com.example.viewpager.Login.Mode;

import com.example.mylibrary.Utils.Net.CallBack;
import com.example.mylibrary.Utils.Net.RetrofitUtils;
import com.example.viewpager.Login.Contract.C;
import com.example.viewpager.Login.Prsenter.IPresneter;

import java.util.ArrayList;
import java.util.Map;

public class IMode implements C.Mode{
    IPresneter presneter;

    public IMode(IPresneter presneter) {
        this.presneter = presneter;
    }



    @Override
    public <I> void Mode(ArrayList<String> map, CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUils().getLogin(map,callBack);
    }
}
