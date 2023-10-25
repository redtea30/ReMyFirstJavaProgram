package dao;

/**
 * Package-name: dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 23-10-2023  03:21
 * Describe：
 */

import util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDao {
    public boolean insertNewUser(String username, String password, String nickname, String email) {
        String sql = "INSERT INTO sys_user(user_name, nick_name, password, email) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, nickname);
            stmt.setString(3, password);
            stmt.setString(4, email);
            int result = stmt.executeUpdate();
            return result > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
