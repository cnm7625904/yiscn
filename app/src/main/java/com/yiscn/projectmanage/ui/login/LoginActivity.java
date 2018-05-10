package com.yiscn.projectmanage.ui.login;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.yiscn.projectmanage.R;
import com.yiscn.projectmanage.base.BaseActivity;
import com.yiscn.projectmanage.base.contracts.LoginContract;
import com.yiscn.projectmanage.presenter.main.LoginPresenter;
import com.yiscn.projectmanage.tool.EdittextDialogFragment;
import com.yiscn.projectmanage.tool.ViewDialogFragment;
import com.yiscn.projectmanage.ui.event.activity.MissionReport;
import com.yiscn.projectmanage.ui.main.activity.HomePageActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/4/3.
 * 登录页面
 */

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.loginViewImpl,EdittextDialogFragment.editCallback{
    @BindView(R.id.tv_test)
    TextView tv_test;//跳转试用页面
    @BindView(R.id.btn_login)
    Button btn_login;//登录按钮
    private FragmentManager fm;
    private ViewDialogFragment dialog;
    private EdittextDialogFragment dialogFragment;
    @BindView(R.id.iv_help)
    ImageView iv_help;//帮助按钮
    @Override
    public void showErrorMsg(String msg) {

    }
    @Override
    public void showPro() {
        dialog.show(fm, "正在登录...");
    }

    @Override
    public void hidePro() {
        dialog.dismiss();
    }

    @Override
    public int layoutId() {
        return R.layout.layout_login;
    }

    @Override
    public void initEventAndData() {
        fm= LoginActivity.this.getSupportFragmentManager();
        dialog = new ViewDialogFragment();
        dialogFragment=new EdittextDialogFragment();
        dialogFragment.setCancelable(false);
        dialog.setCancelable(false);

    }

    @Override
    public void clicks() {
//        iv_help.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(LoginActivity.this,HelpActivirty.class));
//                overridePendingTransition(R.anim.slide_bottom_in, R.anim.slide_bottom_out);
//            }
//        });
//        btn_login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                lp.Login();
//            }
//        });
    }
    @OnClick({R.id.iv_help,R.id.btn_login,R.id.tv_test})
    protected void onClicks(View view){
        int viewIds=view.getId();
        switch (viewIds){
            case R.id.iv_help:
                startActivity(new Intent(LoginActivity.this,MissionReport.class));
                overridePendingTransition(R.anim.slide_bottom_in, R.anim.slide_bottom_out);
                break;
            case R.id.btn_login:
                mPresenter.Login();
//                dialogFragment.show(fm,"");
                break;
            case R.id.tv_test:
                startActivity(new Intent(LoginActivity.this,TestActivity.class));
                break;
            default:
                break;
        }
    }

    @Override
    public void jumpToHomePage() {
        startActivity(new Intent(LoginActivity.this,HomePageActivity.class));
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    @Override
    protected void initInject() {
        getActivityConponent().inject(this);
    }

    @Override
    protected void onViewCreat() {
        super.onViewCreat();

    }
  //edittext回调
    @Override
    public void onClick(String text) {
        Toast.makeText(LoginActivity.this,text,Toast.LENGTH_SHORT).show();
    }
}
