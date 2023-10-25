package utils;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Package-name: utils
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 21/10/2023-10-2023 13-34
 * Describe：
 */

public class Encoding {
    public static void encodingConvertor(HttpServletRequest req, HttpServletResponse resp) {
        try {
            req.setCharacterEncoding("UTF-8");
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html;charset=UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }
}
