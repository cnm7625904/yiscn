package com.yiscn.projectmanage.presenter.main;

import android.app.Activity;

import com.yiscn.projectmanage.base.Rxpresenter;
import com.yiscn.projectmanage.base.contracts.SplashContract;
import com.yiscn.projectmanage.tool.RxTool;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

/**
 * Created by Administrator on 2018/4/3.
 */

public class SplashPresenter extends Rxpresenter<SplashContract.splashViewImpl> implements SplashContract.presenterImpl{
    private Activity mActivity;

    @Inject
    public SplashPresenter(Activity activity) {
        this.mActivity = activity;
    }
    private void startCountDown(){
        addSubscribe(Flowable.timer(2200, TimeUnit.MILLISECONDS)
                .compose(RxTool.<Long>rxSchedulerHelper())
                .subscribe(new Consumer<Long>() {
                    @Override

                    public void accept(Long aLong) throws Exception {
                        mView.jumpToNext();

                    }
                })
        );

    }

    @Override
    public void getData() {
        startCountDown();
    }
}
