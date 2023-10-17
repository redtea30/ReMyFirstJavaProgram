import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbutilsTest {
    public static void main(String[] args) {

    }

    public void dbutilsTest() {
        Connection conn = getConn();
        BeanListHandler beanListHandler = new BeanListHandler(Student.class);


    }


    public Connection getConn() {
        Connection conn;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql = "jdbc:mysql://localhost:3306/test1016";
            String name = "root";
            String password = "qwertyuiop";

            conn = DriverManager.getConnection(sql, name, password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
