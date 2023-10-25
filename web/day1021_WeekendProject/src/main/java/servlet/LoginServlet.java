package servlet;

import com.wf.captcha.utils.CaptchaUtil;
import dao.KFM_userDao;
import utils.Encoding;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Package-name: servlet
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 21-10-2023 11:14
 * Describe：
 */

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String captcha = req.getParameter("captchaCode");

        //这里调用编码设置方法
        Encoding.encodingConvertor(req, resp);

        //  不会还有人不输密码吧
        if (username != null && password != null && captcha != null && !username.isEmpty() && !password.isEmpty() && !captcha.isEmpty()) {
            //  自建密码验证方式 很蠢
            KFM_userDao dao = new KFM_userDao();

            //  验证用户的账户和密码
            if (dao.loginCheck(username, password)) {
                //  验证码验证
                if (CaptchaUtil.ver(captcha, req)) {
                    resp.sendRedirect("/welcome.html");

                } else {
                    printVerFail(resp);
                }
                resp.sendRedirect("/welcome.html");
                // todo 可以试下使用session进行用户验证
            } else {
                printNamePswdFail(resp);
            }


        } else {
            printBlankContent(resp);
        }
    }


    private void printVerFail(HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();
        String message = """
                <h1>验证码输入错误</h1>
                <br>
                <a href="index.html"> 点击返回主页 </a>  
                                       
                """;
        writer.write(message);
        writer.flush();
        writer.close();
    }

    private void printBlankContent(HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();
        String message = """
                <h1>没有输入内容</h1>
                <br>
                <a href="index.html"> 点击返回主页 </a>  
                                      
                """;
        writer.write(message);
        writer.flush();
        writer.close();
    }

    private void printNamePswdFail(HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();
        String message = """
                <h1>用户名或者密码输入错误</h1>
                <br>
                <a href="index.html"> 点击返回主页 </a>  
                                       
                """;
        writer.write(message);
        writer.flush();
        writer.close();
    }
}



