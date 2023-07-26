package com.example.yin.config;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 它的作用是拦截请求并为响应设置CORS（跨来源资源共享）头，以允许跨域请求。
public class CorsInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x_requested_with,x-requested-with,Authorization,Content-Type,token");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        return true;
    }
}
