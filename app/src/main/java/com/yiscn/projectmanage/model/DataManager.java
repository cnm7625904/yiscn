package com.yiscn.projectmanage.model;

import com.yiscn.projectmanage.model.bean.GankItemBean;
import com.yiscn.projectmanage.model.db.DBHelper;
import com.yiscn.projectmanage.model.http.HttpHelper;
import com.yiscn.projectmanage.model.http.response.GankHttpResponse;
import com.yiscn.projectmanage.model.prefs.PreferencesHelper;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by Administrator on 2018/4/8.
 * 网络数据储存综合接口
 */

public class DataManager implements HttpHelper,DBHelper,PreferencesHelper {
    HttpHelper mHttpHelper;
    DBHelper mDbHelper;
    PreferencesHelper mPreferencesHelper;

    public DataManager(HttpHelper mHttpHelper) {
        this.mHttpHelper = mHttpHelper;
    }

    @Override
    public Flowable<GankHttpResponse<List<GankItemBean>>> fetchTechList(String tech, int num, int page) {
        return mHttpHelper.fetchTechList(tech, num, page);
    }
//
//    /**
//     *
//     * @param teck 类型
//     * @param num 数量
//     * @param page 页数
//     * @return
//     */
//    @Override
//    public Flowable<GankHttpResponse<List<GankItemBean>>> fetchTechList(String teck, int num, int page) {
//        return mHttpHelper.fetchTechList(teck, num, page);
//    }
}


