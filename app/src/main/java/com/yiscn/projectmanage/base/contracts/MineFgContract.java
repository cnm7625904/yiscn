package com.yiscn.projectmanage.base.contracts;


import com.yiscn.projectmanage.base.BasePresenter;
import com.yiscn.projectmanage.base.BaseView;

/**
 * Created by Administrator on 2018/3/1.
 */

public interface MineFgContract {
  interface View extends BaseView {
      void showMsg(String msg);
  }
  interface Presenter extends BasePresenter<View> {
      void getMsg();
  }
}
