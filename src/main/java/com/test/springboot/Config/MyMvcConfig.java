package com.test.springboot.Config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
///**
// * @author
// */
//
//@Configuration
//public class MyMvcConfig extends WebMvcConfigurerAdapter {
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry){
//        registry.addViewController("/test").setViewName("success");
//    }
//
//
//    /**
//     * addPathPatterns 添加拦截规则
//     * excludePathPatterns 排除拦截规则
//     *
//     * @param registry
//     */
//    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
//
//        WebMvcConfigurerAdapter adapter =new WebMvcConfigurerAdapter(){
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
//                super.addViewControllers(registry);
//            }
//        };
//    }
//}
//

import com.test.springboot.Intercepter.LoginHandlerIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
//        配置拦截器，拦截全部，添加主页的例外以及登陆跳转请求。现在的拦截器不拦截js，css静态资源。
        registry.addInterceptor(new LoginHandlerIntercepter()).addPathPatterns("/**").
                excludePathPatterns("/","/login","/user/login","/hello","/success");

    }

}
