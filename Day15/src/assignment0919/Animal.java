package assignment0919;

/**
 * ClassName:Animal
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 18/8/20234:44 pm
 * @Version 1.0
 */
public class Animal {
    String name;
    String sound;

    public Animal() {
    }

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void sound() {
        System.out.println();
    }
}

class Dog extends Animal {
    public Dog() {
        sound = "wang";
        name = "dog";

    }

    public void sound() {
        System.out.println(sound);
    }
}

class Cat extends Animal {
    public Cat() {
        sound = "meow";
        name = "cat";

    }

    public void sound() {
        System.out.println(sound);
    }
}

class Cow extends Animal {
    public Cow() {
        sound = "mer";
        name = "cow";
    }

    public void sound() {
        System.out.println(sound+"\t"+name);
    }
}

class test {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            int num = (int) (Math.random() * 3) + 1;
            Animal an = null;
            switch (num) {
                case 1 -> an = new Cow();
                case 2 -> an = new Cat();
                case 3 -> an = new Dog();
            }
            an.sound();
            Thread.sleep(0);
        }


    }
}