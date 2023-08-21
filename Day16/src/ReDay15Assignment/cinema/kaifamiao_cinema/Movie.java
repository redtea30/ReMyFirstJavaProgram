package ReDay15Assignment.cinema.kaifamiao_cinema;

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
    private int leftTicket;


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

    public int getDate() {
        return this.date;
    }

    public int getLeftTicket() {
        return leftTicket;
    }

    public void setLeftTicket(int leftTicket) {
        this.leftTicket = leftTicket;
    }



    public Movie(String name, double price, String director, int date, int leftTicket) {
        this.date = date;
        this.name = name;
        this.director = director;
        this.price = price;
        this.leftTicket = leftTicket;
    }

    @Override
    public String toString() {
        return "Movie: { Name: " + this.name + " , Price: " + this.price + " Director: " + this.director + " Date: " + this.date + " LeftTicket: " + leftTicket + " }";

    }

    @Override
    public boolean equals(Object obj) {
        //参考教科书
        if (!(obj instanceof Movie)) {//先判断是不是一个类的
            return false;
        } else if (this == obj) {//再判断地址值
            return true;
        }
        Movie temp = (Movie) obj;//先转换类型再做判断
        return this.name.equals(temp.name) && this.price == temp.price && this.director.equals(temp.director) && this.date == temp.date;//这里全是判断，逻辑不通过为false
    }


}
