package com.yiscn.projectmanage.ui.login;

import android.content.Intent;

import com.yiscn.projectmanage.R;
import com.yiscn.projectmanage.base.BaseActivity;
import com.yiscn.projectmanage.base.contracts.SplashContract;
import com.yiscn.projectmanage.presenter.main.SplashPresenter;

/**
 * Created by Administrator on 2018/4/3.
 * 闪屏页
 */

public class SplashActivity extends BaseActivity<SplashPresenter> implements SplashContract.splashViewImpl{
    @Override
    public void showErrorMsg(String msg) {

    }

    @Override
    public void showPro() {

    }

    @Override
    public void hidePro() {

    }

    @Override
    public void jumpToNext() {
        startActivity(new Intent(SplashActivity.this,LoginActivity.class));
        overridePendingTransition(R.anim.slide_bottom_in, R.anim.slide_bottom_out);
        finish();
    }

    @Override
    public int layoutId() {
        return R.layout.layout_splash;
    }

    @Override
    public void initEventAndData() {

        mPresenter.getData();
    }

    @Override
    public void clicks() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        if(sp!=null){
//        sp.detachView();
//    }
    }

    @Override
    protected void initInject() {
        getActivityConponent().inject(this);
    }

    @Override
    protected void onViewCreat() {
        super.onViewCreat();
//        sp=new SplashPresenter();
//        sp.attachView(SplashActivity.this);
    }
}
