package com.yiscn.projectmanage.ui.event.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import com.yiscn.projectmanage.R;
import com.yiscn.projectmanage.base.BaseFragment;
import com.yiscn.projectmanage.base.contracts.EventFmContract;
import com.yiscn.projectmanage.presenter.EventFm.EventFmPresenter;
import com.yiscn.projectmanage.tool.OnTabSelectListener;
import com.yiscn.projectmanage.widget.SegmentTabLayout;
import com.yiscn.projectmanage.widget.SimpleCardFragment;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by Administrator on 2018/3/1.
 * 事件Fragment
 */

public class EventFragment extends BaseFragment<EventFmPresenter> implements EventFmContract.View {
//    @BindView(R.id.tv_test1)
//    TextView textView;
    @BindView(R.id.tl_3)
    SegmentTabLayout mTabLayout_3;
    @BindView(R.id.vp_2)
    ViewPager vp;//滑动
    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private String[] mTitles = {"待办任务", "已办任务"};
//    EventFmPresenter test_presenter;


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
    public void showMsg(String msg) {
    //第二步接收消息
        Toast.makeText(getActivity(),msg,Toast.LENGTH_LONG).show();
    }

    @Override
    protected int layoutId() {
        return R.layout.layout_event;
    }

    @Override
    protected void initEventAndData() {
//        test_presenter=new EventFmPresenter();
//        test_presenter.attachView(this);
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //第一步开始发送
////               test_presenter.getMsg();
//            }
//        });

        for (String title : mTitles) {
            mFragments.add(SimpleCardFragment.getInstance("Switch ViewPager " + title));
        }
//        mTabLayout_3.setTabData(mTitles);
//        mTabLayout_3.setOnTabSelectListener(new OnTabSelectListener() {
//            @Override
//            public void onTabSelect(int position) {
//                vp.setCurrentItem(position);
//            }
//
//            @Override
//            public void onTabReselect(int position) {
//            }
//        });
//
//        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//                mTabLayout_3.setCurrentTab(position);
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
//        vp.setCurrentItem(1);
        tl_3();
    }

    @Override
    protected void clicks() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    protected void initInject() {
        getFragmentConponent().inject(this);
    }
    private class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles[position];
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }
    }

    private void tl_3() {
//        final ViewPager vp_3 =findViewById(R.id.vp_2);
        vp.setAdapter(new MyPagerAdapter(getActivity().getSupportFragmentManager()));

        mTabLayout_3.setTabData(mTitles);
        mTabLayout_3.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                vp.setCurrentItem(position);
            }

            @Override
            public void onTabReselect(int position) {
            }
        });

        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mTabLayout_3.setCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        vp.setCurrentItem(1);
    }

}
