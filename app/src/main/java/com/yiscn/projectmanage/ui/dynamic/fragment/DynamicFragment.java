package com.yiscn.projectmanage.ui.dynamic.fragment;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import com.yiscn.projectmanage.R;
import com.yiscn.projectmanage.base.BaseFragment;
import com.yiscn.projectmanage.base.contracts.DynamicFmContract;
import com.yiscn.projectmanage.presenter.DynamicFm.DynamicFmPresenter;

import butterknife.BindView;

/**
 * Created by Administrator on 2018/3/1.
 * 动态Fragment
 */

public class DynamicFragment extends BaseFragment<DynamicFmPresenter> implements DynamicFmContract.View {
    @BindView(R.id.tv_test1)
    TextView textView;
//    DynamicFmPresenter test_presenter;


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
        return R.layout.layout_test1;
    }

    @Override
    protected void initEventAndData() {
//        test_presenter=new DynamicFmPresenter();
//        test_presenter.attachView(this);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //第一步开始发送
//               test_presenter.getMsg();
            }
        });
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
}
