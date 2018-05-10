package com.yiscn.projectmanage.base;

/**
 * Created by Administrator on 2018/2/27.
 */

public interface BasePresenter<T extends BaseView> {
    //加载View
    void attachView(T view);
    //分离View
    void detachView();
}
