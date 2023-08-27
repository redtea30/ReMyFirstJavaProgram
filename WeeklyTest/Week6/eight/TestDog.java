package Week6.eight;

/**
 * ClassName:TestDog
 * Package: Week6
 * Description:
 *
 * @Author Neko
 * @Create 26/8/202312:10 pm
 * @Version 1.0
 */
public class TestDog {
    public static void main(String[] args) {

        Animal a = new Animal();
        Animal b = new Dog();
        a.move();
        b.move();
        //b.bark();//这里直接报错，
    }
}


