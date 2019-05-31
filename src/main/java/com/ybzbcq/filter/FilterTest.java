package com.ybzbcq.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Administrator
 * @Description TODO
 * @since 2019-05-31 15:49
 */

public class FilterTest implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(" Filter Test ...... 您已经进入filter过滤器，您的请求正常，请继续遵守规则 ......");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}