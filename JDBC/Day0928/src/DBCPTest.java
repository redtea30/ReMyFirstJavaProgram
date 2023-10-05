import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * DBCP 标准链接测试，以后都以这个为准
 * 可以设置properties文件，或者在包内设置也可以
 */
public class DBCPTest {
    public static void main(String[] args) throws IOException, SQLException {
        test();
    }


    public static void test() throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("JDBC/Day0928/resources/dbcp.properties"));
        BasicDataSource dataSource = BasicDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        for (int i = 0; i < 10000; i++) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select* from books");
            while (resultSet.next()) {
                System.out.print("thread" + i + "\t");
                System.out.print(resultSet.getString(3) + "\t");
            }
            System.out.println();
        }

    }
}
