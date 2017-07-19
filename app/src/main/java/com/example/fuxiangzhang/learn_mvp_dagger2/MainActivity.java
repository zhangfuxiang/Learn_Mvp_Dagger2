package com.example.fuxiangzhang.learn_mvp_dagger2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.fuxiangzhang.learn_mvp_dagger2.base.app.MyApp;
import com.example.fuxiangzhang.learn_mvp_dagger2.base.di.DaggerNetComponent;
import com.example.fuxiangzhang.learn_mvp_dagger2.base.mvp.BaseActivity;
import com.example.fuxiangzhang.learn_mvp_dagger2.base.di.NetComponent;
import com.example.fuxiangzhang.learn_mvp_dagger2.mvp.MainContract;
import com.example.fuxiangzhang.learn_mvp_dagger2.mvp.MainPersenter;

import javax.inject.Inject;
import javax.inject.Named;

import okhttp3.OkHttpClient;


/**
 * Created by Fuxiang.Zhang on 2017/7/14.
 */

public class MainActivity extends BaseActivity<MainPersenter> implements MainContract.View{


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
//        ((MyApp) getApplication()).getNetComponent().inject(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void loginSucess() {

    }

    @Override
    public void loginFailed() {

    }
}
