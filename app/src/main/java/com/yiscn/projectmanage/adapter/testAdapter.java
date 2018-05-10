package com.yiscn.projectmanage.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yiscn.projectmanage.model.bean.modle;

import java.util.List;

/**
 * Created by Administrator on 2018/3/2.
 */

public class testAdapter extends BaseQuickAdapter<modle,BaseViewHolder>{
    public testAdapter(int layoutResId, @Nullable List<modle> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, modle item) {

    }


}
