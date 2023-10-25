package servlet;


import service.UserService;

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
 * 23-10-2023  03:28
 * Describe：
 */

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String nickname = req.getParameter("nickname");
        String email = req.getParameter("email");

        UserService userService = new UserService();
        boolean success = userService.register(username, password, nickname, email);

        if (success) {
            resp.getWriter().write("Registration successful! <a href='/login'>Login here</a>");
        } else {
            resp.getWriter().write("Registration failed! <a href='/register.html'>Try again</a>");
        }
    }
}

