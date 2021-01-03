package com.example.mylibrary.Utils.Net;

public interface WorkIntefac {
    <I> void get(String url,CallBack<I> callBack);

    <I> void getColl(int id,CallBack<I> callBack);
}
