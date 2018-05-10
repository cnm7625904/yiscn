package com.yiscn.projectmanage.model.http.api;


import com.yiscn.projectmanage.model.bean.FuliBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2018/3/8.
 */

public interface apiService {
    @GET("api/data/福利/10/1")
    Observable<FuliBean> getFuli();

}
