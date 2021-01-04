package com.example.viewpager.Login.View;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.mylibrary.Base.BaseActivity;
import com.example.viewpager.CollAdaoter.MainLinearAdapter1;
import com.example.viewpager.Fragment.CollBlankFragment;
import com.example.viewpager.Fragment.YouBlankFragment;
import com.example.viewpager.Login.Contract.C;
import com.example.viewpager.Login.Prsenter.IPresneter;
import com.example.viewpager.MainActivity;
import com.example.viewpager.R;
import com.example.viewpager.YouAdapter.Adapasda;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.logging.LogRecord;

public class LoginMainActivity extends BaseActivity<IPresneter> implements View.OnClickListener , C.View {

    private EditText username;
    private EditText userpws;
    private CheckBox check;
    private Button bnt;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            if(msg.what==1){
                Intent intent = new Intent(LoginMainActivity.this, Adapasda.class);
                setResult(1,intent);
                finish();
            }
        }
    };
    int anInt=0;
    @Override
    protected int ID() {
        return R.layout.activity_login_main;
    }

    @Override
    protected void initData() {

    }


    @Override
    protected void initView() {
        username = findViewById(R.id.Ed_user_name);
        userpws = findViewById(R.id.Ed_user_pws);
        check = findViewById(R.id.checked_login);
        bnt = findViewById(R.id.bnt_login);

        check.setOnClickListener(this);
        bnt.setOnClickListener(this);
    }


    @Override
    protected IPresneter add() {
        return new IPresneter();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.checked_login:
                //Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                anInt++;
                if(anInt%2==0&&anInt!=0){
                    anInt=0;
                }else{
                    anInt=5;
                }
                break;
            case R.id.bnt_login:
                String name = username.getText().toString();
                String pws = userpws.getText().toString();
                if(TextUtils.isEmpty(name)){
                    Toast.makeText(this, "用户：不能输入内容为：NULL", Toast.LENGTH_SHORT).show();
                }else{

                    if(TextUtils.isEmpty(pws)){
                        Toast.makeText(this, "密码：不能输入内容为：NULL", Toast.LENGTH_SHORT).show();
                    }else{

                        if(anInt!=5){
                            Toast.makeText(this, "请先勾选记住密码", Toast.LENGTH_SHORT).show();
                        }else{
                            ArrayList<String> list = new ArrayList<>();
                            list.add(name);
                            list.add(pws);
                            presenter.P(list);
                        }

                    }

                }
             
             //   Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void OnCg() {
        Log.e("TAG", "OnCg: 登录成功" );
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();

        handler.sendEmptyMessage(1);
     //
    }

    @Override
    public void OnFail(String err) {
        Log.e("TAG", "OnCg: 登录失败"+err);
        Toast.makeText(this, "登录失败"+err, Toast.LENGTH_SHORT).show();

    }
}