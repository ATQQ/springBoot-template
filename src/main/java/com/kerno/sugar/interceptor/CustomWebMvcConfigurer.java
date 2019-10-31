package com.kerno.sugar.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author sugar
 * 2019/10/30
 * 10:18
 * 拦截器管理
 */

@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
            //注册拦截器
            registry.addInterceptor(new GlobalInterceptor()).addPathPatterns("/*/api/**");
            registry.addInterceptor(new TestInterceptor()).addPathPatterns("/*/api/test/**");
            WebMvcConfigurer.super.addInterceptors(registry);
    }
}
