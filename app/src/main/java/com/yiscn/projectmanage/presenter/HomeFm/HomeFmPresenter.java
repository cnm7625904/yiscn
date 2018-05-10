package com.yiscn.projectmanage.presenter.HomeFm;


import android.app.Activity;

import com.yiscn.projectmanage.base.Rxpresenter;
import com.yiscn.projectmanage.base.contracts.HomeFmContract;
import com.yiscn.projectmanage.model.DataManager;
import com.yiscn.projectmanage.model.bean.GankItemBean;
import com.yiscn.projectmanage.model.http.response.GankHttpResponse;
import com.yiscn.projectmanage.tool.RxTool;
import com.yiscn.projectmanage.widget.CommonSubscriber;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/3/1.
 */

public class HomeFmPresenter extends Rxpresenter<HomeFmContract.View> implements HomeFmContract.Presenter {
    @Override
    public void getMsg() {
//        mView.showMsg(getsMsg());
       addSubscribe(mDataManager.fetchTechList("Android",10,1)
       .compose(RxTool.<GankHttpResponse<List<GankItemBean>>>rxSchedulerHelper())
               .compose(RxTool.<List<GankItemBean>>handleResult())
               .subscribeWith(new CommonSubscriber<List<GankItemBean>>(mView) {
                   @Override
                   public void onNext(List<GankItemBean> gankItemBeans) {
                       mView.showMsg(gankItemBeans.get(0).getUrl());
                   }

                   @Override
                   public void onError(Throwable e) {
                       super.onError(e);
                   }
               })
       );


    }

//    @Override
//    public void getFuli() {
//        Observable<FuliBean> fuliBeanObservable= RetrofitFactory.getInstance().getFuli();
//        fuliBeanObservable.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<FuliBean>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(FuliBean fuliBean) {
//
//                        Log.e("请求成功", fuliBean.getResults().get(0).getUrl()+"");
//                        mView.showFuli(fuliBean);
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });
//    }


//    private String getsMsg(){
//        return "这是第一个页面";
//    }
private DataManager mDataManager;
    @Inject
    public HomeFmPresenter(DataManager mActivity) {
        this.mDataManager = mActivity;
    }
}
