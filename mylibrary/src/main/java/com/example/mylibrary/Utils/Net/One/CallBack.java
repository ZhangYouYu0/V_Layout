package com.example.mylibrary.Utils.Net.One;

public interface CallBack <I>{
    void OnSuucessHome(I i);

    void OnSuucess(String err);

    void OnSuucessColl(I i);

    void OnSuucessTab(I i);

    void OnSuucessClassfiy(I i);

    void OnSuucessUserToke(I i);


    void OnSuucessShopping(I i);

    void OnSuucessHomeClick(I i);


    void OnSuucessHomeSpXq(I i);

    void OnSuucessGWC(I i);

    void OnLogin(I i);
}
