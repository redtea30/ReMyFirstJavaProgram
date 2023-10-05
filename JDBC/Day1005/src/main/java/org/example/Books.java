package org.example;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Books {
    private Integer id;
    private String book_title;
    private Date publication_date;
    private String author;
    private BigDecimal price;
    private Integer quantity;

}
