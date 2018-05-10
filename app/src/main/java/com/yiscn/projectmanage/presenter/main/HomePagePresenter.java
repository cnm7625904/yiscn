package com.yiscn.projectmanage.presenter.main;

import android.app.Activity;

import com.yiscn.projectmanage.base.Rxpresenter;
import com.yiscn.projectmanage.base.contracts.HomePageContract;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/4/4.
 */

public class HomePagePresenter extends Rxpresenter<HomePageContract.HomeViewImpl> implements HomePageContract.PresenterImpl{
    private Activity mActivity;
    @Inject
    public HomePagePresenter(Activity mActivity) {
        this.mActivity = mActivity;
    }
}
