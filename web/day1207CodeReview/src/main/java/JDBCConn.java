import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Package-name: PACKAGE_NAME
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 07-12-2023  20:48
 * Describe：
 */

public class JDBCConn {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.getConnection("jdbc:mysql://localhost:3306/my","root","qwertyuiop");
    }
}
