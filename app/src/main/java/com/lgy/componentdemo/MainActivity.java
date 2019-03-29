package com.lgy.componentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){
        ARouter.getInstance().build("/account/login").navigation();
    }

    public void share(View view){
        ARouter.getInstance().build("/share/share").withString("share_content","分享到新浪微博").navigation();
    }
}
