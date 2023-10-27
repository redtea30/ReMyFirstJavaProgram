package service;

import dao.UserDao;
import entity.User;

import java.util.List;

/**
 * Package-name: service
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 25-10-2023  19:50
 * Describe：
 */

public class UserService {
    private UserDao dao = new UserDao();


    public List<User> findAll() {
        try {
            return dao.selectAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
