package com.myServletTest;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GenericServletTest", value = "/genericServlet")
public class GenericServletTest extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        // 获取本次请求提交的方式
        String method = req.getMethod();
        if ("get".equalsIgnoreCase(method)) {
            doGet(req, resp);
        } else if ("post".equalsIgnoreCase(method)) {
            doPost(req, resp);
        }
    }


    //这里模拟了doPost和doGet请求
    //其实只是输出了哪种类型
    private void doPost(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("post 请求");
    }

    private void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("get请求");

    }


}
