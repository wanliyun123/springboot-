package com.test.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {


//    @GetMapping这些注解都是对post请求的快速处理
//    @DeleteMapping
//    @PutMapping
//    @PostMapping(value = "/login")
//    老式的处理login请求并发送得dashboard页面
//    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username) && "123".equals(password)){
//            登陆成功
//            采用重定向功能的时候需要配置拦截器，不然可以绕过登陆界面直接访问main页面
//            对于已经登陆的用户，将用户名存入session中，方法为setAttribute("session池的名字"，值（也就是用户名）)
            session.setAttribute("loginedUser",username);
            return "redirect:/main.html";
//            return "dashboard";
        }else{
            map.put("msg","登陆失败，请重新登录");
            return "login";
        }

    }
}
