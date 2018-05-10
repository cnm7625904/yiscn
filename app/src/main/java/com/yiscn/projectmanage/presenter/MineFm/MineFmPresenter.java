package com.yiscn.projectmanage.presenter.MineFm;


import android.app.Activity;

import com.yiscn.projectmanage.base.Rxpresenter;
import com.yiscn.projectmanage.base.contracts.MineFgContract;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/3/1.
 */

public class MineFmPresenter extends Rxpresenter<MineFgContract.View> implements MineFgContract.Presenter {
    @Override
    public void getMsg() {
        mView.showMsg(getsMsg());
    }
    private String getsMsg(){
        return "这是第四个页面";
    }
    private Activity mActivity;
    @Inject
    public MineFmPresenter(Activity mActivity) {
        this.mActivity = mActivity;
    }
}
