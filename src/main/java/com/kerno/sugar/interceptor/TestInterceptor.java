package com.kerno.sugar.interceptor;

import com.kerno.sugar.exception.ServiceException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sugar
 * 2019/10/30
 * 11:02
 * test拦截器
 */

public class TestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        打印token
        System.out.println(request.getSession().getAttribute("flea_token"));
        //抛出自定义异常
//        if (true) {
//            throw new ServiceException("no power", -1);
//        }
        return true;
    }
}
