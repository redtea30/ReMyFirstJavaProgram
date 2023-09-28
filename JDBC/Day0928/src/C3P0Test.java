import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.*;

/**
 * c3p0连接方式
 */
public class C3P0Test {
    public static void main(String[] args) throws Exception {

        c3p0Link();

    }




    /**
     * 这里是c3p0标准链接演示
     *
     * @throws SQLException
     */
    private static void c3p0Link() throws SQLException {
        //学习用创建方法，简单好用
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("test-c3p0");
        System.out.println("-----------------------------------------------------------");

        System.out.println(comboPooledDataSource);
        Connection connection = comboPooledDataSource.getConnection();
        System.out.println(connection);
        System.out.println("-----------------------------------------------------------");

        System.out.println(cpds);
        System.out.println("-----------------------------------------------------------");

        Connection connCpds = cpds.getConnection();
        System.out.println(connCpds);


        Statement statement = connCpds.createStatement();
        String sql = "select * from books";
        ResultSet resultSet = statement.executeQuery(sql);
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        System.out.println("-----------------------------------------------------------");
        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(resultSet.getString(i));
            }
            System.out.println();
        }

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
