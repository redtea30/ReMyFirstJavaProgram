package Assignment;

import java.util.Arrays;
/**
 * ClassName:Library
 * Package: Assignment
 * Description:
 *
 * @Author Neko
 * @Create 16/8/20238:03 pm
 * @Version 1.0
 */
public class Library {
    //：表示图书馆，包含属性：书库（使用数组保存图书）、添加图书
    //的方法、查找图书的方法、显示所有图书的方法

    static String[][] bookList = new String[0][4];//书库初始值，后面会扩容

    public static void main(String[] args) {
        //图书馆对象，用于调展示，搜索，添加
        Library ly = new Library();
        Book book1 = new Book("俺的奋斗","俺",2013,100);
        ly.addBook(book1);


        ly.findBook("俺");
        Book book2 = new Book("大王的奋斗","大王",2020,120);
        ly.addBook(book2);

        Book book3 = new Book("一阳指","乌龟大师",1999,999);
        ly.addBook(book3);

        Book book4 = new Book("小哥白尼","谁",1989,34);
        ly.addBook(book4);

        ly.findBook("大王的奋斗");


        System.out.println("展示图书馆");
        ly.showLibrary();

        //测试图书馆代码
//        for (int i = 0; i < bookList.length; i++) {
//            for (int j = 0; j < bookList[i].length; j++) {
//                System.out.print(bookList[i][j] + "\t");
//            }
//            System.out.println();
//        }

    }


    public void addBook(Book book) {
        String title = book.getTitle();
        String author = book.getAuthor();
        int year = book.getYear();
        double price = book.getPrice();

        int count = bookList.length;
        bookList = Arrays.copyOf(bookList, ++count);
        String[] arr = {title, author, String.valueOf(year), String.valueOf(price)};
        bookList[count - 1] = arr;
    }

    public void findBook(String target) {
        for (int i = 0; i < bookList.length; i++) {
            for (int j = 0; j < bookList[i].length; j++) {
                if (target.equals(bookList[i][j])) {
                    System.out.println(Arrays.toString(bookList[i]));
                }
            }
        }
        System.out.println("not found");
    }

    public void showLibrary() {
        System.out.println("title\tauthor\tyear\tprice");

        for (int i = 0; i < bookList.length; i++) {
            for (int j = 0; j < bookList[i].length; j++) {
                if (bookList[i][j] != null) {
                    System.out.print(bookList[i][j] + "\t");
                }
            }
            System.out.println();
        }


    }


}
