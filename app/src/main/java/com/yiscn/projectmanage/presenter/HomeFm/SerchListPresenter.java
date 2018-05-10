package com.yiscn.projectmanage.presenter.HomeFm;

import com.yiscn.projectmanage.base.Rxpresenter;
import com.yiscn.projectmanage.base.contracts.SerchListContrct;
import com.yiscn.projectmanage.model.DataManager;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/4/20.
 */

public class SerchListPresenter extends Rxpresenter<SerchListContrct.SerchListViewIml> implements SerchListContrct.Presenter {
    private DataManager mDataManager;

    @Inject
    public SerchListPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }
}
