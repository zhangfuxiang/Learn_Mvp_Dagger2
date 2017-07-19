package com.example.fuxiangzhang.learn_mvp_dagger2.mvp;

import com.example.fuxiangzhang.learn_mvp_dagger2.base.ApiService;
import com.example.fuxiangzhang.learn_mvp_dagger2.base.mvp.BaseModel;

/**
 * Created by Fuxiang.Zhang on 2017/7/18.
 */

public class MainModel extends BaseModel<ApiService> implements MainContract.Model{

    public MainModel(ApiService apiService) {
        super(apiService);
    }
}
