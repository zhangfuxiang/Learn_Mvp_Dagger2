package com.example.fuxiangzhang.learn_mvp_dagger2.base.app;

import android.app.Application;

import com.example.fuxiangzhang.learn_mvp_dagger2.base.di.AppModule;
import com.example.fuxiangzhang.learn_mvp_dagger2.base.di.DaggerNetComponent;
import com.example.fuxiangzhang.learn_mvp_dagger2.base.di.NetComponent;
import com.example.fuxiangzhang.learn_mvp_dagger2.base.di.NetModule;

/**
 * Created by Fuxiang.Zhang on 2017/7/14.
 */

public class MyApp extends Application {

    private NetComponent netComponent;


/*    public MyApp getMyApplication(){
        return this;
    }*/

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
