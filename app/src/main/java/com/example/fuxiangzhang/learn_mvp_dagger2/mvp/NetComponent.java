package com.example.fuxiangzhang.learn_mvp_dagger2.mvp;

import com.example.fuxiangzhang.learn_mvp_dagger2.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Fuxiang.Zhang on 2017/7/14.
 */
@Singleton
@Component(modules = {AppModule.class,NetModule.class})
public interface NetComponent {

    void inject(MainActivity activity);

}
