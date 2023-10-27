package servlet;

import util.Constant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Package-name: servlet
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 24-10-2023  10:45
 * Describe：模拟登录操作,向Session里增加该用户的用户名信息
 */


@WebServlet("/login")
public class SessionTestServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //这里拿到 Session进行增加操作
        req.getSession().setAttribute(Constant.LOGIN_USER_KEY, req.getParameter("username"));
        //  session可以存储对象

    }
}
