package com.example.viewpager.Login;

import com.example.viewpager.Login.Bean.FooLoginBean;
import com.example.viewpager.Login.Bean.StartBean.FooTokeBean;
import com.example.viewpager.Login.app.MyApplication;
import com.tencent.mmkv.MMKV;

public class UserInfoUtils {
    public static boolean isSave = true;

    public static FooLoginBean.DataDTO getLoginInfo(){


        return null;
    }

    public static void setToken(){
        if(isSave){
            MMKV mmkv = MMKV.defaultMMKV();
            mmkv.encode("token","");
        }else{
            MyApplication.dataDTO.setToken("");
        }
    }
}
