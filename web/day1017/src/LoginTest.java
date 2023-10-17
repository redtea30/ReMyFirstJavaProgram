import DaoModifyDB.JDBCtest1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/logintest")
public class LoginTest extends HttpServlet {
    /**
     * @param req  an {@link HttpServletRequest} object that contains the request the client has made of the servlet
     * @param resp an {@link HttpServletResponse} object that contains the response the servlet sends to the client
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/loginTest.html").forward(req, resp);
        //通过这个方法进行调用
        //浏览器直接进行搜索时发送请求就是通过get方法发送请求
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JDBCtest1 test = new JDBCtest1();//昨天写的登陆检测类
//直接读取信息
        String name = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("Password");
        if (name.isBlank()) {
            resp.sendRedirect(req.getContextPath() + "/registerTest");
        } else {
            if (test.loginTestName(name)) {
                if (test.EmailPassword(name, email, password)) {
                    System.out.println("登录成功");
                    return;
                }
            }
            System.out.println("登陆失败");
        }
    }
}
