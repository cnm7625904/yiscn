package com.yiscn.projectmanage.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by Administrator on 2018/2/28.
 * rx生命周期的统一控制
 */

public class Rxpresenter<T extends BaseView> implements BasePresenter<T>{
    protected T mView;
    protected CompositeDisposable compositeDisposable;//统一管理
    protected void unSubscribe(){
        if(compositeDisposable!=null){
            compositeDisposable.clear();
        }
    }
    protected void addSubscribe(Disposable subsciption){
        if(compositeDisposable==null){
            compositeDisposable=new CompositeDisposable();
        }
        compositeDisposable.add(subsciption);
    }
    @Override
    public void attachView(T view) {
        this.mView=view;
    }

    @Override
    public void detachView() {
        this.mView=null;
        unSubscribe();

    }
}
