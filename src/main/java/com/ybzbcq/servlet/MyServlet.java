package com.ybzbcq.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 注解方式 servlet
 */
@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

    private static final long serialVersionUID = 8305892836809580944L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("content-type","text/html;charset=uft-8");
        response.setContentType("text/html;charset=uft-8");
        response.getWriter().print("hello world ... servlet ,nice to meet you !天道");
        response.getWriter().flush();
        response.getWriter().close();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
    }
}
