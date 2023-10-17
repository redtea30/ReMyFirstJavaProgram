package servlet;

import DaoModifyDB.JDBCtest1;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;


@WebServlet("/showAll")
public class PrintAllServlet extends HttpServlet {

    /**
     * 需要使用重定向
     *
     * @param req  an {@link HttpServletRequest} object that contains the request the client has made of the servlet
     * @param resp an {@link HttpServletResponse} object that contains the response the servlet sends to the client
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JDBCtest1 db = new JDBCtest1();
        ArrayList<User> uList = db.showAllInList();
        String str = "<table><tr><td>username</td><td>password</td><td>email</td></tr>";
        for (User user : uList) {
            str += "<tr><td>" + user.getUsername()
                    + "</td><td>" + user.getPassword()
                    + "</td></td>" + user.getEmail()
                    + "</tr>";
        }
        str += "</table>";
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("Content-Type", "text/html");
        PrintWriter writer = resp.getWriter();
        writer.write(str);
        writer.flush();
        writer.close();
    }

    public void showAll() {
        JDBCtest1 test = new JDBCtest1();

        ArrayList<User> users = test.showAllInList();
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            System.out.println(next.toString());
        }
    }
}