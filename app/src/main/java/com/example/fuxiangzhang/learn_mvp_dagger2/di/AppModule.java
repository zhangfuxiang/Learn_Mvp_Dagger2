package com.example.fuxiangzhang.learn_mvp_dagger2.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Fuxiang.Zhang on 2017/7/14.
 */
@Module
public class AppModule {

    Application application;

    public AppModule(Application application){
        this.application=application;
    }

    @Provides
    @Singleton
    Application providersApplication(){
        return application;
    }
}
