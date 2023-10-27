package backResult;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Package-name: backResult
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 26-10-2023  10:48
 * Describe：
 */


@WebServlet("/back")
public class test extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


       // req.getRequestDispatcher()
    }
}
