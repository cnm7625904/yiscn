package com.yiscn.projectmanage.model.http.api;

import com.yiscn.projectmanage.model.bean.GankItemBean;
import com.yiscn.projectmanage.model.http.response.GankHttpResponse;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2018/4/17.
 */

public interface GankApis {
    String HOST = "http://gank.io/api/";

    /**
     * 技术文章列表
     */
    @GET("data/{tech}/{num}/{page}")
    Flowable<GankHttpResponse<List<GankItemBean>>> getTechList(@Path("tech") String tech, @Path("num") int num, @Path("page") int page);
}
