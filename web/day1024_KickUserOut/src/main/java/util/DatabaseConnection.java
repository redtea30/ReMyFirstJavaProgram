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
    private static final String DB_URL = Reader.readProp("DBurl");
    private static final String DB_USER = Reader.readProp("loginAccount");
    private static final String DB_PASSWORD = Reader.readProp("password");

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


