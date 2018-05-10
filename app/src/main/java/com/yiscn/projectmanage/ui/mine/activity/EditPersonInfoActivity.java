package com.yiscn.projectmanage.ui.mine.activity;

import android.view.View;
import android.widget.ImageView;

import com.yiscn.projectmanage.R;
import com.yiscn.projectmanage.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by Administrator on 2018/4/4.
 * 修改个人信息页面
 */

public class EditPersonInfoActivity extends BaseActivity{
    @BindView(R.id.iv_backtToMine)
    ImageView iv_backtToMine;


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
        return R.layout.layout_editperson;
    }

    @Override
    public void initEventAndData() {

    }

    @Override
    public void clicks() {
        iv_backtToMine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void initInject() {

    }
}
