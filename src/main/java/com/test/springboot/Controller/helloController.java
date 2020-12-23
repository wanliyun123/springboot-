package com.test.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class helloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return "hello,world!";
    }

//    @ResponseBody该注解的作用是返回值本身而非success请求，当需要返回请求打开success.html页面的时候，
//    应该去掉这个注解；也就是说不能使用@RestController这个注解，应该该注解会将该类下的所有方法返回值添
//    加上controller和response注解。
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好，thymeleaf</h1>");
        map.put("users", Arrays.asList("张三","李四","王五"));
        //classpath:/templates/.html
        return "success";
    }
    @RequestMapping({"/","/login","login.html"})
    public String login(){
        return "login";
    }
    @RequestMapping("/main.html")
    public String Main(){
        return "dashboard";
    }
}
