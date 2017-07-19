package com.example.fuxiangzhang.learn_mvp_dagger2.di;

import com.example.fuxiangzhang.learn_mvp_dagger2.ActivityScope;
import com.example.fuxiangzhang.learn_mvp_dagger2.base.ApiService;
import com.example.fuxiangzhang.learn_mvp_dagger2.mvp.MainContract;
import com.example.fuxiangzhang.learn_mvp_dagger2.mvp.MainModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Fuxiang.Zhang on 2017/7/19.
 */
@Module
public class MainModule {

    MainContract.View view;

    public MainModule(MainContract.View view){this.view=view;}

    @ActivityScope
    @Provides
    MainContract.View providerView(){return view;}

    @ActivityScope
    @Provides
    MainContract.Model providerModel(ApiService apiService){
        return new MainModel(apiService);
    }
}
