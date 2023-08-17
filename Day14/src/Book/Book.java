package Book;

/**
 * ClassName:Book
 * Package: Book
 * Description:
 *
 * @Author Neko
 * @Create 17/8/202311:32 am
 * @Version 1.0
 */
public class Book {
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

    public String info() {
        return title + "\t" + author + "\t" + year + "\t" + price;
    }

}
