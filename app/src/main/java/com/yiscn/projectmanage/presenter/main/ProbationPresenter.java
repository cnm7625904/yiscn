package com.yiscn.projectmanage.presenter.main;

import com.yiscn.projectmanage.base.Rxpresenter;
import com.yiscn.projectmanage.base.contracts.ProbationContract;
import com.yiscn.projectmanage.model.DataManager;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/4/23.
 */

public class ProbationPresenter extends Rxpresenter<ProbationContract.ProbationViewImp> implements ProbationContract.Presenter{

    private DataManager dataManager;

    @Inject
    public ProbationPresenter(DataManager dataManager) {
        this.dataManager = dataManager;
    }
}
