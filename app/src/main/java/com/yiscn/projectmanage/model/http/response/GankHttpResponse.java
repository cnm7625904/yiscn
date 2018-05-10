package com.yiscn.projectmanage.model.http.response;

/**
 * Created by Administrator on 2018/4/17.
 * Gank返回泛型
 */

public class GankHttpResponse<T> {
    private boolean error;
    private T results;

    public boolean getError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }
}
