package dao;

import entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.Reader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Package-name: dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 21-10-2023 09-19
 * Describe：
 */

public class KFM_userDao {


    QueryRunner runner = new QueryRunner();

    //获取链接
    private Connection getConn() {
        KFMDao kfmDao = new KFMDao();
        try {
            return kfmDao.getConn();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 登陆验证
     *
     * @param username
     * @param password
     * @return
     */
    private User selectByUsernameAndPassword(String username, String password) {
        String sql = "select * from kfm_user where username = ? and password = ?";
        try {
            return runner.query(getConn(), sql, new BeanHandler<>(User.class), username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //登录验证
    public Boolean loginCheck(String username, String password) {
        User user = selectByUsernameAndPassword(username, password);
        if (!user.getPassword().equals(password) || !user.getUsername().equals(username)) {
            return false;
        }
        return true;
    }

    public int lastLogin(User user) throws SQLException {
        String sql = "update user set last_login = ? where username = ?";
        return runner.update(getConn(), sql, new Date(), user.getUsername());
    }


    public int add(User user) {

        //  拼字符串的技术
        StringBuffer sql = new StringBuffer("insert into kfm_user(");
        StringBuffer values = new StringBuffer("values(");
        List<Object> params = new ArrayList<>();

        //  变量如果为空就直接跳过去
        if (user.getUsername() != null) {
            sql.append(" username,");
            values.append(" ?,");
            params.add(user.getUsername());
        }
        if (user.getName() != null) {
            sql.append(" name,");
            values.append(" ?,");
            params.add(user.getName());
        }
        if (user.getPassword() != null) {
            sql.append(" password,");
            values.append(" ?,");
            params.add(user.getPassword());
        }
        if (user.getBirth() != null) {
            sql.append(" birth,");
            values.append(" ?,");
            params.add(user.getBirth());
        }
        if (user.getCreate_time() != null) {
            sql.append(" create_time,");
            values.append(" ?,");
            params.add(user.getCreate_time());
        }
        if (user.getPhone() != null) {
            sql.append(" phone, ");
            values.append(" ?, ");
            params.add(user.getPhone());
        }
        if (user.getEmail() != null) {
            sql.append(" email ");
            values.append(" ? ");
            params.add(user.getEmail());
        }


        String sql1 = sql.substring(0, sql.length() - 1) + ") ";
        sql1 = sql1 + values.substring(0, values.length() - 1) + ")";
        System.out.println(sql1);
        try {
            //如果返回值为正数，表示成功执行了SQL语句，并且影响了指定数量的数据库行。如果返回值为0，表示SQL语句执行成功，但没有影响任何数据库行。如果返回值为负数，通常表示出现了错误
            return runner.update(getConn(), sql1, params.toArray());
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }


    //  这里检测有没有同样的用户名
    public Boolean sameUsername(String username) {

        if (username.equals("")) return false;
        try (Connection conn = getConn();
             PreparedStatement prep = conn.prepareStatement(Reader.readProp("findUser"));
        ){
            prep.setString(1, username);
            ResultSet set = prep.executeQuery();

            if (set.next()) {
                String string = set.getString("username");
                if (string != "") return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;

    }


    public static void main(String[] args) throws SQLException {
        KFM_userDao kfmUserDao = new KFM_userDao();

        //  用户插入测试
/*

        String formatted = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(123, 9, 21));
        String formatted1 = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(new Date());
        User user = new User("test", "name", "password", formatted, "13000000000", "test@tt.com", formatted1);
        int add = kfmUserDao.add(user);*/

        // 登陆检查
//        Boolean user = kfmUserDao.loginCheck("test", "password");
//        System.out.println(user);
        System.out.println(kfmUserDao.sameUsername("test"));
        System.out.println(kfmUserDao.sameUsername("没有人"));

    }
}
