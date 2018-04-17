package com.dongbin.common.except;

/**
 * Created by dongbin on 2018/4/17.
 */
public class Result<T> {
    //状态 0 成功 其他为失败
    private int status;
    //消息
    private String msg;
    //返回结果集
    private T data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
