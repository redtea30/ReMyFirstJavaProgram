package com.myServletTest;

import java.sql.*;

public class JDBCtest {
    public static void main(String[] args) {


    }

    /**
     * 获取connection对象，仅此而已
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Connection conn() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1016", "root", "qwertyuiop");
        return conn;
    }

    public Boolean loginTestALL(String username, String password, String email) {
        try (Connection conn = conn();
             PreparedStatement prep = conn.prepareStatement("SELECT * FROM user")

        ) {
            ResultSet resultSet = prep.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            while (resultSet.next()) {
                if (username.equals(resultSet.getString("username"))
                        && password.equals(resultSet.getString("password"))
                        && email.equals(resultSet.getString("email"))
                ) {
                    return true;
                }
            }
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean loginTestName(String username) {
        try (Connection conn = conn();
             PreparedStatement prep = conn.prepareStatement("SELECT username FROM user")
        ) {
            ResultSet resultSet = prep.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            while (resultSet.next()) {
                if (username.equals(resultSet.getString("username"))) {
                    return true;
                }
            }
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public Boolean EmailPassword(String username, String email, String password) {
        try (Connection conn = conn();
             PreparedStatement prep = conn.prepareStatement("SELECT password,email FROM user where username = ?")
        ) {
            prep.setString(1, username);
            ResultSet resultSet = prep.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            while (resultSet.next()) {
                if (password.equals(resultSet.getString("password"))
                        && email.equals(resultSet.getString("email"))) {
                    return true;
                }
            }
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }


    public boolean insertUser(String username, String email, String password) {
        try (Connection conn = conn();
             PreparedStatement prep = conn.prepareStatement(
                     "INSERT INTO user (username,email,password) VALUES (?,?,?)"
             )) {
            prep.setString(1, username);
            prep.setString(2, email);
            prep.setString(3, password);
            int i = prep.executeUpdate();
            if (i < 1) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
