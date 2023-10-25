package servlet;

import dao.KFM_userDao;
import entity.User;
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
 * 21-10-2023 14-44
 * Describe：
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //这里调用编码设置方法
        Encoding.encodingConvertor(req, resp);

        //  调用Dao的方法
        KFM_userDao kfmUserDao = new KFM_userDao();


        String username = req.getParameter("username");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String RePassword = req.getParameter("RePassword");
        String birth = req.getParameter("birth");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");

        //  密码验证
        if (pswdChecker(password, RePassword)) {
            flexBack(resp, "两次密码不一致");
            return;
        } else if (kfmUserDao.sameUsername(username)) {
            flexBack(resp, "用户名已存在");
            return;
        }

        //该方法创建user对象
        User user = addUser(username, name, password, birth, phone, email);

        //添加对象进入数据库
        int result = kfmUserDao.add(user);
        if (result > 0) {
            flexBack(resp, "注册成功");
        } else {
            flexBack(resp, "注册失败，请稍后再试");
        }
    }



    //  懒狗验证
    private User addUser(String username, String name, String password, String birth, String phone, String email) {
        if (phone.isBlank()) {
            // 我没有填写手机号
            return new User(username, name, password, birth, email);
        } else {
            //  我填了手机号
            return new User(username, name, password, birth, phone, email);
        }
    }

    //  两次密码一致性检测
    private boolean pswdChecker(String... str) {
        // 验证密码是否一样
        if (!str[0].equals(str[1])) return false;
        //  这个就密码一直了
        return true;
    }

    /**
     * 这个类有点不必要，前端一定判断过了
     *
     * @param str
     * @return
     */
    private Boolean verBlank(String... str) {
        for (String s : str) {
            if (s.isBlank()) return false;
        }
        return true;
    }

    private void flexBack(HttpServletResponse resp, String str) throws IOException {
        StringBuffer temp = new StringBuffer("");
        temp.append("<h1>");
        temp.append(str);
        temp.append("</h1><br><a href=\"index.html\"> 点击返回主页 </a>");
        PrintWriter writer = resp.getWriter();
        writer.write(String.valueOf(temp));
        writer.flush();
        writer.close();
    }
}
