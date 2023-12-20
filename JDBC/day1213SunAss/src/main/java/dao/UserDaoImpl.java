package dao;

import org.apache.commons.dbutils.ResultSetHandler;
import pojo.SysUser;
import util.MyDBUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Package-name: dao
 * Project-name: ReMyFirstJavaProgram
 * Author: Neko
 * 15-12-2023  18:19
 * Describe：
 */

public class UserDaoImpl implements UserDao {
    MyDBUtils dbUtils = new MyDBUtils();

    @Override
    public SysUser findUserByUsernameAndPassword(String username, String password) throws SQLException {
        // JDBC code to connect to the database and fetch the user
        String sql = "select * from sys_user where username =? and password =?";
        List<SysUser> query = dbUtils.query(sql, new ResultSetHandler<SysUser>() {
            @Override
            public SysUser handle(ResultSet rs) throws SQLException {
                if (rs.next()) {
                    SysUser user = new SysUser();
                    user.setId(rs.getLong("id"));
                    user.setUserName(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                    return user;
                }
                return null;
            }
        }, username, password);
        if (query.size() > 0) {
            return query.get(0);
        } else {
            return null;
        }


    }

    @Override
    public int changePassword(String userName, String newPassword) throws SQLException {
        String sql = "update sys_user set password =? where username =?";
        return dbUtils.update(sql, newPassword, userName);
    }

    @Override
    public List<SysUser> getAllUsers() throws SQLException {
        String sql = "select * from sys_user";
        List<SysUser> query = dbUtils.query(sql, new ResultSetHandler<SysUser>() {
            @Override
            public SysUser handle(ResultSet rs) throws SQLException {
                if (rs.next()) {
                    SysUser user = new SysUser();
                    user.setId(rs.getLong("id"));
                    user.setUserName(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                    user.setNickName(rs.getString("nick_name"));
                    user.setEmail(rs.getString("email"));
                    user.setAvatar(rs.getString("avatar"));
                    user.setDelFlag(rs.getInt("del_flag"));
                }
                return null;
            }
        });
        if (query.size() > 0) {
            return query;
        }
        return null;
    }
}