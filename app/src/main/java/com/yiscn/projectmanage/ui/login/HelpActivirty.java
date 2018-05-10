package com.yiscn.projectmanage.ui.login;

import android.view.View;
import android.widget.ImageView;

import com.yiscn.projectmanage.R;
import com.yiscn.projectmanage.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by Administrator on 2018/4/3.
 * 登录帮助页面
 */

public class HelpActivirty extends BaseActivity{
    @BindView(R.id.iv_backtToLogin)
    ImageView iv_backtToLogin;

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
    public int layoutId() {
        return R.layout.layout_help;
    }

    @Override
    public void initEventAndData() {

    }

    @Override
    public void clicks() {
        iv_backtToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.slide_bottom_in, R.anim.slide_bottom_out);
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.slide_bottom_in, R.anim.slide_bottom_out);
        super.onBackPressed();
    }

    @Override
    protected void initInject() {

    }
}
