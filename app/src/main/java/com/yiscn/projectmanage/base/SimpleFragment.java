package com.yiscn.projectmanage.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by wxq on 2018/3/1.
 */

public abstract class SimpleFragment extends Fragment {
    protected View mView;
    protected Activity mActivity;
    protected Context mContext;
    private Unbinder unbinder;
    protected boolean isInited=false;

    @Override
    public void onAttach(Context context) {
        mActivity= (Activity) context;
        mContext=context;
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView=inflater.inflate(layoutId(),null);
        return mView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        unbinder= ButterKnife.bind(this,view);
        isInited = true;
        initEventAndData();
        clicks();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    protected abstract int layoutId();
    protected abstract void initEventAndData();
    protected abstract void clicks();
}
