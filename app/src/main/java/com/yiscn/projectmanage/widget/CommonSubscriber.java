package com.yiscn.projectmanage.widget;

import android.text.TextUtils;
import android.util.Log;

import com.yiscn.projectmanage.base.BaseView;
import com.yiscn.projectmanage.model.http.exception.ApiException;

import io.reactivex.subscribers.ResourceSubscriber;
import retrofit2.HttpException;

/**
 * Created by Administrator on 2018/4/17.
 */

public abstract class CommonSubscriber<T> extends ResourceSubscriber<T> {
    private BaseView mView;
    private String mErrorMsg;
    private boolean isShowErrorState = true;

    protected CommonSubscriber(BaseView view){
        this.mView = view;
    }

    protected CommonSubscriber(BaseView view, String errorMsg){
        this.mView = view;
        this.mErrorMsg = errorMsg;
    }

    protected CommonSubscriber(BaseView view, boolean isShowErrorState){
        this.mView = view;
        this.isShowErrorState = isShowErrorState;
    }

    protected CommonSubscriber(BaseView view, String errorMsg, boolean isShowErrorState){
        this.mView = view;
        this.mErrorMsg = errorMsg;
        this.isShowErrorState = isShowErrorState;
    }

    @Override
    public void onComplete() {

    }

    @Override
    public void onError(Throwable e) {
        if (mView == null) {
            return;
        }
        if (mErrorMsg != null && !TextUtils.isEmpty(mErrorMsg)) {
            mView.showErrorMsg(mErrorMsg);
            Log.e("没网1",e.toString());
        } else if (e instanceof ApiException) {
            mView.showErrorMsg(e.toString());
            Log.e("没网2",e.toString());
        } else if (e instanceof HttpException) {
            mView.showErrorMsg("数据加载失败ヽ(≧Д≦)ノ");
            Log.e("没网3",e.toString());
        } else {
            mView.showErrorMsg("网络连接错误！");
//            mView.showErrorMsg("未知错误ヽ(≧Д≦)ノ");
            Log.e("没网4",e.toString());
        }
        if (isShowErrorState) {
//            mView.stateError();
        }
    }
}