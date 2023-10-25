package dao;

import utils.Reader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Package-name: dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 21/10/2023-10-2023 09-20
 * Describe：
 */

public class KFMDao {


    private String url = Reader.readProp("DBday1021");
    private String createDb = Reader.readProp("DB");
    private String username = Reader.readProp("username");
    private String password = Reader.readProp("password");

    Connection getConn(String url, String username, String password) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return DriverManager.getConnection(url, username, password);

        //todo 35行不通过
    }

    Connection getConn() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return DriverManager.getConnection(url, username, password);

    }

    /**
     * 创建数据库
     *
     * @return
     */
    boolean CheckDatabase() throws SQLException {
        Connection conn = getConn(createDb, username, password);
        String db = "CREATE DATABASE IF NOT EXISTS day1021";
        Integer lines = null;
        try {
            //连接并创建
            conn = getConn(createDb, username, password);
            Statement statement = conn.createStatement();
            lines = statement.executeUpdate(db);

            //关闭连接
            conn.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        //返回值
        if (lines == null || lines < 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //创建数据库测试
        KFMDao kfmDao = new KFMDao();
        try {
            boolean b = kfmDao.CheckDatabase();
            System.out.println(b);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
