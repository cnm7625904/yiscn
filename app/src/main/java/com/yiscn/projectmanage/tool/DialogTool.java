package com.yiscn.projectmanage.tool;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yiscn.projectmanage.R;


/**
 * Created by Administrator on 2018/3/1.
 */

public class DialogTool extends Dialog {
    public DialogTool(@NonNull Context context) {
        super(context);
    }
    public DialogTool(Context context, int theme) {
        super(context, theme);
    }
    public static class Builder{
        private View layout;
        private DialogTool dialogTool;
        private String message;
        public Builder(Context context){
            dialogTool = new DialogTool(context, R.style.Dialog);
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layout = inflater.inflate(R.layout.dialog_layout, null);
            dialogTool.addContentView(layout, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        }
        public Builder setMessage(String message) {
            this.message = message;
            return this;

        }
        /**
         * 创建单按钮对话框
         * @return
         */
        public DialogTool createSingleButtonDialog() {
            //如果传入的按钮文字为空，则使用默认的“返回”
            ((TextView) layout.findViewById(R.id.writemsg)).setText("返回");
            create();
            return dialogTool;
        }
        private void create() {
            if(message!=null){
                ((TextView)layout.findViewById(R.id.writemsg)).setText(message);
            }
            dialogTool.setContentView(layout);
            dialogTool.setCancelable(true);     //用户可以点击手机Back键取消对话框显示
            dialogTool.setCanceledOnTouchOutside(false);        //用户不能通过点击对话框之外的地方取消对话框显示
        }
    }
}
