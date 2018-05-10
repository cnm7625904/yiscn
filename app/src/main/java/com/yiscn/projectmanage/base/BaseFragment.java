package com.yiscn.projectmanage.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;


import com.yiscn.projectmanage.app.App;
import com.yiscn.projectmanage.di.component.DaggerFragmentComponent;
import com.yiscn.projectmanage.di.component.FragmentComponent;
import com.yiscn.projectmanage.di.module.FragmentModule;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/3/1.
 */

public abstract class BaseFragment<T extends BasePresenter> extends SimpleFragment implements BaseView {
@Inject
protected T mPresenter;
    protected FragmentComponent getFragmentConponent(){
        return DaggerFragmentComponent.builder()
                .appComponent(App.getAppComponent())
                .fragmentModule(getFragmentModule())
                .build();
    }
    protected FragmentModule getFragmentModule(){
        return new FragmentModule(this);
    }

    public static String TAG="";
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        initInject();
        mPresenter.attachView(this);
        TAG=getClass().getSimpleName();
        super.onViewCreated(view, savedInstanceState);


    }


    @Override
    public void onDestroyView() {
        if (mPresenter != null) mPresenter.detachView();
        super.onDestroyView();
    }

    protected abstract void initInject();
}
