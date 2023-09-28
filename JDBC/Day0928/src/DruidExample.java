import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;



public class DruidExample {

    public static void main(String[] args) throws Exception {
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



}