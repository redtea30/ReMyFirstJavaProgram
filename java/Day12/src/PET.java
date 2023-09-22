/**
 * ClassName:PET
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 15/8/20232:49 pm
 * @Version 1.0
 */
public class PET {
    String name;
    int age;
    char gender;
    double price;

    public PET() {
    }

    public PET(int age, char gender, double price, String name) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.price = price;
    }

    public void info() {
        System.out.println(name + "\t" + age + "\t" + gender + "\t" + price);
    }

    public static void main(String[] args) {
        PET pet1 = new PET(99, 'F', 123.4, "guatai");
        pet1.info();

        PET pet = new PET();

        pet.name = "pipi";
        pet.age = 5;
        pet.gender = 'M';
        pet.price = 255.5;
        pet.info();

    }
}
