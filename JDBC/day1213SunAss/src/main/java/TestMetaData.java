import java.sql.*;

/**
 * Package-name: PACKAGE_NAME
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 13-12-2023  15:07
 * Describe：
 */

public class TestMetaData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/security_db", "root", "qwertyuiop");
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet catalogs = metaData.getCatalogs();

        while (catalogs.next()) {
            System.out.println(catalogs.getString(1)); // 打印目录（数据库）名称
        }
        PreparedStatement prep = connection.prepareStatement("insert into sys_user ( user_name, nick_name, password)       values (?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
        prep.setString(1, "user1");
        prep.setString(2, "nickname1");
        prep.setString(3, "pswd1");
        int i = prep.executeUpdate();
        ResultSet generatedKeys = prep.getGeneratedKeys();
        while (generatedKeys.next()) {
            System.out.println("新增的主键为" + generatedKeys.getInt(1));
        }


        prep.close();
        connection.close();


    }
}
