import java.sql.*;

public class WhileClause {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manger", "root", "qwertyuiop");


        for (int i = 100000; i < 9999999; i++) {
            String sql = "insert into test(value) values (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);



            preparedStatement.setString(1, String.valueOf(i + 1));
            preparedStatement.executeUpdate();
        }


    }

    public void insertDB() {


    }


    public void testCall() throws SQLException {
/*
        String sql = "{Call whileClause(?,?)}";
        //不可以在 call 句子后加` ;`
        CallableStatement callableStatement = connection.prepareCall(sql);
        callableStatement.setInt(1, 100);
        callableStatement.registerOutParameter(2, Types.INTEGER);

        callableStatement.execute();
        int anInt = callableStatement.getInt(2);
        System.out.println(anInt);
*/

    }
}
