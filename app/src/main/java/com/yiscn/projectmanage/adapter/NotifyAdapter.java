package com.yiscn.projectmanage.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yiscn.projectmanage.model.bean.NotifyBean;

import java.util.List;

/**
 * Created by Administrator on 2018/3/27.
 */

public class NotifyAdapter extends BaseQuickAdapter<NotifyBean,BaseViewHolder> {

    public NotifyAdapter(int layoutResId, @Nullable List<NotifyBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, NotifyBean item) {

    }
}
