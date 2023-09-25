import java.sql.*;

/**
 * 面向AI的编程，AI建议这么搞定，按就这么做了
 */
public class JDBCUtils {
    //这里应该合理设置几个getter和Setter的，我偷懒全设成public算了
    //自己测试没影响
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/manger";
    private static String user = "root";
    private static String password = "qwertyuiop";
    public static String books = "SELECT * FROM books";
    public static String log = "SELECT * FROM operation_log";

    //这里使用单例模式创建对象，节省内存
    private Connection connection;
    private PreparedStatement preparedStatement;

    public static void loadDriver() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ResultSet queryBook(String sql, Object... objects) {
        connection = getConn();
        try {
            preparedStatement = connection.prepareStatement(sql);
            setObject(preparedStatement, objects);
            return preparedStatement.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int updateBook(String sql, Object... objects) {
        try {
            connection = getConn();
            preparedStatement = connection.prepareStatement(sql);
            setObject(preparedStatement, objects);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * preparedStatement 键入数据
     *
     * @param preparedStatement
     * @param object
     */
    private void setObject(PreparedStatement preparedStatement, Object... object) {
        //这里就是把输入的object可变长度数组输入进preparedStatement里
        for (int i = 0; i < object.length; i++) {
            try {
                preparedStatement.setObject(i + 1, object[i]);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * 加载当前数据库的Connection对象
     *
     * @return
     */
    public Connection getConn() {
        loadDriver();
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (connection != null) return connection;
        return null;
    }

    //Todo 改写所有的execute
    //TOdo 能加Close()的全补上
    public Integer updateSQL(String sql) {
        Integer temp = null;
        try {
            Statement statement = getConn().createStatement();
            temp = statement.executeUpdate(sql);
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return temp;
    }

    public ResultSet querySQL(String sql) {
        ResultSet temp = null;
        Statement statement = null;
        try {
            statement = getConn().createStatement();
            temp = statement.executeQuery(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return temp;
    }

    public void close() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
                //所以为这些特殊资源关闭后赋null值,主要有以下好处:
                //    告知垃圾回收器可以回收对象,减少内存占用
                //    避免误操作关闭后的资源导致异常
                //    好的编程习惯,显示资源被关闭和不再使用
                //    便于阅读和维护代码
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {

    }
}
