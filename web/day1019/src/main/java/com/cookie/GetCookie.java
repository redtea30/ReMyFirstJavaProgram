package com.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/**
 * Package-name: com.cookie
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 19/10/2023-10-2023 16-45
 * Describe：
 */
@WebServlet("/getCookie")
public class GetCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            String value = cookie.getValue();
            String decode = URLDecoder.decode(value, StandardCharsets.UTF_8);
            System.out.println(name + " = " + decode);
            System.out.println("你好");
        }

    }
}
