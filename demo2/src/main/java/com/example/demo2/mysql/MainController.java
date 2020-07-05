package com.example.demo2.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // 这意味着这个类是一个控制器
@RequestMapping(path="/demo") // 这意味着URL以/demo开始(在应用程序路径之后)
public class MainController {
    @Autowired // 这意味着获得名为userRepository的bean
    // 哪个是Spring自动生成的，我们会用它来处理数据
    private UserRepository userRepository;

    @PostMapping(path="/add") // 仅映射POST请求
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody表示返回的字符串是响应，而不是视图名
        // @RequestParam表示它是来自GET或POST请求的一个参数

        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        // 这将返回带有用户的JSON或XML
        return userRepository.findAll();
    }
}
