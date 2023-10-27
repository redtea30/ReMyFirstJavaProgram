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
        String nickname = req.getParameter("nickname");
        String password = req.getParameter("password");
        String repassword = req.getParameter("repassword");
        String phoneNumber = req.getParameter("nickname");
        String gender = req.getParameter("gender");
        String captcha = req.getParameter("captcha");
        String email = req.getParameter("email");

        // 这里使用是否为null进行判断
        String errorMessage = checker(username, password, repassword, email, captcha);

        // 不为null通过
        if (errorMessage != null) {
            resp.getWriter().write(errorMessage + " <a href='/register.html'>Try again</a>");
            return;
        }

        UserService userService = new UserService();
        boolean success = userService.register(username, password, nickname, email);

        // todo Dao没有完善
        if (success) {
            resp.getWriter().write("Registration successful! <a href='/login'>Login here</a>");
        } else {
            resp.getWriter().write("Registration failed due to a server error! <a href='/register.html'>Try again</a>");
        }
    }

    private String checker(String username, String password, String repassword, String email, String captcha) {
        if (username == null || username.trim().isEmpty()) {
            return "Username cannot be empty!";
        }

        if (password == null || password.trim().isEmpty()) {
            return "Password cannot be empty!";
        }

        if (!password.equals(repassword)) {
            return "Password and Confirm Password don't match!";
        }

        if (email == null || !email.matches("[^@]+@[^.]+\\..+")) {
            return "Invalid email format!";
        }

        // Simple captcha check. In real-world applications, you'd use a library to generate and verify captchas.
        if (captcha == null || !captcha.equals("1234")) {
            return "Invalid captcha!";
        }

        // TODO: Add more checks if necessary (e.g., username already exists, etc.)

        return null; // No errors found.
    }

    private void errorBack(String str, HttpServletResponse resp) throws IOException {
        resp.getWriter().write(str);

    }


}

