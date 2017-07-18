package com.example.fuxiangzhang.learn_mvp_dagger2.mvp;

import rx.Observable;

/**
 * Created by Fuxiang.Zhang on 2017/7/18.
 */

public class MainContract {

    interface Model{

    }

    interface View {
        void loginSucess();
        void loginFailed();
    }
}
