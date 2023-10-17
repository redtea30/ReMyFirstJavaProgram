package com.myServletTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/register")
public class RegisterTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        JDBCtest test = new JDBCtest();

        //直接使用getParameter()
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        if (test.insertUser(name, email, password)) {
            System.out.println("注册成功");
        } else {
            System.out.println("注册失败");
        }

    }


}
