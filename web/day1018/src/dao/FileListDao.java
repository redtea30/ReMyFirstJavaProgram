package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Package-name: dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 19/10/2023-10-2023 09-07
 * Describe：
 */

public class FileListDao {
    Connection conn;
    PreparedStatement prep;
    ResultSet set;


    public boolean insertTable() {
        getConn();//获取conn对象

        return false;
    }


    /**
     * 工具类，获取对应文件路径下的数组
     *
     * @return
     */
    private File[] readAllFiles() {
        File file = new File(getProp("path"));
        return file.listFiles(f -> f.isFile());
    }


    /**
     * 工具类获取标签
     *
     * @return
     */
    public Connection getConn() {

        try {
            Class.forName(getProp("driver"));
            conn = DriverManager.getConnection(getProp("uel"), getProp("username"), getProp("password"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


    //查询返回list集合，不适用
/*    public ArrayList prepQueryAll() {
        ArrayList<User> list = new ArrayList();
        getConn();
        try {
            set = prep.executeQuery(getProp("selectAll1"));
            while (set.next()) {
                User user = new User();
                user.setUsername(set.getString("username"));
                user.setPassword(set.getString("password"));
                user.setEmail(set.getString("email"));
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
        return list;
    }*/


    /**
     * 工具类，关闭作用
     */
    public void close() {
        if (conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (prep != null) {
            try {
                prep.close();
                prep = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (set != null) {
            try {
                set.close();
                set = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 工具方法，通过给定键拿到 Properties里的值
     * 测试Ok
     *
     * @param key
     * @return
     */
    public String getProp(String key) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(new File("C:\\Users\\jksps\\Documents\\ReMyFirstJavaProgram\\web\\day1018\\resources\\myMysqlPassword.properties")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop.getProperty(key);
    }

    public static void main(String[] args) {
        FileListDao fileListDao = new FileListDao();
        File[] files = fileListDao.readAllFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
