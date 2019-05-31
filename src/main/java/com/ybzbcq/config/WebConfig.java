package com.ybzbcq.config;

import com.ybzbcq.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器注册 注入到spring容器
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 拦截
        String[] addPathPatterns={"/**"};

        // 不拦
        String[] excludePathPatterns ={"/user/hi"};

        // 注册 登录拦截器
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
        // 可以注册多个 拦截器 ...
    }
}
