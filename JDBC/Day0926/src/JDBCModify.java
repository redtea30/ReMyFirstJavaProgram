import java.sql.*;

public class JDBCModify {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manger", "root", "qwertyuiop");
        connection.setAutoCommit(false);
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate("update books set price =123 where id =1");
        int i1 = statement.executeUpdate("update books set price=99 where id =2");
        if (i > 0 && i1 > 0) {
            System.out.println("数据库修改成功");
        } else {
            System.out.println("数据库修改失败");
            connection.rollback();
        }

        Savepoint point1 = connection.setSavepoint("point1");

        String sql = "Update books set price = 999 where id =1";
        int i2 = statement.executeUpdate(sql);
        if (i2 > 0) {
            System.out.println("数据库修改成功");
        } else {
            System.out.println("修改失败");
        }

        try {
            if (true) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("失败,回滚");
            connection.rollback(point1);

        }
        connection.commit();

    }
}
