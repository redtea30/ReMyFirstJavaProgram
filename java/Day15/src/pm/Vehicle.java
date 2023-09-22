package pm;

/**
 * ClassName:Vehicle
 * Package: pm
 * Description:
 *
 * @Author Neko
 * @Create 18/8/20232:04 pm
 * @Version 1.0
 */
public class Vehicle {
    String brand;
    int year;

    public Vehicle() {
    }

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(this.brand + " 品牌 " + this.year + " 年份");
    }


}

class Car extends Vehicle {
    int numDoors;
    int wheels;

    public Car() {
    }

    public Car(String brand, int year) {
    }

    public Car(String brand, int year, int numDoors, int wheels) {
        super(brand, year);
        this.numDoors = numDoors;
        this.wheels = wheels;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println(numDoors + "车门数量" + wheels + "几轮");
    }
}

class Motorcycle extends Vehicle {
    int engine;
    boolean hasSideCar;

    public Motorcycle() {
    }

    public Motorcycle(String brand, int year) {
    }

    public Motorcycle(String brand, int year, int engine, boolean hasSideCar) {
        super(brand, year);
        this.engine = engine;
        this.hasSideCar = hasSideCar;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println(engine + "马力" + hasSideCar + "是否有边车");
    }
}


class test {
    public static void main(String[] args) {
        Car car = new Car("bench", 2020, 4, 4);
        Motorcycle moto = new Motorcycle("Yamaha", 2010, 125, false);
        car.displayInfo();
        moto.displayInfo();

    }
}