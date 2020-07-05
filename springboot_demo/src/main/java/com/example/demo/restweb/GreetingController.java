package com.example.demo.restweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 类：资源控制器
 * 编写人：kujin
 * 创建时间：2020/7/4
 * 修改时间：2020/7/4
 */
@RestController
public class GreetingController {
    private static final String template="Hello %s!";
    private final AtomicLong counter=new AtomicLong();

    @GetMapping("/greeting")
    private Greeting greeting(@RequestParam(value = "name",defaultValue = "World")String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}
