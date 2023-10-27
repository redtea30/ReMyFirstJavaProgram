package servlet;

import entity.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Package-name: servlet
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 25-10-2023  19:52
 * Describe：
 */


@WebServlet("/all")
public class ListServlet extends HttpServlet {
    private UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> all = service.findAll();
        //存储内容
        req.setAttribute("all", all);
        req.getRequestDispatcher("/all.jsp").forward(req, resp);


        System.out.println("测试是否执行这里");
        System.out.println(all.toString());
    }
}
