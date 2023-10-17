import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/request1")
public class RequestTest1 extends HttpServlet {

    /**
     * 调用父类的Super（req,resp）会导致响应码500
     * 响应必须要在处理之前进行，所以需要自己写方法了
     *
     * @param req  the {@link HttpServletRequest} object that contains the request the client made of the servlet
     * @param resp the {@link HttpServletResponse} object that contains the response the servlet returns to the client
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决下乱码问题
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        req.setAttribute("msg", "来自request1的请求");//发送消息
        System.out.println(req.getAttribute("msg"));//接收自己的消息

        // 在响应提交之前先转发请求
        req.getRequestDispatcher("/request2").forward(req, resp);

        System.out.println(req.getAttribute("msg"));//检测自己的消息还在不在

    }

}