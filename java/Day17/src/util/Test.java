package util;

import kaifamiao_cinema.Movie;
import kaifamiao_cinema.User;


/**
 * ClassName:Test
 * Package: util
 * Description:
 *
 * @Author Neko
 * @Create 22/8/202311:59 am
 * @Version 1.0
 */
public class Test {
    private static ListList movies;
    private static ListList users;
    private static Movie[] arr;
    private static User[] arr1;

    public static void main(String[] args) {

        ListList listList = new ListList(10);
        System.out.println(listList.getCapacity());
        Movie[] movie = new Movie[10];

        movie[0] = new Movie("阿凡达", 55.5, "詹姆斯·卡梅隆", 20221212, 2);
        movie[1] = new Movie("石村号", 42.5, "查克·派顿", 20081231, 2);

        User student = new User("ji", 123l, "password", 1);
        listList.add(movie[0]);
        listList.add(movie[1]);
        listList.add(student);

        System.out.println("listList.toStirng");
        System.out.println(listList.toString());

        System.out.println("toString");
        Object testEle1 = listList.searchEle(1);
        System.out.println(testEle1.toString());

        System.out.println("getCount");
        System.out.println(listList.getCount());

        listList.deleteValue(listList, 2);
        System.out.println(listList.toString());
        System.out.println(listList.getCount());






    }


}
