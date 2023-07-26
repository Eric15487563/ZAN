package com.example.yin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 这段代码是用于在Spring Boot项目中注册并添加CORS跨域请求拦截器的配置，可以解决跨域请求的问题，保障项目的安全性。

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public CorsInterceptor corsInterceptor() {
        return new CorsInterceptor();
    }

    // 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //创建InterceptorRegistration对象并将自定义拦截器传入;
        registry.addInterceptor(corsInterceptor())
                //addPathPatterns方法（指定拦截路径，往往使用 "/**"）
                .addPathPatterns("/**");
    }

}