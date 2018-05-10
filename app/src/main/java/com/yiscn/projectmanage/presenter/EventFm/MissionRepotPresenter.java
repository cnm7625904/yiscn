package com.yiscn.projectmanage.presenter.EventFm;

import android.app.Activity;

import com.yiscn.projectmanage.base.Rxpresenter;
import com.yiscn.projectmanage.base.contracts.MissionReportContract;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/5/9.
 */

public class MissionRepotPresenter extends Rxpresenter<MissionReportContract.MissionReportViewImp> implements MissionReportContract.Presenter{
    private Activity mActivity;
    @Inject
    public MissionRepotPresenter(Activity activity){
        this.mActivity=activity;
    }
}
