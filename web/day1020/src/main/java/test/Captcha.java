package test;

import com.wf.captcha.GifCaptcha;
import com.wf.captcha.utils.CaptchaUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Package-name: test
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 20/10/2023-10-2023 17-30
 * Describe：
 */


@WebServlet("/captchatest")
public class Captcha extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        // 设置位数
        CaptchaUtil.out(1, req, resp);

        //GIF验证码
        GifCaptcha gifCaptcha = new GifCaptcha();



        if (!CaptchaUtil.ver("1", req)) {
            //  省略清楚验证码
            System.out.println("验证码不正确");
        }

    }
}
