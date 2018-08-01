package com.training.maikun.product;

/**
 * @author:Nina
 * @version:
 * @Project: springbootdemo
 * @Package: com.training.maikun.product
 * @Description:
 * @Date date: 2018/8/1
 */
public class Msg {
    private Integer code;
    private String msg;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
