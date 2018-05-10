package com.yiscn.projectmanage.presenter.EventFm;


import android.app.Activity;

import com.yiscn.projectmanage.base.Rxpresenter;
import com.yiscn.projectmanage.base.contracts.EventFmContract;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/3/1.
 * 任务fragmetn
 */

public class EventFmPresenter extends Rxpresenter<EventFmContract.View> implements EventFmContract.Presenter {
    @Override
    public void getMsg() {
        mView.showMsg(getsMsg());
    }
    private String getsMsg(){
        return "这是第二个页面";
    }
    private Activity mActivity;
    @Inject
    public EventFmPresenter(Activity mActivity) {
        this.mActivity = mActivity;
    }
}
