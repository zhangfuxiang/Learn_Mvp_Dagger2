package com.example.fuxiangzhang.learn_mvp_dagger2.di;

import com.example.fuxiangzhang.learn_mvp_dagger2.ActivityScope;
import com.example.fuxiangzhang.learn_mvp_dagger2.MainActivity;
import com.example.fuxiangzhang.learn_mvp_dagger2.base.di.NetComponent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Fuxiang.Zhang on 2017/7/19.
 */
@ActivityScope
@Component(modules = MainModule.class,dependencies = NetComponent.class)
public interface MainComponent {

    void inject(MainActivity activity);
}
