package assignment0829;

import java.util.Objects;

/**
 * ClassName:Book
 * Package: assignment0829
 * Description:
 *
 * @Author Neko
 * @Create 29/8/20237:58 pm
 * @Version 1.0
 */
public class Book {
    public String name;
    public double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
