package com.yiscn.projectmanage.tool;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by Administrator。 on 2018/1/22.
 */

public class ImageLoader {
    /**
     * 普通加载图片无任何修改
     * @param url
     * @param view
     */
    public static void loadImage(Context context,String url, ImageView view){
        Glide.with(context)
                .load(url)
                .thumbnail(0.1f)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(view);
    }
    public static void loadCircleImage(Context context,String url, ImageView view){
        RequestOptions requestOptions = RequestOptions.circleCropTransform();
        Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .into(view);
    }
}
