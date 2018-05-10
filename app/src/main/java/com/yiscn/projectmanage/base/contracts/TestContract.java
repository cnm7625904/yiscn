package com.yiscn.projectmanage.base.contracts;

import com.yiscn.projectmanage.base.BasePresenter;
import com.yiscn.projectmanage.base.BaseView;

/**
 * Created by Administrator on 2018/4/19.
 * 试用页面
 */

public interface TestContract {
interface ViewTestIml extends BaseView{

}
interface PresenterIml extends BasePresenter<ViewTestIml>{

}

}
