package com.example.fuxiangzhang.learn_mvp_dagger2.mvp;

import com.example.fuxiangzhang.learn_mvp_dagger2.base.mvp.BasePresenter;

import javax.inject.Inject;

/**
 * Created by Fuxiang.Zhang on 2017/7/18.
 */

public class MainPersenter extends BasePresenter<MainContract.Model,MainContract.View> {

    @Inject
    public MainPersenter(MainContract.Model model, MainContract.View mView) {
        super(model, mView);
    }
}
