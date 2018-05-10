package com.yiscn.projectmanage.base.contracts;

import com.yiscn.projectmanage.base.BasePresenter;
import com.yiscn.projectmanage.base.BaseView;

/**
 * Created by Administrator on 2018/4/4.
 */

public interface LoginContract {
    //UI
    interface loginViewImpl extends BaseView{
         void jumpToHomePage();//进入主页
    }
    //presenter
    interface PresenterImpl extends BasePresenter<loginViewImpl>{
        void Login();//登录方法
    }
}
