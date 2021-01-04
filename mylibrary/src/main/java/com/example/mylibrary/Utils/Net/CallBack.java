package com.example.mylibrary.Utils.Net;

public interface CallBack <I>{
    void OnSuucessHome(I i);

    void OnSuucess(String err);

    void OnSuucessColl(I i);

    void OnSuucessTab(I i);

    void OnSuucessClassfiy(I i);

    void OnLogin(I i);
}
