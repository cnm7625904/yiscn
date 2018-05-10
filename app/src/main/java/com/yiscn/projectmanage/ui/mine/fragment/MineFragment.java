package com.yiscn.projectmanage.ui.mine.fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.yiscn.projectmanage.R;
import com.yiscn.projectmanage.base.BaseFragment;
import com.yiscn.projectmanage.base.contracts.MineFgContract;
import com.yiscn.projectmanage.ui.login.LoginActivity;
import com.yiscn.projectmanage.presenter.MineFm.MineFmPresenter;
import com.yiscn.projectmanage.ui.mine.activity.EditPersonInfoActivity;
import com.yiscn.projectmanage.ui.mine.activity.MyDynamicActivity;
import com.yiscn.projectmanage.ui.mine.activity.SystemMsgActivity;
import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/3/1.
 * 我的Fragment
 */

public class MineFragment extends BaseFragment<MineFmPresenter> implements MineFgContract.View {
    @BindView(R.id.aboutmydynamic)
    RelativeLayout aboutmydynamic;//关于我的动态
    @BindView(R.id.btn_loginout)
    AppCompatButton btn_loginout;
    @BindView(R.id.rl_sysmsg)
    RelativeLayout rl_sysmsg;//系统消息
    @BindView(R.id.ll_minehead)
    LinearLayoutCompat ll_minehead;//头像
    //    @BindView(R.id.tv_test1)
//    TextView textView;
//    MineFmPresenter test_presenter;

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
        return R.layout.layout_minefragment;
    }

    @Override
    protected void initEventAndData() {

//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //第一步开始发送
//               test_presenter.getMsg();
//            }
//        });

    }
    @OnClick({R.id.ll_minehead,R.id.rl_sysmsg,R.id.btn_loginout,R.id.aboutmydynamic})
    public void Onclicks(View v){
        int viewId=v.getId();
        switch (viewId){
            //头像点击
            case R.id.ll_minehead:
                startActivity(new Intent(getActivity(), EditPersonInfoActivity.class));
                break;
            //系统消息
            case R.id.rl_sysmsg:
                startActivity(new Intent(getActivity(), SystemMsgActivity.class));
                break;
            //退出登录
            case R.id.btn_loginout:
                startActivity(new Intent(getActivity(), LoginActivity.class));
                getActivity().finish();
                getActivity().overridePendingTransition(R.anim.slide_bottom_in, R.anim.slide_bottom_out);
                break;
            //关于我的动态
            case R.id.aboutmydynamic:
                startActivity(new Intent(getActivity(), MyDynamicActivity.class));
                break;
            default:
                break;
        }



    }


    /**
     * 需要特殊处理的点击事件
     */
    @Override
    protected void clicks() {
//        //头像点击事件
//        ll_minehead.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        rl_sysmsg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(getActivity(), SystemMsgActivity.class));
//            }
//        });
//        btn_loginout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                App.getInstance().
//                startActivity(new Intent(getActivity(), LoginActivity.class));
//                getActivity().finish();
//                getActivity().overridePendingTransition(R.anim.slide_bottom_in, R.anim.slide_bottom_out);
//            }
//        });
//        aboutmydynamic.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        test_presenter=new MineFmPresenter();
//        test_presenter.attachView(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
//        test_presenter.detachView();
    }

    @Override
    protected void initInject() {
        getFragmentConponent().inject(this);
    }
}
