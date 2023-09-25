import org.junit.jupiter.api.Test;

import java.sql.*;
import java.text.SimpleDateFormat;

public class UtilTest {
    JDBCUtils jdbcUtils = new JDBCUtils();

    public static void main(String[] args) {
        String sql = "INSERT INTO BOOKS (book_title,publication_date,author,price,quantity) VALUES('" + 1 + "','" + 2 + "-" + 3 + "-" + 4 + "','" + 5 + "','" + 6 + "','" + 7 + "')";
        System.out.println(sql);

    }

    @Test
    /**
     * 通过SimpleDateFormat 对时间戳进行 format
     */
    public void test01() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);

    }

    @Test
    /**
     * 通过SimpleDateFormat 对时间戳进行 format
     */
    public void test02() {

        String description = " test";
        java.util.Date date = new java.util.Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(date);
        Timestamp ts = Timestamp.valueOf(formattedDate);
        Connection conn = jdbcUtils.getConn();
        try {

            //Statement statement = conn.createStatement();
            //最好不要使用format这种的
            String temp = "insert into operation_log (description, operation_time) values (  ?  +  ?  )";
            PreparedStatement ps = conn.prepareStatement(temp);
            ps.setString(1, description);
            ps.setString(2, formattedDate);
            int i = ps.executeUpdate();
            if (i > 0) System.out.println("执行成功");
            else System.out.println("执行失败");

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }


    }
}


