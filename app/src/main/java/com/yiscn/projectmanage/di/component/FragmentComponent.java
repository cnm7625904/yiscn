package com.yiscn.projectmanage.di.component;

import android.app.Activity;

import com.yiscn.projectmanage.di.module.FragmentModule;
import com.yiscn.projectmanage.di.scope.FragmentScope;
import com.yiscn.projectmanage.ui.dynamic.fragment.DynamicFragment;
import com.yiscn.projectmanage.ui.event.fragment.EventFragment;
import com.yiscn.projectmanage.ui.homepage.fragment.HomePageFragment;
import com.yiscn.projectmanage.ui.mine.fragment.MineFragment;

import dagger.Component;

/**
 * Created by Administrator on 2018/4/16.
 */
@FragmentScope
@Component(dependencies = AppComponent.class,modules = FragmentModule.class)
public interface FragmentComponent {
    Activity getActivity();
    void inject(DynamicFragment dynamicFragment);//我的页面注入
    void inject(EventFragment eventFragment);//我的页面注入
    void inject(HomePageFragment homePageFragment);//我的页面注入
    void inject(MineFragment mineFragment);//我的页面注入
}
