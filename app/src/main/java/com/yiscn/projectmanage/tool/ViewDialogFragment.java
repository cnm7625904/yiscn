package com.yiscn.projectmanage.tool;

import android.app.Dialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.yiscn.projectmanage.R;

/**
 * Created by Administrator on 2018/4/3.
 */

public class ViewDialogFragment extends DialogFragment {
    private TextView tv_loading;//文字
    private AlertDialog.Builder builder;
    private View view;
    private LayoutInflater inflater;
    private String msg;

    @Override
    public void show(android.support.v4.app.FragmentManager manager, String tag) {
        this.msg=tag;
        super.show(manager, tag);

    }



    public interface Callback {
        void onClick(String userName, String password);
    }

    private Callback callback;



    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

//        FragmentManager fm = getActivity().getSupportFragmentManager();
//        setStyle(DialogFragment.STYLE_NORMAL,R.style.LoadDialog);

        builder  = new AlertDialog.Builder(getActivity());
        inflater= getActivity().getLayoutInflater();
         view = inflater.inflate(R.layout.dialog_signin, null);

        builder.setView(view);

        tv_loading=view.findViewById(R.id.tv_loading);
        tv_loading.setText(msg);
//                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        if (callback != null) {
//                            callback.onClick(et_userName.getText().toString(), et_password.getText().toString());
//                        }
//                    }
//                })
//        ;




        return builder.create();
    }
   public void setLoadingText(String string){
//        tv_loading.setText(string);

   }
   //回调
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof editCallback) {
//            callback = (editCallback) context;
//        } else {
//            throw new RuntimeException(context.toString() + " must implement editCallback");
//        }
//    }


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
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }




}
