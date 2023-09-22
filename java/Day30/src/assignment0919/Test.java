package assignment0919;


/**
 * ClassName:Test
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 30/8/20238:33 pm
 * @Version 1.0
 */
public class Test {
    static QueueTest testQueue = new QueueTest();

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

        testQueue.enqueue(book1);
        testQueue.enqueue(book2);
        testQueue.enqueue(book3);
        testQueue.enqueue(book4);
        testQueue.enqueue(book5);
        testQueue.enqueue(book6);



        System.out.println(testQueue.peek());
        //队首
        System.out.println(testQueue.size());
        System.out.println(testQueue.isEmpty());

        testQueue.enqueue(book1);
        testQueue.enqueue(book2);
        testQueue.enqueue(book3);
        testQueue.enqueue(book4);
        testQueue.enqueue(book5);
        testQueue.enqueue(book6);
        testQueue.enqueue(book1);
        testQueue.enqueue(book2);
        testQueue.enqueue(book3);
        testQueue.enqueue(book4);
        testQueue.enqueue(book5);
        testQueue.enqueue(book6);
        System.out.println(testQueue.size());


        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.isEmpty());
        System.out.println(testQueue.size());



        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.isEmpty());
        System.out.println(testQueue.size());

        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.isEmpty());
        System.out.println(testQueue.size());


    }
}
