package com.yiscn.projectmanage.presenter.main;

import com.yiscn.projectmanage.base.Rxpresenter;
import com.yiscn.projectmanage.base.contracts.TestContract;
import com.yiscn.projectmanage.model.DataManager;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/4/19.
 */

public class TestPresenter extends Rxpresenter<TestContract.ViewTestIml> implements TestContract.PresenterIml{

    private DataManager dataManager;

    @Inject
    public TestPresenter(DataManager dataManager) {
        this.dataManager = dataManager;
    }
}
