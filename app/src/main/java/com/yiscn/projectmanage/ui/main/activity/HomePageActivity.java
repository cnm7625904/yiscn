package com.yiscn.projectmanage.ui.main.activity;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;

import com.yiscn.projectmanage.R;
import com.yiscn.projectmanage.base.BaseActivity;
import com.yiscn.projectmanage.base.contracts.HomePageContract;
import com.yiscn.projectmanage.other.MyViewPagerAdapter;
import com.yiscn.projectmanage.presenter.main.HomePagePresenter;

import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;

/**
 * Created by Administrator on 2018/4/4.
 */

public class HomePageActivity extends BaseActivity<HomePagePresenter> implements HomePageContract.HomeViewImpl{

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
        return R.layout.activity_main;
    }

    @Override
    public void initEventAndData() {
        PageNavigationView tab = findViewById(R.id.xxx);
        NavigationController navigationController = tab.material()
                .addItem(android.R.drawable.ic_menu_camera, "首页")
                .addItem(android.R.drawable.ic_menu_compass, "任务")
                .addItem(android.R.drawable.ic_menu_search, "动态")
                .addItem(android.R.drawable.ic_menu_help, "我的")
                .build();

        ViewPager viewPager = (ViewPager) findViewById(R.id.no_ViewPager);
        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager(), navigationController.getItemCount()));
             viewPager.setOffscreenPageLimit(4);
        //自动适配ViewPager页面切换
        navigationController.setupWithViewPager(viewPager);
    }

    @Override
    public void clicks() {

    }

    @Override
    protected void initInject() {

    }


    /**
     * 监听Back键按下事件,方法2:
     * 注意:
     * 返回值表示:是否能完全处理该事件
     * 在此处返回false,所以会继续传播该事件.
     * 在具体项目中此处的返回值视情况而定.
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            System.out.println("按下了back键   onKeyDown()");
            /**
             * 返回HOME代码
             */
            Intent home=new Intent(Intent.ACTION_MAIN);
            home.addCategory(Intent.CATEGORY_HOME);
            startActivity(home);

            return false;
        }else {
            return super.onKeyDown(keyCode, event);
        }

    }



}
