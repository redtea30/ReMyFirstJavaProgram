package servlet;

import dao.UserDao;

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
 * 25-10-2023  21:17
 * Describe：
 */

@WebServlet("/remove")
public class RemoveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");

        UserDao dao = new UserDao();
        try {
            Boolean deleteBoolean = dao.deleteUser(username);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        resp.sendRedirect("/all");
    }


}
