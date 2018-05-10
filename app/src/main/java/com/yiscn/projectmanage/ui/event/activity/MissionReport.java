package com.yiscn.projectmanage.ui.event.activity;

import android.support.v7.app.AppCompatActivity;

import com.yiscn.projectmanage.R;
import com.yiscn.projectmanage.base.BaseActivity;
import com.yiscn.projectmanage.base.contracts.MissionReportContract;
import com.yiscn.projectmanage.di.component.ActivityComponent;
import com.yiscn.projectmanage.presenter.EventFm.MissionRepotPresenter;

/**
 * Created by Administrator on 2018/5/9.
 * 任务汇报页面
 */

public class MissionReport extends BaseActivity<MissionRepotPresenter> implements MissionReportContract.MissionReportViewImp{

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
        getActivityConponent().inject(this);
    }

    @Override
    public int layoutId() {
        return R.layout.layout_missionreport;
    }

    @Override
    public void initEventAndData() {

    }

    @Override
    public void clicks() {

    }
}
