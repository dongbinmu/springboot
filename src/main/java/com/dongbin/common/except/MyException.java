package com.dongbin.common.except;

/**
 * Created by dongbin on 2018/4/17.
 */
public class MyException extends RuntimeException {

    private int code;


    public MyException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.code = exceptionEnum.getCode();
    }

    public MyException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
