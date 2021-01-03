package com.example.mylibrary.Utils.Net;

public interface CallBack <I>{
    void OnSuucessHome(I i);

    void OnSuucess(String err);

    void OnErroColl(I i);

    void OnLogin(I i);
}
