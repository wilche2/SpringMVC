package com.kuang;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author caoweiquan
 * @date 2021/3/6
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 取得参数
        String method = req.getParameter("method");
        if ("add".equals(method)){
            req.getSession().setAttribute("msg","执行了add方法");
        }
        if ("delete".equals(method)){
            req.getSession().setAttribute("msg","执行了delete方法");
        }

        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
