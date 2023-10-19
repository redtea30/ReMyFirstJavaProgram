package com.cookie;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * Package-name: com.cookie
 * Project-name:Default (Template) Project
 * Author: Neko
 * 19/10/2023-10-2023 16-31
 * Describe：
 */


@WebServlet("/setCookie")
public class SetCookie extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        Cookie cookie1 = new Cookie("cookie1", URLEncoder.encode("食大饼", StandardCharsets.UTF_8));
        resp.addCookie(cookie1);
        Cookie cookie2 = new Cookie("cookie2", URLEncoder.encode("食我大饼", StandardCharsets.UTF_8));
        resp.addCookie(cookie2);

    }
}