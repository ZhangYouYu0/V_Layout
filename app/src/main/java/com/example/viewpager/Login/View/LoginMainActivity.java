package com.example.viewpager.Login.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mylibrary.Base.BaseActivity;
import com.example.mylibrary.Base.BasePresenter;
import com.example.viewpager.R;

public class LoginMainActivity extends BaseActivity implements View.OnClickListener {

    private EditText username;
    private EditText userpws;
    private CheckBox check;
    private Button bnt;


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
    protected BasePresenter add() {
        return null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.checked_login:
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bnt_login:
                Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}