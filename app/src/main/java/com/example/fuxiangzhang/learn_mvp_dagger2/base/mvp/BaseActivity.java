package com.example.fuxiangzhang.learn_mvp_dagger2.base.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.fuxiangzhang.learn_mvp_dagger2.di.NetComponent;

import javax.inject.Inject;

/**
 * Created by Fuxiang.Zhang on 2017/7/18.
 */

public abstract class BaseActivity<p extends BasePresenter> extends AppCompatActivity {
    public final String TAG = getClass().getSimpleName();

    @Inject
    protected p mPresenter;


    protected abstract void initData();
    protected abstract void initView();
    protected abstract int getContentViewId();
    protected abstract void componentInject(NetComponent netComponent);
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        initData();
        initView();

    }

    public p getPresenter() {
        return mPresenter;
    }
}
