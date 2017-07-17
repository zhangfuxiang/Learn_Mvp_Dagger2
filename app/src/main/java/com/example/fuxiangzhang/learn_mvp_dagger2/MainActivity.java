package com.example.fuxiangzhang.learn_mvp_dagger2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import okhttp3.OkHttpClient;


/**
 * Created by Fuxiang.Zhang on 2017/7/14.
 */

public class MainActivity extends AppCompatActivity {

    @Inject
    OkHttpClient mOkHttpClient;
    @Inject
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApp) getApplication()).getNetComponent().inject(this);
    }
}
