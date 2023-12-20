package dao;

import pojo.SysUser;

import java.sql.SQLException;
import java.util.List;

/**
 * Package-name: dao
 * Project-name: ReMyFirstJavaProgram
 * Author: Neko
 * 15-12-2023  18:19
 * Describe：
 */

public interface UserDao {
    SysUser findUserByUsernameAndPassword(String username, String password) throws SQLException;

    int changePassword(String userName, String newPassword) throws SQLException;
    List<SysUser> getAllUsers() throws SQLException;

}
