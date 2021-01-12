package com.example.viewpager.Login.Mode.StartMode;

import com.example.mylibrary.Utils.Net.One.CallBack;
import com.example.mylibrary.Utils.Net.One.RetrofitUtils;
import com.example.viewpager.Login.Contract.StartContract.C;

import java.util.HashMap;

public class StartMode implements C.StartMode {
    @Override
    public <T> void refreshToken(String url, HashMap<String, String> hashMap, HashMap<String, String> heads, CallBack<T> callBack) {
        RetrofitUtils.getRetrofitUils().getUserToke(url,hashMap,heads,callBack);
    }
}
