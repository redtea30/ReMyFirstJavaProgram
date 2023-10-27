package servlet;

import util.Constant;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Package-name: servlet
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 24-10-2023  11:43
 * Describe：用于展示用户数量
 * 也可以用于展示用户列表
 * 拓展：删除当前登录用户
 * 做法：直接让对应用户的session过期
 */


@WebServlet("/online")
public class OnlineUserCountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();

        //  这里展示的是在线人数
        ConcurrentHashMap<String, HttpSession> map = (ConcurrentHashMap<String, HttpSession>) servletContext.getAttribute(Constant.ONLINE_USER);

        //表头
        StringBuffer html = new StringBuffer("<html><h1>Online User Count: " + map.size() + "</h1><br>");

        //创建html表输出
        Set<Map.Entry<String, HttpSession>> set = map.entrySet();
        for (Map.Entry<String, HttpSession> entry : set) {
            String key = entry.getKey();
            HttpSession session = entry.getValue();
            //  这里的值和在login里传给loginuserkey的一样
            String username = (String) session.getAttribute(Constant.LOGIN_USER_KEY);

            //  创建表格的内容
            html.append("<p>").append(username).append("</p>");
            html.append("<p>JSessionId:  ").append(session.getId()).append("</p>");
            html.append("<a href=\"#\"> 模拟下线").append(session.getId()).append("</a>");


        }
        //  表格尾部
        html.append("</html>");
        resp.getWriter().write(html.toString());

        //  这里展示的是用户名，前面doGet请求里塞进去的


    }


}
