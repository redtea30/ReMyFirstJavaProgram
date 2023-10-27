package util;

/**
 * Package-name: util
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 23-10-2023  03:33
 * Describe：
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/day1023";
    private static final String DB_USER = "kfm-cloud";
    private static final String DB_PASSWORD = "1234";
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


