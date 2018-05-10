package com.yiscn.projectmanage.model.http;

import com.yiscn.projectmanage.model.bean.AndroidListBean;
import com.yiscn.projectmanage.model.bean.GankItemBean;
import com.yiscn.projectmanage.model.http.response.GankHttpResponse;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by Administrator on 2018/4/16.
 * 网络请求
 */

public interface HttpHelper {
    Flowable<GankHttpResponse<List<GankItemBean>>> fetchTechList(String tech, int num, int page);
}
