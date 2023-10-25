package servlet;


import util.DatabaseConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

/**
 * Package-name: util
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 23-10-2023  03:50
 * Describe：
 */

@WebServlet("/createTable")
public class CreateTableServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            String createTableSQL = "CREATE TABLE IF NOT EXISTS`sys_user` (" +
                    "`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键'," +
                    "`user_name` VARCHAR(64) NOT NULL DEFAULT 'NULL' COMMENT '用户名'," +
                    "`nick_name` VARCHAR(64) NOT NULL DEFAULT 'NULL' COMMENT '昵称'," +
                    "`password` VARCHAR(64) NOT NULL DEFAULT 'NULL' COMMENT '密码'," +
                    "`status` CHAR(1) DEFAULT '0' COMMENT '账号状态（0正常 1停用）'," +
                    "`email` VARCHAR(64) DEFAULT NULL COMMENT '邮箱'," +
                    "`phonenumber` VARCHAR(32) DEFAULT NULL COMMENT '手机号'," +
                    "`sex` CHAR(1) DEFAULT NULL COMMENT '用户性别（0男，1女，2未知）'," +
                    "`avatar` VARCHAR(128) DEFAULT NULL COMMENT '头像'," +
                    "`user_type` CHAR(1) NOT NULL DEFAULT '1' COMMENT '用户类型（0管理员，1普通用户）'," +
                    "`create_by` BIGINT(20) DEFAULT NULL COMMENT '创建人的用户id'," +
                    "`create_time` DATETIME DEFAULT NULL COMMENT '创建时间'," +
                    "`update_by` BIGINT(20) DEFAULT NULL COMMENT '更新人'," +
                    "`update_time` DATETIME DEFAULT NULL COMMENT '更新时间'," +
                    "`del_flag` INT(11) DEFAULT '0' COMMENT '删除标志（0代表未删除，1代表已删除）'," +
                    "PRIMARY KEY (`id`)" +
                    ") ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';";

            stmt.execute(createTableSQL);
            resp.getWriter().write("Table `sys_user` created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            resp.getWriter().write("Error creating table: " + e.getMessage());
        }
    }
}
