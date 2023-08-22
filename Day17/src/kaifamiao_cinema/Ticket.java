package kaifamiao_cinema;

/**
 * ClassName:ReDay15Assignment.cinema.kaifamiao_cinema.Ticket
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 21/8/202310:09 pm
 * @Version 1.0
 */
public class Ticket {

    private Movie movie;
    private int count;

    public Ticket() {
    }

    public Ticket(Movie movie, int count) {
        this.movie = movie;
        this.count = count;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Ticket(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "movie=" + movie +
                ", count=" + count +
                '}';
    }
}
