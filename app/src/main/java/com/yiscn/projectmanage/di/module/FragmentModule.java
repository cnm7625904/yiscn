package com.yiscn.projectmanage.di.module;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.yiscn.projectmanage.di.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/4/16.
 */
@Module
public class FragmentModule {
    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }
    private Fragment fragment;
    @Provides
    @FragmentScope
    public Activity provideActivity(){
        return  fragment.getActivity();
    }
}
