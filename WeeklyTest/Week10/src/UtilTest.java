import org.junit.jupiter.api.Test;

import java.io.File;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class UtilTest {
    JDBCUtils jdbcUtils = new JDBCUtils();

    public static void main(String[] args) {
        String sql = "INSERT INTO BOOKS (book_title,publication_date,author,price,quantity) VALUES('" + 1 + "','" + 2 + "-" + 3 + "-" + 4 + "','" + 5 + "','" + 6 + "','" + 7 + "')";
        System.out.println(sql);


        String sql1 = "select * from books";
        UtilTest utilTest = new UtilTest();
        List<Book> books = utilTest.executeQuery(sql1);
        books.forEach((o) -> System.out.println(o.toString()));

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
     *当前数据库已经设置主键，不能传日期值
     */
    public void test02() {
        String description = " test";
//        java.util.Date date = new java.util.Date(System.currentTimeMillis());
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String formattedDate = sdf.format(date);
//        Timestamp ts = Timestamp.valueOf(formattedDate);
        Connection conn = jdbcUtils.getConn();
        try {

            //Statement statement = conn.createStatement();
            //最好不要使用format这种的
            String temp = "insert into operation_log (description, operation_time) values (  ?  +  ?  )";
            PreparedStatement ps = conn.prepareStatement(temp);
            ps.setString(1, description);
//            ps.setString(2, formattedDate);
            int i = ps.executeUpdate();
            if (i > 0) System.out.println("执行成功");
            else System.out.println("执行失败");

        } catch (SQLException e) {
            throw new RuntimeException(e);

        } finally {
            jdbcUtils.close();
        }


    }


    /**
     * 这个方法把books存储到List<Book>
     *
     * @param sql
     * @return
     */
    public List<Book> executeQuery(String sql) {

        //纯粹测试使用
        Connection connection = jdbcUtils.getConn();
        List<Book> books = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Book book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setBookTitle(resultSet.getString("book_title"));
                book.setPublicationDate(resultSet.getDate("publication_date"));
                book.setAuthor(resultSet.getString("author"));
                book.setPrice(resultSet.getBigDecimal("price"));
                book.setQuantity(resultSet.getInt("quantity"));
                books.add(book);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        jdbcUtils.close();
        return books;
    }

    @Test
    private void test03() {
        File file = new File("C:/Maven");
        if (!(file.exists())) {
            file.mkdir();
        }
    }

}


