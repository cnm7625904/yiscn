package com.yiscn.projectmanage.ui.login;

import com.yiscn.projectmanage.R;
import com.yiscn.projectmanage.base.BaseActivity;
import com.yiscn.projectmanage.base.contracts.TestContract;
import com.yiscn.projectmanage.presenter.main.TestPresenter;

/**
 * Created by Administrator on 2018/4/19.
 */

public class TestActivity extends BaseActivity<TestPresenter> implements TestContract.ViewTestIml{

    @Override
    public void showErrorMsg(String msg) {

    }

    @Override
    public void showPro() {

    }

    @Override
    public void hidePro() {

    }

    @Override
    protected void initInject() {

    }

    @Override
    public int layoutId() {
        return R.layout.layout_testactivity;
    }

    @Override
    public void initEventAndData() {

    }

    @Override
    public void clicks() {

    }
}
