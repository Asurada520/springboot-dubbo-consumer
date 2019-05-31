package com.ybzbcq.config;

import com.ybzbcq.filter.FilterTest;
import com.ybzbcq.servlet.ServletTest;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @Description springboot config class
 * @since 2019-05-31 13:44
 */
@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new ServletTest(), "/servlet/test");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new FilterTest());
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
}