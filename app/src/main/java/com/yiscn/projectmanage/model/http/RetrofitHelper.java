package com.yiscn.projectmanage.model.http;

        import com.yiscn.projectmanage.model.bean.GankItemBean;
        import com.yiscn.projectmanage.model.http.api.GankApis;
        import com.yiscn.projectmanage.model.http.response.GankHttpResponse;

        import java.util.List;

        import javax.inject.Inject;

        import io.reactivex.Flowable;

/**
 * Created by Administrator on 2018/4/16.
 */

public class  RetrofitHelper implements HttpHelper {
    private GankApis mGankApiService;
    @Inject
    public RetrofitHelper(GankApis gankApis) {
        this.mGankApiService=gankApis;
    }

    @Override
    public Flowable<GankHttpResponse<List<GankItemBean>>> fetchTechList(String tech, int num, int page) {
        return mGankApiService.getTechList(tech, num, page);
    }
}
