package com.yiscn.projectmanage;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.yiscn.projectmanage.tool.ViewDialogFragment;

public class MainActivity extends AppCompatActivity implements ViewDialogFragment.Callback{
private TextView tv;
private   FragmentManager fm;
private ViewDialogFragment dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
              fm= MainActivity.this.getSupportFragmentManager();
         dialog = new ViewDialogFragment();
        dialog.setCancelable(false);
        dialog.show(fm, "test");

//        tv=findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
//        OkGo.<String>get("http://gank.io/api/data/Android/30/1")
//                .execute(new StringCallback() {
//                    @Override
//                    public void onSuccess(Response<String> response) {
////                        dialog.getDialog().setTitle("??????????");
////                        dialog.dismiss();
//                        Toast.makeText(MainActivity.this,response.body().toString()+"",Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onError(Response<String> response) {
//                        super.onError(response);
//                    }
//
//                    @Override
//                    public void onFinish() {
//                        super.onFinish();
//
//                    }
//                });

    }
    @Override
    public void onClick(String userName, String password) {
        Toast.makeText(MainActivity.this, "用户名: " + userName + " 密码: " + password, Toast.LENGTH_SHORT).show();
    }

//    public void showViewDialogFragment(View view) {
//        /**
//         * 继承dialogFragment必须这样给写
//         */
////        FragmentManager fm = MainActivity.this.getSupportFragmentManager();
////        final ViewDialogFragment dialog = new ViewDialogFragment();
////        dialog.setCancelable(false);
////        dialog.show(fm, "");
//
//
////        ViewDialogFragment viewDialogFragment = new ViewDialogFragment();
////        viewDialogFragment.show(getSupportFragmentManager(),"t");
//    }


}
