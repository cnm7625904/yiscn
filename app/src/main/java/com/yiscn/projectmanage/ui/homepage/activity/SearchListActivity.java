package com.yiscn.projectmanage.ui.homepage.activity;

import com.yiscn.projectmanage.R;
import com.yiscn.projectmanage.base.BaseActivity;
import com.yiscn.projectmanage.base.contracts.SerchListContrct;
import com.yiscn.projectmanage.di.component.ActivityComponent;
import com.yiscn.projectmanage.presenter.HomeFm.SerchListPresenter;

/**
 * Created by Administrator on 2018/4/20.
 * 查询列表页面
 */

public class SearchListActivity extends BaseActivity<SerchListPresenter> implements SerchListContrct.SerchListViewIml{

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
        getActivityConponent().inject(SearchListActivity.this);
    }

    @Override
    public int layoutId() {
        return R.layout.layout_serchlist;
    }

    @Override
    public void initEventAndData() {

    }

    @Override
    public void clicks() {

    }
}
