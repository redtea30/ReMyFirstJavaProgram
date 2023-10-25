package server;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * Package-name: PACKAGE_NAME
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 20/10/2023-10-2023 14-45
 * Describe：
 */


@WebServlet("/getSession")
public class GetSession extends HttpServlet {

    String username = "大王";
    String password = "nopswd";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        resp.setCharacterEncoding(StandardCharsets.UTF_8.toString());


        //获取Session对象
        HttpSession session = req.getSession();
        Object key = session.getAttribute("key");
        Object lunch = session.getAttribute("午饭");
        System.out.println(lunch);
        System.out.println(key);
        Object name = session.getAttribute("name");
        Object pswd = session.getAttribute("pswd");


        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        //验证
        if (!(username.equals(name) && password.equals(pswd))) {

            out.write("<!DOCTYPE html>");
            out.write("<html>");
            out.write("<head>");
            out.write("  <title>输入错误页面</title>");
            out.write("  <style>");
            out.write("    body {");
            out.write("      background: linear-gradient(to right, #f32170, #ff6b08, #cf23cf, #eedd44);");
            out.write("      color: white;");
            out.write("      font-family: 'Oriented Sans', sans-serif;");
            out.write("      margin: 0;");
            out.write("      height: 100vh;");
            out.write("    }");
            out.write("    h1 {");
            out.write("      text-align: center;");
            out.write("      font-size: 10rem;");
            out.write("      position: relative;");
            out.write("      top: 20vh;");
            out.write("      text-shadow: 0 0 50px rgba(0,0,0,0.5);");
            out.write("    }");
            out.write("  </style>");
            out.write("</head>");
            out.write("<body>");
            out.write("<h1>name = " + name + " password = " + pswd + " </h1>");
            out.write("  <h1>输入错误</h1>");
            out.write("</body>");
            out.write("</html>");
            out.close();
        } else {
            //输入正确
            out.write("<!DOCTYPE html>");
            out.write("<html>");
            out.write("<head>");
            out.write("  <title>登陆成功</title>");
            out.write("  <style>");
            out.write("    body {");
            out.write("      background: linear-gradient(to right, #f32170, #ff6b08, #cf23cf, #eedd44);");
            out.write("      color: white;");
            out.write("      font-family: 'Oriented Sans', sans-serif;");
            out.write("      margin: 0;");
            out.write("      height: 100vh;");
            out.write("    }");
            out.write("    h1 {");
            out.write("      text-align: center;");
            out.write("      font-size: 10rem;");
            out.write("      position: relative;");
            out.write("      top: 20vh;");
            out.write("      text-shadow: 0 0 50px rgba(0,0,0,0.5);");
            out.write("    }");
            out.write("  </style>");
            out.write("</head>");
            out.write("<body>");
            out.write("  <h1>登陆成功</h1>");
            out.write("</body>");
            out.write("</html>");
            out.close();
        }


        // 删除session的属性
        session.removeAttribute("key");
        session.removeAttribute("午饭");
        session.removeAttribute("pswd");
        session.removeAttribute("name");
        //  清除session对象
        session.invalidate();

    }
}
