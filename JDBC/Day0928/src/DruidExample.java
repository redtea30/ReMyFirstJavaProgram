import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


/**
 * Druid线程线程池创建方式
 */
public class DruidExample {

    public static void main(String[] args) throws Exception {

        test();
        anotherWay();
    }

    public static void test() throws Exception {
        System.out.println("test01 ---");
        Properties properties = new Properties();
        properties.load(DruidExample.class.getClassLoader().getResourceAsStream("druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();

        System.out.println(connection);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM books");
        while (rs.next()) {
            String name = rs.getString(1);
            String password = rs.getString(1);
            System.out.println(name + password);
        }
        rs.close();
        statement.close();
        connection.close();
    }


    /**
     * 演示
     *
     * @throws Exception
     */
    public static void anotherWay() throws Exception {
        System.out.println("test02 ---");
        Properties prop = new Properties();
        prop.load(new FileInputStream("JDBC/Day0928/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        PreparedStatement preparedStatement = connection.prepareStatement("select * from books");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getObject(2));
        }
    }

    /**
     * 连接代码
     *
     * @throws Exception
     */
    public static void test3() throws Exception {
        System.out.println("test3");
        Properties properties = new Properties();
        properties.load(new FileInputStream("JDBC/Day0928/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from books");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getObject(1));
            System.out.println(resultSet.getObject(2));
            System.out.println(resultSet.getObject(3));
        }
    }


}