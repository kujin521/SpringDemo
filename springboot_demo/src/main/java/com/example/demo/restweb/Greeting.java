package com.example.demo.restweb;

/**
 * 类：
 * 编写人：kujin
 * 创建时间：2020/7/4
 * 修改时间：2020/7/4
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
