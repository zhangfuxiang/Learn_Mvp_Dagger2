package com.example.fuxiangzhang.learn_mvp_dagger2.base.mvp;

/**
 * Created by Fuxiang.Zhang on 2017/7/18.
 */

public class BaseModel<T> {

    private T t;

    public BaseModel(T t){
        this.t=t;
    }

    public T getService(){
        return t;
    }

}
