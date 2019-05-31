package com.ybzbcq.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author Administrator
 * @Description Filter 过滤器 注解方式
 * @since 2019-05-31 14:38
 */

@WebFilter(urlPatterns="/*") // 过滤路径
public class Myfilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(" 您已经进入filter过滤器，您的请求正常，请继续遵守规则 ......");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}