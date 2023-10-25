package server;

import com.wf.captcha.SpecCaptcha;
import com.wf.captcha.utils.CaptchaUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Package-name: server
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 20/10/2023-10-2023 19-07
 * Describe：
 */

@WebServlet("/captcha")
public class CaptchaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // png类型
//        SpecCaptcha captcha = new SpecCaptcha(130, 48);
//        captcha.text();  // 获取验证码的字符
//        captcha.textChar();  // 获取验证码的字符数组

        /*// gif类型
        GifCaptcha captcha1 = new GifCaptcha(130, 48);

        // 中文类型
        ChineseCaptcha captcha2 = new ChineseCaptcha(130, 48);

        // 中文gif类型
        ChineseGifCaptcha captcha3 = new ChineseGifCaptcha(130, 48);

        // 算术类型
        ArithmeticCaptcha captcha4 = new ArithmeticCaptcha(130, 48);
        captcha4.setLen(3);  // 几位数运算，默认是两位
        captcha4.getArithmeticString();  // 获取运算的公式：3+2=?
        captcha4.text();  // 获取运算的结果：5*/


        SpecCaptcha captcha = new SpecCaptcha(130, 48);
        captcha.text();  // 获取验证码的字符
        captcha.textChar();  // 获取验证码的字符数组

        //CaptchaUtil.out(1, req, resp);//  验证码不生效
        CaptchaUtil.out(captcha, req, resp);

    }
}

