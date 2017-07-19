package com.example.fuxiangzhang.learn_mvp_dagger2.base.di;

import android.app.Application;
import android.content.SharedPreferences;


import com.example.fuxiangzhang.learn_mvp_dagger2.base.ApiService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Fuxiang.Zhang on 2017/7/14.
 */
@Singleton
@Component(modules = {AppModule.class,NetModule.class,ServiceModule.class})
public interface NetComponent {

    Application application();

    ApiService apiService();

    SharedPreferences sharedPreferences();

}
