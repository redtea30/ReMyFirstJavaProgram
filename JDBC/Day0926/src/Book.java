import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Book {
    //测试使用类
    public int id;
    public String bookTitle;
    public String author;
    public Date publicationDate;
    public BigDecimal price;
    public int quantity;

    public static class BookHandler implements Handler<Book> {

        @Override
        public List<Book> handle(ResultSet resultSet) throws SQLException {
            ResultSetMetaData metaData = resultSet.getMetaData();
            List<Book> list = new ArrayList<>();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()) {
                for (int i = 0; i < columnCount; i++) {
                    Book book = new Book();
                    book.id = resultSet.getInt("id");
                    book.bookTitle = resultSet.getString("book_title");
                    book.author = resultSet.getString("author");
                    book.publicationDate = resultSet.getDate("publication_date");
                    book.price = resultSet.getBigDecimal("price");
                    book.quantity = resultSet.getInt("quantity");
                    list.add(book);
                }
            }
            return null;
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manger", "root", "qwertyuiop");
        Statement statement = connection.createStatement();
        String sql = "select * from books";
        ResultSet resultSet = statement.executeQuery(sql);


        List<Book> handle = new BookHandler().handle(resultSet);
        System.out.println(Arrays.toString(new List[]{handle}));

    }
}
