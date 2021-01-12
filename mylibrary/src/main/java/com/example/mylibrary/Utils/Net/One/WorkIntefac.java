package com.example.mylibrary.Utils.Net.One;

import com.example.mylibrary.Utils.Net.One.CallBack;
import com.example.mylibrary.Utils.Net.Two.CallBack1;

import java.util.ArrayList;
import java.util.HashMap;

public interface WorkIntefac {
    <I> void get(String url, CallBack<I> callBack);

    <I> void getColl(int id,CallBack<I> callBack);

    <I> void getLogin(ArrayList<String> list, CallBack<I> callBack);

    <F> void getTab(String url ,CallBack<F> callBack);

    <F> void getClassfiy(int id,CallBack<F> callBack);

    <T> void getUserToke(String url, HashMap<String, String> hashMap, HashMap<String, String> heads, CallBack<T> callBack);

    <T> void getShopping(String url, CallBack<T> callBack);

    <T> void getHomeClick(int  categoryId, CallBack<T> callBack);

    <T> void getHomeSpXq(int  id, CallBack<T> callBack);

    <T> void getHomeGwc(int  id, CallBack<T> callBack);


}
