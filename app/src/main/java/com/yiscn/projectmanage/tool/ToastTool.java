package com.yiscn.projectmanage.tool;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/3/1.
 * 最好的吐司写法
 */

public class ToastTool {
    protected static Toast toast;
    public static void showToast(Context context,String msg){
        if(toast!=null){
            toast.cancel();
            toast=null;
        }
        toast=Toast.makeText(context,msg,Toast.LENGTH_LONG);
        toast.show();
    }
}
