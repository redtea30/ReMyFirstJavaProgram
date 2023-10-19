package modelTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Package-name: modelTest
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 19/10/2023-10-2023 09-19
 * Describe：
 */

//todo 数据库操作

@WebServlet("/uploadJDBC")
public class UploadJDBCServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
