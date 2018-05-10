package com.yiscn.projectmanage.presenter.DynamicFm;

import android.app.Activity;

import com.yiscn.projectmanage.base.Rxpresenter;
import com.yiscn.projectmanage.base.contracts.DynamicFmContract;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/3/1.
 */

public class DynamicFmPresenter extends Rxpresenter<DynamicFmContract.View> implements DynamicFmContract.Presenter {
    private Activity mActivity;
    @Inject
    public DynamicFmPresenter(Activity mActivity) {
        this.mActivity = mActivity;
    }

    @Override
    public void getMsg() {
        mView.showMsg(getsMsg());
    }
    private String getsMsg(){
        return "这是第三个页面";
    }
}
