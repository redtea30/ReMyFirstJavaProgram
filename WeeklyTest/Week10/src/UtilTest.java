import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class UtilTest {
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

}


