package com.yiscn.projectmanage.presenter.main;

import android.app.Activity;

import com.yiscn.projectmanage.base.Rxpresenter;
import com.yiscn.projectmanage.base.contracts.LoginContract;
import com.yiscn.projectmanage.model.DataManager;
import com.yiscn.projectmanage.tool.RxTool;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

/**
 * Created by Administrator on 2018/4/4.
 */

public class LoginPresenter extends Rxpresenter<LoginContract.loginViewImpl> implements LoginContract.PresenterImpl
{

    private DataManager mActivity;
    @Inject
    public LoginPresenter(DataManager mActivity) {
        this.mActivity = mActivity;
    }

    @Override
    public void Login() {
        mView.showPro();
        addSubscribe(Flowable.timer(5000, TimeUnit.MILLISECONDS)
                .compose(RxTool.<Long>rxSchedulerHelper())
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {

                        mView.hidePro();
                        mView.jumpToHomePage();
                    }
                })
        );




    }
}
