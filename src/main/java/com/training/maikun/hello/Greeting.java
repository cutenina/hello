package com.training.maikun.hello;

/**
 * @author:Nina
 * @version:
 * @Project: springbootdemo
 * @Package: com.training.maikun.hello
 * @Description:
 * @Date date: 2018/8/1
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
