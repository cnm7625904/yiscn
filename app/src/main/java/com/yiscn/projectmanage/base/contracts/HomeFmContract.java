package com.yiscn.projectmanage.base.contracts;


import com.yiscn.projectmanage.base.BasePresenter;
import com.yiscn.projectmanage.base.BaseView;
import com.yiscn.projectmanage.model.bean.FuliBean;

/**
 * Created by Administrator on 2018/3/1.
 */

public interface HomeFmContract {
  interface View extends BaseView {
      void showMsg(String msg);
//      void showFuli(FuliBean fuliBean);
  }
  interface Presenter extends BasePresenter<View> {
      void getMsg();
//      void getFuli();
  }
}
