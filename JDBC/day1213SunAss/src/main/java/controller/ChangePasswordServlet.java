package controller;

import service.UserService;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Package-name: controller
 * Project-name: ReMyFirstJavaProgram
 * Author: Neko
 * 15-12-2023  18:25
 * Describe：
 */

@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取参数、处理请求、返回结果...
        if (request.getParameter("username") != null && request.getParameter("password") != null) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String newPassword = request.getParameter("newPassword");
            // 调用业务逻辑层
            UserService service = new UserServiceImpl();
            service.changePassword(username, newPassword);
            // 跳转页面
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
    }
}
