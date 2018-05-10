package com.yiscn.projectmanage.base;


import com.yiscn.projectmanage.app.App;
import com.yiscn.projectmanage.di.component.ActivityComponent;
import com.yiscn.projectmanage.di.component.DaggerActivityComponent;
import com.yiscn.projectmanage.di.module.ActivityModule;

import javax.inject.Inject;

public abstract class BaseActivity<T extends BasePresenter> extends SimpleActivity implements BaseView {
    public static String TAG="";
    @Inject
    protected T mPresenter;
    protected ActivityComponent getActivityConponent(){
        return DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(getActivityModule())
                .build();

    }
    protected ActivityModule getActivityModule(){
        return new ActivityModule(this);
    }
    @Override
    protected void onViewCreat() {
        super.onViewCreat();
        TAG=getClass().getSimpleName();
        initInject();
        if(mPresenter!=null){
            mPresenter.attachView(this);
        }

    }
    @Override
    protected void onDestroy() {
        if(mPresenter!=null){
            mPresenter.detachView();
        }
        super.onDestroy();

    }
    protected abstract void initInject();
}