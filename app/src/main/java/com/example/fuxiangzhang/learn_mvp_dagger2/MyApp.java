package com.example.fuxiangzhang.learn_mvp_dagger2;

import android.app.Application;

import com.example.fuxiangzhang.learn_mvp_dagger2.di.AppModule;
import com.example.fuxiangzhang.learn_mvp_dagger2.mvp.DaggerNetComponent;
import com.example.fuxiangzhang.learn_mvp_dagger2.di.NetComponent;
import com.example.fuxiangzhang.learn_mvp_dagger2.di.NetModule;

/**
 * Created by Fuxiang.Zhang on 2017/7/14.
 */

public class MyApp extends Application {
    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        netComponent= DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("https://api.github.com"))
                .build();
    }

    public NetComponent getNetComponent(){
        return netComponent;
    }
}
