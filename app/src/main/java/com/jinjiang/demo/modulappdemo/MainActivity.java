package com.jinjiang.demo.modulappdemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.github.mzule.activityrouter.router.Routers;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.app_to_login)
    void toLogin(){
        Routers.open(MainActivity.this, Uri.parse("jinjiangapp://login"));
    }

    @OnClick(R.id.app_to_pay)
    void toPay(){
        Routers.open(MainActivity.this, Uri.parse("jinjiangapp://payment_proxy"));
    }
}
