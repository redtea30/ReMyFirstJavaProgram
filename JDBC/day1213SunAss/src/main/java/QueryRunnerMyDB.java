import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 * Package-name: PACKAGE_NAME
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 13-12-2023  17:27
 * Describe：
 */

public class QueryRunnerMyDB {
    // 存在这里不合适，但是临时存储很ok
    String url = "jdbc:mysql://localhost:3306/security_db";
    String username = "root";
    String password = "qwertyuiop";

    Connection connection = DriverManager.getConnection(url, username, password);
    QueryRunner runner = new QueryRunner();

    public QueryRunnerMyDB() throws SQLException {
    }

    // 最先注册驱动
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    // 查询所有用户
    public List<Student> queryAll() throws SQLException {
        System.out.println("查询所有");
        String sql = "select * from student";
        List<Student> query = runner.query(connection, sql, new BeanListHandler<Student>(Student.class));
        return query;
    }

    // 查询单个用户
    public Student queryOne(String name, String age) throws SQLException {
        String sql = "select * from student where name =? and age =?";
        Student student = runner.query(connection, sql, new BeanHandler<Student>(Student.class), name, age);
        return student;
    }

    // 增
    public int insert(String name, int age, String password) throws SQLException {
        String sql = "insert into student(name, age, password) values(?,?,?)";
        int update = runner.update(connection, sql, name, age, password);
        return update;
    }

    // 修改密码
    public int update(String name, String age, String password) throws SQLException {
        String sql = "update student set name =?, age =?, password =? where name =?";
        int update = runner.update(connection, sql, name, age, password, name);
        return update;
    }

    // 删
    public int delete(String name, int age, String password) throws SQLException {
        String sql = "delete from student where name =? and age = ? and password = ?";
        int update = runner.update(connection, sql, name, age, password);
        return update;

    }

    @Test
    public void test01() throws SQLException {
        List<Student> students = queryAll();
        for (Student student : students) {
            System.out.println(student);
        }

    }

}

