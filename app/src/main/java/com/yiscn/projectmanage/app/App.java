package com.yiscn.projectmanage.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;


import com.yiscn.projectmanage.di.component.AppComponent;
import com.yiscn.projectmanage.di.component.DaggerAppComponent;
import com.yiscn.projectmanage.di.module.AppModule;
import com.yiscn.projectmanage.di.module.HttpModule;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2018/4/3.
 */

public class App extends Application {
    private static App instance;
    private Set<Activity> allActivities;
        public static AppComponent appComponent;
    public static synchronized App getInstance(){
        return instance;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
    public void addActivity(Activity act){
        if(allActivities==null){
            allActivities=new HashSet<>();
        }
        allActivities.add(act);
    }
    public void removeActivity(Activity act){
        if(allActivities!=null){
            allActivities.remove(act);
        }
    }

    public static AppComponent getAppComponent(){
        if(appComponent ==null){
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(instance))
                    .httpModule(new HttpModule())
                    .build();
        }
        return appComponent;
    }
}