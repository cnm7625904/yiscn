package com.yiscn.projectmanage.other;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.yiscn.projectmanage.ui.dynamic.fragment.DynamicFragment;
import com.yiscn.projectmanage.ui.event.fragment.EventFragment;
import com.yiscn.projectmanage.ui.homepage.fragment.HomePageFragment;
import com.yiscn.projectmanage.ui.mine.fragment.MineFragment;


public class MyViewPagerAdapter extends FragmentPagerAdapter {
    private HomePageFragment mTest;
    private EventFragment mTest2;
    private DynamicFragment mTest3;
    private MineFragment mTest4;
    private int size;

    public MyViewPagerAdapter(android.support.v4.app.FragmentManager fm, int size) {
        super(fm);
        this.size = size;
    }

    @Override
    public Fragment getItem(int position) {
//        return AFragment.newInstance(position + "");
        switch (position){
            case 0:
                if(mTest==null){
                    mTest=new HomePageFragment();
                }
                return mTest;
            case 1:
                if(mTest2 ==null){
                    mTest2 =new EventFragment();
                }
                return mTest2;
            case 2:
                if(mTest3 ==null){
                    mTest3 =new DynamicFragment();
                }
                return mTest3;
            case 3:
                if(mTest4 ==null){
                    mTest4 =new MineFragment();
                }
                return mTest4;
        }
        return null;
    }

    @Override
    public int getCount() {
        return size;
    }
}
