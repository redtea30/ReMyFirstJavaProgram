package com.myServletTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;


@WebServlet(urlPatterns = "/logintest")
public class LoginTest extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);


    }

    /**
     * 登录匹配
     *
     * @param req  an {@link HttpServletRequest} object that contains the request the client has made of the servlet
     * @param resp an {@link HttpServletResponse} object that contains the response the servlet sends to the client
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        JDBCtest test = new JDBCtest();

        Map<String, String[]> parameterMap = req.getParameterMap();
        for (String key : parameterMap.keySet()) {

            String[] mapKey = parameterMap.get(key);
            String name = mapKey[0];

            if (name != null && test.loginTestName(name)) {
                String[] passwords = parameterMap.get("password");
                String[] emails = parameterMap.get("email");
                String password = passwords[0];
                String email = emails[0];
                if (test.EmailPassword(name, email, password)) {
                    System.out.println("登录成功");
                }
            }
        }

        //map结果打印
        /*username==[user]
        password==[asdf]
        email==[12345@q.com]*/


    }

    public static void main(String[] args) {

    }
}
