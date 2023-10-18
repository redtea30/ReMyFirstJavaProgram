package modelTest;

import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Properties;

@WebServlet("/multipleDownload")
public class MultipleDownloadServlet extends HttpServlet {
    private Connection conn;
    private PreparedStatement prep;
    private ResultSet set;

    /**
     * 读取文件目录写个表格出去
     *
     * @param req  an {@link HttpServletRequest} object that contains the request the client has made of the servlet
     * @param resp an {@link HttpServletResponse} object that contains the response the servlet sends to the client
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        File[] files = readAllFiles();


        //先写个表头
        String html = """
                <html><body><table>
                <tr>
                <td>序列</td><td>文件名</td><td>日期</td><td>大小</td>
                </tr>
                """;
        //再写个表位
        String tail = """
                 </table></body></html>
                """;
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            String temp = "<tr><td>";
            //序列
            temp += (i + 1) + "</td><td>";
            //名字
            temp += file.getName() + "</td><td>";
            //日期 可以放在类里操作
            temp += new SimpleDateFormat("YYYY-MM-dd HH:MM:SS").format(new Date(file.lastModified())) + "</td><td>";
            //大小
            temp += file.length() / 1024 + "KB</td></tr>";
            html += temp;
        }

        html += tail;

        resp.getWriter().write(html);

    }

    /**
     * 工具类，获取对应文件路径下的数组
     *
     * @return
     */
    private File[] readAllFiles() {
        File file = new File(getProp("path"));
        return file.listFiles(f -> f.isFile());
    }


    /**
     * 工具类获取标签
     *
     * @return
     */
    public Connection getConn() {

        try {
            Class.forName(getProp("driver"));
            conn = DriverManager.getConnection(getProp("uel"), getProp("username"), getProp("password"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public ArrayList prepQueryAll() {
        ArrayList<User> list = new ArrayList();
        getConn();
        try {
            set = prep.executeQuery(getProp("selectAll"));
            while (set.next()) {
                User user = new User();
                user.setUsername(set.getString("username"));
                user.setPassword(set.getString("password"));
                user.setEmail(set.getString("email"));
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
        return list;
    }


    /**
     * 工具类，关闭作用
     */
    public void close() {
        if (conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (prep != null) {
            try {
                prep.close();
                prep = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (set != null) {
            try {
                set.close();
                set = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 工具方法，通过给定键拿到 Properties里的值
     * 测试Ok
     *
     * @param key
     * @return
     */
    public String getProp(String key) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(new File("C:\\Users\\jksps\\Documents\\ReMyFirstJavaProgram\\web\\day1018\\resources\\myMysqlPassword.properties")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop.getProperty(key);

    }

    public static void main(String[] args) {

        MultipleDownloadServlet md = new MultipleDownloadServlet();
        String username = md.getProp("username");
        System.out.println(username);
    }
}
