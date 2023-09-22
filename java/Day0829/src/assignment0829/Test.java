package assignment0829;

/**
 * ClassName:Test
 * Package: assignment0829
 * Description:
 *
 * @Author Neko
 * @Create 29/8/20237:39 pm
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Java编程思想";
        book1.price = 79.8;

        Book book2 = new Book();
        book2.name = "Head First Java";
        book2.price = 68.5;

        Book book3 = new Book();
        book3.name = "Effective Java";
        book3.price = 88.6;

        Book book4 = new Book();
        book4.name = "Java核心技术";
        book4.price = 99.5;

        Book book5 = new Book();
        book5.name = "Java编程经典实例";
        book5.price = 56.2;

        Book book6 = new Book();
        book6.name = "Java编程经典实例";
        book6.price = 56.2;

        StackMain sm = new StackMain();
        sm.push(book1);
        sm.push(book2);
        sm.push(book3);
        sm.push(book4);
        sm.push(book5);
        System.out.println(sm.size());
        System.out.println(sm.pop().toString());
        sm.push(book6);
        sm.push(book5);
        System.out.println(sm.peek().toString());

        System.out.println("equals------------------------");
        System.out.println(sm.pop().equals(sm.peek()));
        System.out.println(sm.peek().toString());
        System.out.println(sm.size());




        sm.pop();
        sm.pop();
        sm.pop();
        sm.pop();
        sm.pop();



        System.out.println(sm.size());
        System.out.println(sm.isEmpty());
        System.out.println(sm.peek());
    }
}
