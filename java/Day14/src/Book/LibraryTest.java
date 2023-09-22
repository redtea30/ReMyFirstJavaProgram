package Book;

import java.util.Scanner;

/**
 * ClassName:LibraryTest
 * Package: Book
 * Description:
 *
 * @Author Neko
 * @Create 17/8/202312:11 pm
 * @Version 1.0
 */
public class LibraryTest {
    private static Scanner scanner = new Scanner(System.in);
    private static Library lib = new Library();

    public static void Menu() {
        System.out.println("*******************");
        System.out.println("1. 查看所有图书");
        System.out.println("2. 添加图书");
        System.out.println("3. 查询图书");
        System.out.println("4. 退出");
        System.out.println("*******************");
    }

    public static void addBook() {
        System.out.println("请输入图书名称：");
        String title = scanner.next();
        System.out.println("请输入图书作者：");
        String author = scanner.next();
        System.out.println("请输入图书出版年份：");
        int year = scanner.nextInt();
        System.out.println("请输入图书价格：");
        double price = scanner.nextDouble();
        Book book = new Book(title, author, year, price);

        boolean isTrue = lib.addBook(book);
        if (isTrue) System.out.println("添加成功");
        else System.out.println("添加失败");
    }

    public static void searchBook() {
        System.out.println("请输入书名");
        String title = scanner.next();
        Book book = lib.searchBook(title);
        if (book == null) System.out.println("没找到");
        else {
            System.out.println(book.info());
        }
    }

    public static void showAll() {
        lib.showAll();
    }

    public static void main(String[] args) {
        while (true) {
            Menu();
            int input = scanner.nextInt();
            switch (input) {
                case 1 -> showAll();
                case 2 -> addBook();
                case 3 -> searchBook();
                case 4 -> {
                    System.out.println("退出");
                    return;
                }
                default -> System.out.println("输入错误");

            }
        }
    }
}
