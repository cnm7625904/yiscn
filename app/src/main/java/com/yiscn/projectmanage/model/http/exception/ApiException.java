package com.yiscn.projectmanage.model.http.exception;

/**
 * Created by Administrator on 2018/4/17.
 * 自定义异常
 */

public class ApiException extends Exception {
private int code;

    public ApiException(String message) {
        super(message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ApiException(String message, int code) {
        super(message);
        this.code = code;
    }
}
