package dao;

/**
 * Package-name: dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 23-10-2023  03:21
 * Describe：废弃
 */

import entity.User;
import util.Constant;

public class UserDao {


    String insertStatement = "INSERT INTO sys_user(user_name, nick_name, password, email) VALUES (?, ?, ?, ?)";


    public void type(String type, User user) {
        if (Constant.INSERT_OPERATION.equals(type)) {
            insertNewUser(user);
        } else if (Constant.MODIFY_OPERATION.equals(type)) {
            updateUserInfo(user);
        }
    }

    public boolean insertNewUser(User user) {

        return false;







/*        try (Connection conn = DatabaseConnection.getConnection();
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
        }*/
    }

    public void updateUserInfo(User user) {


    }


}
