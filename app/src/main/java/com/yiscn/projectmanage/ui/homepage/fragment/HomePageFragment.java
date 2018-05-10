package com.yiscn.projectmanage.ui.homepage.fragment;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.yiscn.projectmanage.R;
import com.yiscn.projectmanage.base.BaseFragment;
import com.yiscn.projectmanage.base.contracts.HomeFmContract;
import com.yiscn.projectmanage.model.bean.FuliBean;
import com.yiscn.projectmanage.model.bean.modle;
import com.yiscn.projectmanage.presenter.HomeFm.HomeFmPresenter;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


/**
 * Created by Administrator on 2018/3/1.
 * 首页Fragment
 */

public class HomePageFragment extends BaseFragment<HomeFmPresenter> implements HomeFmContract.View {
    private   List<FuliBean.ResultsBean> resultsBeans=new ArrayList<>();
    @BindView(R.id.rv_test)
    RecyclerView recyclerView;
    //    private testAdapter madapter;
//    private Fuliadapter fuliadapter;
//    private RecyclerView.LayoutManager manager;
////    HomeFmPresenter test_presenter;


    @Override
    public void showErrorMsg(String msg) {
        Log.e("错误信息",msg);
        Toast.makeText(getActivity(),msg,Toast.LENGTH_LONG).show();
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
        Log.e("接收到的消息",msg+"====");
        Toast.makeText(getActivity(),msg,Toast.LENGTH_LONG).show();
    }

//    @Override
//    public void showFuli(FuliBean fuliBean) {
//
//        resultsBeans=fuliBean.getResults();
//        if(resultsBeans!=null){
//            fuliadapter=new Fuliadapter(R.layout.item_fuli,resultsBeans);
//            recyclerView.setAdapter(fuliadapter);
//
//            if(fuliadapter!=null){
//                fuliadapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
////                 Toast.makeText(getActivity(),resultsBeans.get(position).getUrl()+"",Toast.LENGTH_SHORT).show();
//                        ToastTool.showToast(getActivity(),resultsBeans.get(position).getUrl()+"?");
//
//                    }
//                });
//            }
//
//
//        }
//
//
//    }



    @Override
    protected int layoutId() {
        return R.layout.layout_test;
    }

    @Override
    public void onResume() {
        super.onResume();
//        Log.e(TAG,"这是fragment");
    }

    @Override
    protected void initEventAndData() {
//        test_presenter=new HomeFmPresenter();
//        test_presenter.attachView(this);
//        test_presenter.getFuli();
//        manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
//        madapter = new testAdapter(R.layout.item_test,getData());
//        recyclerView.setLayoutManager(manager);
//        recyclerView.setAdapter(madapter);
//        WaterMarkUtils.addWaterMark();
//        Log.e(TAG,"这是fragment");
//        mPresenter.getMsg();


//        if(SystemUtil.isWifiConnected()){
//            Log.e(TAG,"连接了wifi");
//            Toast.makeText(getActivity(),"连接了wifi",Toast.LENGTH_SHORT).show();
//        }
//        else if(!SystemUtil.isWifiConnected()){
//            Log.e(TAG,"没有连接了wifi");
//            Toast.makeText(getActivity(),"没有连接了wifi",Toast.LENGTH_SHORT).show();
//        }
//
//
//       if(SystemUtil.isNetworkConnected()){
//           Log.e(TAG,"有网");
//       }
//       else if(!SystemUtil.isNetworkConnected()){
//           Log.e(TAG,"没网");
//       }

    }

    @Override
    protected void clicks() {

    }

    private ArrayList<modle> getData() {
        modle mModle=new modle();
        mModle.setAge(5);
        mModle.setName("王二小");
        ArrayList<modle> data = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            data.add(mModle);
        }

        return data;
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
