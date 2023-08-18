package com.example.yin.config;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 它的作用是拦截请求并为响应设置CORS（跨来源资源共享）头，以允许跨域请求。
public class CorsInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
//        设置Access-Control-Allow-Origin字段为请求来源地址，即将允许的跨域请求的源进行动态配置。
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
//        设置Access-Control-Allow-Methods字段指定允许的请求方法，以便浏览器知道能够使用的HTTP方法。
        response.setHeader("Access-Control-Max-Age", "3600");
//        设置Access-Control-Max-Age字段用于定义预检请求（OPTIONS请求）的缓存时间，减少对服务器的频繁预检请求。
        response.setHeader("Access-Control-Allow-Headers", "x_requested_with,x-requested-with,Authorization,Content-Type,token");
//        设置Access-Control-Max-Age字段用于定义预检请求（OPTIONS请求）的缓存时间，减少对服务器的频繁预检请求。
        response.setHeader("Access-Control-Allow-Credentials", "true");
//        设置Access-Control-Allow-Credentials字段表明是否允许发送和接收包含凭据（如Cookie、Authorization头）的请求。
        return true;
    }
}
