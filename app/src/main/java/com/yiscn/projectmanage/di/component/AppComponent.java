package com.yiscn.projectmanage.di.component;

import com.yiscn.projectmanage.app.App;
import com.yiscn.projectmanage.di.module.AppModule;
import com.yiscn.projectmanage.di.module.HttpModule;
import com.yiscn.projectmanage.model.DataManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2018/4/8.
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {
App getContext();//提供APP的Context
    DataManager getDataManager();//数据中心
}
