package com.yiscn.projectmanage.base.contracts;

import com.yiscn.projectmanage.base.BasePresenter;
import com.yiscn.projectmanage.base.BaseView;

/**
 * Created by Administrator on 2018/4/20.
 * 查询列表页
 */

public interface SerchListContrct {
    // UI
   interface SerchListViewIml extends BaseView{

   }
   //数据
   interface Presenter extends BasePresenter<SerchListViewIml>{

   }
}
