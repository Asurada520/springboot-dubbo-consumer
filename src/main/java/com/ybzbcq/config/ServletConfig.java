package com.ybzbcq.config;

import com.ybzbcq.filter.FilterTest;
import com.ybzbcq.servlet.ServletTest;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

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
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new FilterTest());
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

//    @Bean
//    public FilterRegistrationBean filterregistrationBean(){
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//
//        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//        characterEncodingFilter.setForceEncoding(true);
//        characterEncodingFilter.setEncoding("UTF-8");
//        filterRegistrationBean.setFilter(characterEncodingFilter);
//        filterRegistrationBean.addUrlPatterns("/*");
//
//        return filterRegistrationBean;
//    }
}