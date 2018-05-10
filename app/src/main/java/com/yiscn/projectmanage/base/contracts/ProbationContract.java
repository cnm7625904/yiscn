package com.yiscn.projectmanage.base.contracts;

import com.yiscn.projectmanage.base.BasePresenter;
import com.yiscn.projectmanage.base.BaseView;

/**
 * Created by Administrator on 2018/4/23.
 */

public interface ProbationContract {
  //UI
    interface ProbationViewImp extends BaseView{}

  //DATA
    interface Presenter extends BasePresenter<ProbationViewImp>{

  }
}
