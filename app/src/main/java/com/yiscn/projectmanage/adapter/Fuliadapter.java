package com.yiscn.projectmanage.adapter;

import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yiscn.projectmanage.R;
import com.yiscn.projectmanage.model.bean.FuliBean;
import com.yiscn.projectmanage.tool.ImageLoader;

import java.util.List;

/**
 * Created by Administrator on 2018/3/16.
 */

public class Fuliadapter extends BaseQuickAdapter<FuliBean.ResultsBean,BaseViewHolder>{


    public Fuliadapter(int layoutResId, @Nullable List<FuliBean.ResultsBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, FuliBean.ResultsBean item) {
        ImageLoader.loadImage(mContext,item.getUrl(), (ImageView) helper.getView(R.id.fufli_img));
        Log.e("数组URL",item.getUrl()+"");
    }
}
