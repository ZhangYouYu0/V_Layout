package com.example.mylibrary.Utils.Net;

import java.util.ArrayList;
import java.util.Map;

public interface WorkIntefac {
    <I> void get(String url,CallBack<I> callBack);

    <I> void getColl(int id,CallBack<I> callBack);

    <I> void getLogin(ArrayList<String> list, CallBack<I> callBack);

    <F> void getTab(String url ,CallBack<F> callBack);

    <F> void getClassfiy(int id,CallBack<F> callBack);
}
