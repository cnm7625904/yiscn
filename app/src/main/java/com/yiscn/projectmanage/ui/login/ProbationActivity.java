package com.yiscn.projectmanage.ui.login;

import com.yiscn.projectmanage.R;
import com.yiscn.projectmanage.base.BaseActivity;
import com.yiscn.projectmanage.base.contracts.ProbationContract;
import com.yiscn.projectmanage.presenter.main.ProbationPresenter;

/**
 * Created by Administrator on 2018/4/23.
 * 试用新建页面
 */

public class ProbationActivity extends BaseActivity<ProbationPresenter> implements ProbationContract.ProbationViewImp{

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
        return R.layout.layout_probation;
    }

    @Override
    public void initEventAndData() {

    }

    @Override
    public void clicks() {

    }
}
