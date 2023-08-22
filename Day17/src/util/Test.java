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
    private static List movies;
    private static List users;
    private static Movie[] arr;
    private static User[] arr1;

    public static void main(String[] args) {

        List list = new List(10);
        System.out.println(list.getCapacity());
        Movie[] movie = new Movie[10];

        movie[0] = new Movie("阿凡达", 55.5, "詹姆斯·卡梅隆", 20221212, 2);
        movie[1] = new Movie("石村号", 42.5, "查克·派顿", 20081231, 2);

        User student = new User("ji", 123l, "password", 1);
        list.add(movie[0]);
        list.add(movie[1]);
        list.add(student);

        System.out.println("list.toStirng");
        System.out.println(list.toString());

        System.out.println("toString");
        Object testEle1 = list.searchEle(1);
        System.out.println(testEle1.toString());

        System.out.println("getCount");
        System.out.println(list.getCount());


    }


}
