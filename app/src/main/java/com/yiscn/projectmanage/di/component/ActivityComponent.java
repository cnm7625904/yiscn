package com.yiscn.projectmanage.di.component;

import android.app.Activity;

import com.yiscn.projectmanage.ui.event.activity.MissionReport;
import com.yiscn.projectmanage.ui.homepage.activity.SearchListActivity;
import com.yiscn.projectmanage.ui.login.LoginActivity;
import com.yiscn.projectmanage.ui.login.SplashActivity;
import com.yiscn.projectmanage.di.module.ActivityModule;
import com.yiscn.projectmanage.di.scope.ActivityScope;
import com.yiscn.projectmanage.ui.login.TestActivity;

import dagger.Component;

/**
 * Created by Administrator on 2018/4/8.
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity getActivity();
    void inject(SplashActivity splashActivity); //闪屏页
    void inject(LoginActivity loginActivity); //登录页
    void inject(TestActivity testActivity); //试用页面
    void inject(SearchListActivity serchListActivity);//查询列表页面
    void inject(MissionReport missionReportActivity);//任务汇报页面
}
