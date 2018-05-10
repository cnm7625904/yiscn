package com.yiscn.projectmanage.base.contracts;

import com.yiscn.projectmanage.base.BasePresenter;
import com.yiscn.projectmanage.base.BaseView;

/**
 * Created by Administrator on 2018/4/3.
 */

public interface SplashContract {
    //UI
    interface splashViewImpl extends BaseView{
        void jumpToNext();
    }
    //数据
    interface presenterImpl extends BasePresenter<splashViewImpl>{
        void getData();
    }
}
