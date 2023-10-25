package server;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Package-name: PACKAGE_NAME
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 20/10/2023-10-2023 14-45
 * Describe：
 */

@WebServlet("/setSession")
public class SetSession extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        resp.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        resp.setContentType("text/html;Character=UTF-8");

        HttpSession session = req.getSession();
        session.setAttribute("key", "value");
        session.setAttribute("午饭", "食我大饼");
        Object name = req.getAttribute("username");
        Object pswd = req.getAttribute("password");
        session.setAttribute("name", name);
        session.setAttribute("pswd", pswd);

        req.getRequestDispatcher("/getSession").forward(req, resp);
    }


}
