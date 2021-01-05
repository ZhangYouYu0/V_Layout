package com.example.viewpager.Login.Contract.StartContract;

import com.example.mylibrary.Base.BaseMode;
import com.example.mylibrary.Base.BaseView;
import com.example.mylibrary.Utils.Net.CallBack;

import java.util.HashMap;

public class C {
    public interface StartMode extends BaseMode {
        <T> void refreshToken(String url, HashMap<String,String> hashMap, HashMap<String,String> heads, CallBack<T> callBack);
    }
    public interface StartPresenter {
        void startpresenter();
    }

    public interface StartView extends BaseView {

        void tokenRefreshSuccess();

        //提示用户
        void tokenInvalid();
    }
}
