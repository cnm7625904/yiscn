package com.yiscn.projectmanage.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;


import com.yiscn.projectmanage.app.App;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2018/2/27.
 */

public abstract class SimpleActivity extends AppCompatActivity {
    private Activity activity;
    private Unbinder unbinder;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        unbinder= ButterKnife.bind(this);
        activity=this;
        onViewCreat();
        App.getInstance().addActivity(this);
        initEventAndData();//初始化
        clicks();//点击事件
    }
protected void onViewCreat(){

}
    protected void setToolBar(Toolbar toolbar, String title) {
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                onBackPressedSupport();
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        App.getInstance().removeActivity(this);
        unbinder.unbind();
    }

    public abstract  int layoutId();
    public abstract void initEventAndData();

    /**
     * 需要特殊处理的点击事件
     */
    public abstract void clicks();
}
