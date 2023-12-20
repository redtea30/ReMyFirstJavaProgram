package service;

import dao.UserDao;
import dao.UserDaoImpl;
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

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public SysUser login(String username, String password) throws SQLException {
        // 实现登录逻辑...
        return userDao.findUserByUsernameAndPassword(username, password);
    }

    @Override
    public int changePassword(String userName, String newPassword) throws SQLException {
        // 实现修改密码逻辑...
        return userDao.changePassword(userName, newPassword);
    }

    @Override
    public List<SysUser> getAllUsers() throws SQLException {
        // 实现获取所有用户的逻辑...
        return userDao.getAllUsers();
    }
}