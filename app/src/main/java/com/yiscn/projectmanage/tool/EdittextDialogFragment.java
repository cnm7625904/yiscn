package com.yiscn.projectmanage.tool;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.yiscn.projectmanage.R;

/**
 * Created by Administrator on 2018/4/3.
 */

public class EdittextDialogFragment extends DialogFragment {
//    private TextView tv_loading;//文字
    private EditText dialog_edit;
    private AlertDialog.Builder builder;
    private View view;
    private LayoutInflater inflater;
    private String msg;

    @Override
    public void show(android.support.v4.app.FragmentManager manager, String tag) {
        this.msg=tag;
        super.show(manager, tag);

    }



    public interface editCallback {
        void onClick(String text);
    }

    private editCallback callback;



    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

//        FragmentManager fm = getActivity().getSupportFragmentManager();
//        setStyle(DialogFragment.STYLE_NORMAL,R.style.LoadDialog);

        builder  = new AlertDialog.Builder(getActivity());
        inflater= getActivity().getLayoutInflater();
         view = inflater.inflate(R.layout.dialog_edit, null);

//        builder.setView(view);
        dialog_edit=view.findViewById(R.id.dialog_edit);
//        tv_loading=view.findViewById(R.id.tv_loading);
//        tv_loading.setText(msg);

               builder .setTitle("请输入XX名字")
                       .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (callback != null) {
//                            callback.onClick(et_userName.getText().toString(), et_password.getText().toString());
                            callback.onClick(dialog_edit.getText().toString());
                        }
                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                   }
               })  .setView(view)

        ;



        return builder.create();
    }
   public void setLoadingText(String string){
//        tv_loading.setText(string);

   }
   //回调
//    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof editCallback) {
            callback = (editCallback) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement editCallback");
        }
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        callback = null;
    }

    @Override
    public void setCancelable(boolean cancelable) {
        super.setCancelable(cancelable);
    }

    @Override
    public void onStart() {
        super.onStart();
//        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }




}
