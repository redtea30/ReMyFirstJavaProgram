/**
 * ClassName:Animal
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 28/8/20234:22 pm
 * @Version 1.0
 */
public abstract class Animal {
    public Object makeSound;
    String name;

    abstract public void makeSound();
}


class Dog extends Animal {
    String name = "Dog";

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " woof");
    }
}

class Cat extends Animal {
    String name = "Cat";

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " meow");
    }
}

class Cow extends Animal {
    String name = "Cow";

    public Cow(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " moo");
    }
}

class Zoo {
    private Animal[] animals;
    //private int count = 0;//这道题用不上的属性，先放这里

    public Zoo() {
    }

    public Zoo(Animal[] animals) {//这个是直接往里传值不带扩容的
        this.animals = animals;
    }

    public void makeSound() {
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();//methods don't forget brackets
        }
    }


}

class Test {
    public static void main(String[] args) {
        Animal[] animal = new Animal[]{new Dog("dog1"), new Cat("cat1"), new Cow("cow1")};
        Zoo zoo = new Zoo(animal);
        zoo.makeSound();
    }
}