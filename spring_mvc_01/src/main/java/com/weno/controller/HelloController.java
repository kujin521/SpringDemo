package com.weno.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class HelloController {
    //URI
    @RequestMapping("hello")
    public String hello(Model model){
        model.addAttribute("hello","世界");
        // 寻找web-inf目录下的jsp/hello.jsp文件
        return "hello";
    }
}
//接口式的写法:是一个传统式的写法，类implement一个接口，然后实现接口方法，在modle中填充元素，返回ModelAndView。
//public class HelloController implements org.springframework.web.servlet.mvc.Controller {
//    @Override
//    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
//
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("hello","世界");
//        // 寻找web-inf目录下的jsp/hello.jsp文件
//        mav.setViewName("hello");
//        return mav;
//    }
//}
