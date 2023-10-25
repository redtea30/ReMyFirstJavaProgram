package service;


import dao.UserDao;

/**
 * Package-name: service
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 23-10-2023  03:21
 * Describe：
 */

public class UserService {
    private UserDao userDao = new UserDao();

    public boolean register(String username, String password, String nickname, String email) {
        return userDao.insertNewUser(username, password, nickname, email);
    }
}
