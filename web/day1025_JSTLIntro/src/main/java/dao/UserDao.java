package dao;

import entity.User;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.GenerousBeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.LoadDatasource;

import org.junit.Test;

import java.util.List;

/**
 * Package-name: dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 25-10-2023  18:28
 * Describe：
 */

public class UserDao {
    public List<User> selectAll() throws Exception {
        QueryRunner queryRunner = new QueryRunner(LoadDatasource.getDatasource());
        String sql = "select * from user";
        BasicRowProcessor basicRowProcessor = new BasicRowProcessor(new GenerousBeanProcessor());
        return queryRunner.query(sql, new BeanListHandler<>(User.class, basicRowProcessor));
    }

    /**
     * 只管删除单个用户
     *
     * @return
     */
    public Boolean deleteUser(String username) throws Exception {
        QueryRunner queryRunner = new QueryRunner(LoadDatasource.getDatasource());

        String sql = "delete from user where username = ?";
        int update = queryRunner.update(sql, username);

        // 如果受影响的行数大于0，那么删除操作成功，返回true。否则，返回false。
        return update > 0;
    }


    //  内容正常 OK
    @Test
    public void test() throws Exception {
        List<User> list = selectAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void deleteUser() throws Exception {
        Boolean user120 = deleteUser("user120");
        if (user120 == true) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }

    }

}
