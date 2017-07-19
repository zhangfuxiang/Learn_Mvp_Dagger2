package com.example.fuxiangzhang.learn_mvp_dagger2.base.di;

import com.example.fuxiangzhang.learn_mvp_dagger2.base.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Fuxiang.Zhang on 2017/7/19.
 */
@Module
public class ServiceModule {

    @Singleton
    @Provides
    ApiService provideApiService(Retrofit retrofit){
        return retrofit.create(ApiService.class);
    }
}
