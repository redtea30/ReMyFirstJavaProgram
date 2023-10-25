package dao;

import entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Package-name: dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 20/10/2023-10-2023 17-52
 * Describe：对数据库进行操作，连接数据库，查询所有，验证，增加
 */

public class UserDao {
    //  queryRunner 对象
    private QueryRunner runner = new QueryRunner();

    private String url = "jdbc:mysql://localhost:3306/test1016";
    private String username = "root";
    private String password = "qwertyuiop";

    private Connection getConn(String url, String username, String password) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return DriverManager.getConnection(url, username, password);
    }

    public List<User> selectAll() {
        String sql = "select * from user";
        try {
            return runner.query(getConn(url, username, password), sql, new BeanListHandler<>(User.class), username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public User selectByUsernameAndPassword(String username, String password) {
        String sql = "select * from user where name = ? and password = ?";
        try {
            return runner.query(getConn(url, this.username, this.password), sql, new BeanHandler<>(User.class), username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int add(User user) {
        //  拼字符串的技术
        StringBuffer sql = new StringBuffer("insert into users(");
        StringBuffer values = new StringBuffer("values(");
        List<Object> params = new ArrayList<>();

        //  变量如果为空就直接跳过去
        if (user.getUsername() != null) {
            sql.append(" name,");
            values.append(" ?,");
            params.add(user.getUsername());
        }
        if (user.getPassword() != null) {
            sql.append(" password,");
            values.append(" ?,");
            params.add(user.getPassword());
        }
        if (user.getEmail() != null) {
            sql.append(" email,");
            values.append(" ?,");
            params.add(user.getEmail());
        }

        String sql1 = sql.substring(0, sql.length() - 1) + ") ";
        sql1 = sql1 + values.substring(0, values.length() - 1) + ")";
        System.out.println(sql1);
        try {
            return runner.update(getConn(url, username, password), sql1, params.toArray());
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

}
