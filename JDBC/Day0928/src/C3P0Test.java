import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Test {
    public static void main(String[] args) throws SQLException {
        //学习用创建方法，简单好用
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("test-c3p0");
        System.out.println(comboPooledDataSource);
        Connection connection = comboPooledDataSource.getConnection();
        System.out.println(connection);

        System.out.println(cpds);
        Connection connCpds = cpds.getConnection();
        System.out.println(connCpds);


        connection.close();
        connCpds.close();
    }

    private static DataSource cpds = new ComboPooledDataSource("test-c3p0");

    /**
     * 教科书的创建方法，设置静态对象，可以反复调用节省资源（大概）
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConnection2() throws SQLException {
        Connection conn = cpds.getConnection();
        return conn;
    }
}
