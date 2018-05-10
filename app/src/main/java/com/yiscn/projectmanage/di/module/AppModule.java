package com.yiscn.projectmanage.di.module;
import com.yiscn.projectmanage.app.App;
import com.yiscn.projectmanage.model.DataManager;
import com.yiscn.projectmanage.model.http.HttpHelper;
import com.yiscn.projectmanage.model.http.RetrofitHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/4/8.
 */
@Module
public class AppModule {
    private final App application;

    public AppModule(App application) {
        this.application = application;
    }

    @Provides
    @Singleton
    App provideApplicationContext() {
        return application;
    }

//    @Provides
//    @Singleton
//    HttpHelper provideHttpHelper(RetrofitHelper retrofitHelper) {
//        return retrofitHelper;
//    }
@Provides
@Singleton
HttpHelper provideHttpHelper(RetrofitHelper retrofitHelper) {
    return retrofitHelper;
}
    @Provides
    @Singleton
    DataManager provideDataManager(HttpHelper httpHelper) {
        return new DataManager(httpHelper);
    }
}
