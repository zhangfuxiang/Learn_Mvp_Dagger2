package com.example.fuxiangzhang.learn_mvp_dagger2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.fuxiangzhang.learn_mvp_dagger2.base.mvp.BaseActivity;
import com.example.fuxiangzhang.learn_mvp_dagger2.di.NetComponent;

import javax.inject.Inject;
import javax.inject.Named;

import okhttp3.OkHttpClient;


/**
 * Created by Fuxiang.Zhang on 2017/7/14.
 */

public class MainActivity extends BaseActivity {

    @Inject @Named("cached")
    OkHttpClient client;
    @Inject @Named("non_cached")
    OkHttpClient client2;
    @Inject
    SharedPreferences sharedPreferences;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void componentInject(NetComponent netComponent) {
        ((MyApp) getApplication()).getNetComponent().inject(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
