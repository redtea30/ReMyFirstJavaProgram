import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Book {
    //测试使用类
    public int id;

    public String bookTitle;

    public String author;

    public Date publicationDate;

    public BigDecimal price;


    public int quantity;

}
