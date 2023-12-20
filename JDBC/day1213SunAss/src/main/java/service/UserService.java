package service;

import pojo.SysUser;

import java.sql.SQLException;
import java.util.List;

/**
 * Package-name: service
 * Project-name: ReMyFirstJavaProgram
 * Author: Neko
 * 15-12-2023  18:18
 * Describe：
 */

public interface UserService {
    SysUser login(String username, String password) throws SQLException;
    int changePassword(String username, String newPassword) throws SQLException;
    List<SysUser> getAllUsers() throws SQLException;
    // 其他所需方法...

}

