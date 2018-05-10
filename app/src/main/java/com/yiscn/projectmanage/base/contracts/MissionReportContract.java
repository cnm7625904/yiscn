package com.yiscn.projectmanage.base.contracts;

import com.yiscn.projectmanage.base.BasePresenter;
import com.yiscn.projectmanage.base.BaseView;

/**
 * Created by Administrator on 2018/5/9.
 * 任务汇报
 */

public interface MissionReportContract {
    //UI
    interface MissionReportViewImp extends BaseView{

    }
    //DATA
    interface Presenter extends BasePresenter<MissionReportViewImp>{

    }
}
