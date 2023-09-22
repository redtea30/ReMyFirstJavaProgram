/**
 * ClassName:Ca
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 15/8/20238:10 pm
 * @Version 1.0
 */

class Test1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breed = "kj";
        dog.color = "green";
        Cat cat = new Cat();
        cat.breed = "bosi";
        cat.color = "yellow";
        cat.catchMouse();
        cat.eat();
        dog.eat();
        dog.watchDoor();
    }
}

public class Cat {
    //定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭()，看家()
    //要求：
    //​  1.按照以上要求定义Cat类和Dog类,属性要私有,生成无参、有参构造
    //​	2.定义测试类,在main方法中创建该类的对象并给属性赋值
    //​	3.调用成员方法,打印格式如下:
    //​	花色的波斯猫正在吃鱼.....
    //​	花色的波斯猫正在逮老鼠....
    //​	黑色的藏獒正在啃骨头.....
    //​	黑色的藏獒正在看家.....

    String color;
    String breed;

    public void catchMouse() {
        System.out.println("花色的波斯猫正在逮老鼠");
    }

    public void eat() {
        System.out.println("花色的波斯猫正在吃鱼");
    }


}

class Dog {
    String color;
    String breed;

    public void watchDoor() {
        System.out.println("黑色的藏獒正在看家");
    }

    public void eat() {
        System.out.println("黑色的藏獒正在啃骨头");
    }


}