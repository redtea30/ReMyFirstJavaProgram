package util;

import org.apache.commons.dbutils.ResultSetHandler;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Package-name: util
 * Project-name: ReMyFirstJavaProgram
 * Author: Neko
 * 15-12-2023  16:30
 * Describe：
 */

public class MyDBUtils {

    private String url;
    private String username;
    private String password;

    public MyDBUtils() {
        try {
            InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
            Properties prop = new Properties();
            prop.load(stream);
            this.url = prop.getProperty("url");
            this.username = prop.getProperty("username");
            this.password = prop.getProperty("password");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public <T> List<T> query(String sql, ResultSetHandler<T> handler, Object... params) throws SQLException {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            for (int i = 0; i < params.length; i++) {
                stmt.setObject(i + 1, params[i]);
            }
            try (ResultSet rs = stmt.executeQuery()) {
                List<T> resultList = new ArrayList<>();
                while (rs.next()) {
                    resultList.add(handler.handle(rs));
                }
                return resultList;
            }
        }
    }

    public int update(String sql, Object... params) throws SQLException {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            for (int i = 0; i < params.length; i++) {
                stmt.setObject(i + 1, params[i]);
            }
            return stmt.executeUpdate();
        }
    }


    /**
     * 两种方法调用读取配置文件
     */
    @Test
    public void test01() {
        try {
            Properties properties = new Properties();
            // 使用当前线程的类加载器来获取资源
            try (InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties")) {
                if (input == null) {
                    throw new FileNotFoundException("jdbc.properties file not found in the classpath");
                }
                properties.load(input);
                String url = properties.getProperty("url");
                String username = properties.getProperty("username");
                String password = properties.getProperty("password");
                System.out.println(url);
                System.out.println(username);
                System.out.println(password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
            Properties prop = new Properties();
            prop.load(stream);
            System.out.println(prop.getProperty("username"));
            System.out.println(prop.getProperty("password"));
            System.out.println(prop.getProperty("url"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}



