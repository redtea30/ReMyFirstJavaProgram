package assignment.cinema;

/**
 * ClassName:Movie
 * Package: assignment.cinema
 * Description:
 *
 * @Author Neko
 * @Create 19/8/20234:20 pm
 * @Version 1.0
 */
public class Movie {
    private String name;
    private double price;
    private String director;
    private int date;


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String setDirector() {
        return this.director;
    }

    public int setDate() {
        return this.date;
    }

    public Movie() {
    }

    public Movie(String name, double price, String director, int date) {
        this.date = date;
        this.name = name;
        this.director = director;
        this.price = price;
    }

}
