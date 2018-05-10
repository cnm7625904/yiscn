package com.yiscn.projectmanage.base.contracts;

import com.yiscn.projectmanage.base.BasePresenter;
import com.yiscn.projectmanage.base.BaseView;

/**
 * Created by Administrator on 2018/4/4.
 */

public interface HomePageContract {
//UI
    interface HomeViewImpl extends BaseView{

}
//PRESENTER
    interface PresenterImpl extends BasePresenter<HomeViewImpl>{

}

}
