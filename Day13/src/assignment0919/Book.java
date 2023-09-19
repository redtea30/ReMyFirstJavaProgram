package assignment0919;

/**
 * ClassName:Book
 * Package: Assignment
 * Description:
 *
 * @Author Neko
 * @Create 16/8/20238:03 pm
 * @Version 1.0
 */
public class Book {
    //表示图书，包含属性：书名（title）、作者（author）、出版年份
    //（year）、价格（price）
    private String title;
    private String author;
    private int year;
    private double price;

    public Book() {
    }

    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
