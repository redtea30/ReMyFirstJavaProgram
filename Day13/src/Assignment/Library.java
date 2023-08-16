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
    static String[][] bookList = new String[0][4];

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setPrice(100);
        book1.setAuthor("俺");
        book1.setTitle("俺的奋斗");
        book1.setYear(2013);
        addBook(book1.getTitle(), book1.getAuthor(), book1.getYear(), book1.getPrice());
        findBook("俺");

        Book book2 = new Book();
        book2.setPrice(120);
        book2.setAuthor("大王");
        book2.setTitle("大王的奋斗");
        book2.setYear(2020);
        addBook(book2.getTitle(), book2.getAuthor(), book2.getYear(), book2.getPrice());
        findBook("大王的奋斗");


        System.out.println("展示图书馆");
        showLibrary();

        //测试图书馆代码
//        for (int i = 0; i < bookList.length; i++) {
//            for (int j = 0; j < bookList[i].length; j++) {
//                System.out.print(bookList[i][j] + "\t");
//            }
//            System.out.println();
//        }

    }


    public static void addBook(String title, String author, int year, double price) {
        int count = bookList.length;
        bookList = Arrays.copyOf(bookList, ++count);

        String[] arr = new String[4];
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                arr[0] = title;
            } else if (i == 1) {
                arr[1] = author;
            } else if (i == 2) {
                arr[2] = String.valueOf(year);
            } else {
                arr[3] = String.valueOf(price);
            }
            bookList[count - 1] = arr;
        }


    }

    public static void findBook(String target) {
        for (int i = 0; i < bookList.length; i++) {
            for (int j = 0; j < bookList[i].length; j++) {
                if (target.equals(bookList[i][j])) {
                    System.out.println(Arrays.toString(bookList[i]));
                }
            }
        }
        System.out.println("not found");
    }

    public static void showLibrary() {
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
