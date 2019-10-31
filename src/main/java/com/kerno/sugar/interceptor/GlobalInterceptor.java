package com.kerno.sugar.interceptor;

import com.kerno.sugar.exception.ServiceException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sugar
 * 2019/10/30
 * 10:16
 * 全局的拦截器
 */

public class GlobalInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //请求路径
        System.out.println(request.getMethod()+" --- "+request.getRequestURI());
        return true;
    }
}
