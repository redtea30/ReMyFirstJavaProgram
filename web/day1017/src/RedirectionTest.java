import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/respond1")
public class RedirectionTest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        //设置两次字符编码就乱码了？
        resp.setHeader("Content-Type", "text/html");
        PrintWriter writer = resp.getWriter();
        writer.write("<h1>重定向成功</h1>");
        writer.flush();
        writer.close();


    }
}
