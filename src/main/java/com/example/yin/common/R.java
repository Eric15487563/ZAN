package com.example.yin.common;

import lombok.Data;

@Data
public class R<T> {

    private int code;  //返回码

    private String message;  //返回消息

    private String type;  //返回类型

    private Boolean success;  //是否成功

    private Object data;  //返回内容

    //  成功  静态方法
    public static R success(String message) {
        R r = new R();
        r.setCode(200);
        r.setMessage(message);
        r.setSuccess(true);
        r.setType("success");
        r.setData(null);
        return r;
    }

    //  成功静态方法
    public static R success(String message, Object data) {
        R r = success(message);
        r.setData(data);
        return r;
    }

    //  警告  静态方法
    public static R warning(String message) {
        R r = error(message);
        r.setType("warning");
        return r;
    }

    //  失败  静态方法
    public static R error(String message) {
        R r = success(message);
        r.setSuccess(false);
        r.setType("error");
        return r;
    }

    //  致命错误  静态方法
    public static R fatal(String message) {
        R r = error(message);
        r.setCode(500);
        return r;
    }
}
