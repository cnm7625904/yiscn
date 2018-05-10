package com.yiscn.projectmanage.di.module;

import android.app.Activity;

import com.yiscn.projectmanage.di.scope.ActivityScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/4/8.
 */
@Module
public class ActivityModule {
private Activity mActivity;

    public ActivityModule(Activity mActivity) {
        this.mActivity = mActivity;
    }
    @ActivityScope
    @Provides
    public Activity provideActivity(){
        return mActivity;
    }
}
