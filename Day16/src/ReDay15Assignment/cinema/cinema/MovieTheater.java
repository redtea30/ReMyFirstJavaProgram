package ReDay15Assignment.cinema.cinema;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName:MovieTheather
 * Package: assignment.cinema
 * Description:
 *
 * @Author Neko
 * @Create 19/8/20234:21 pm
 * @Version 1.0
 */
public class MovieTheater {
    private static Movie[] movies = new Movie[10];
    private static User[] users = new User[10];
    private static int countMovies = 10;
    private static int countUsers = 10;

    /**
     * 创建新用户并检查是否创建成功
     *
     * @return
     */
    public boolean addUser() {
        dilatationU(users);//检查最后一位有没有满
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入新用户名称:");
        String username1 = sc.next();
        System.out.print("请输入手机号:");
        long phone1 = sc.nextLong();
        System.out.print("请输入密码:");
        String password1 = sc.next();
        int role1 = 2;
        // 创建新的电影对象
        User newUser = new User(username1, phone1, password1, role1);

        users[countUsers++] = newUser;
        return users[countUsers - 1] == newUser;
    }

    /**
     * 更改电影信息
     *
     * @param changeMovieIndex
     * @param name1
     * @param price1
     * @param director1
     * @param date1
     */
    public void changeMovie(int changeMovieIndex, String name1, double price1, String director1, int date1) {
        movies[changeMovieIndex].setDate(date1);
        movies[changeMovieIndex].setName(name1);
        movies[changeMovieIndex].setPrice(price1);
        movies[changeMovieIndex].setDirector(director1);
    }

    /**
     * 删除电影
     *
     * @return
     */
    public boolean deleteMovie() {
        System.out.println("请输入你想要删除的电影名称");
        Scanner sc2 = new Scanner(System.in);
        String deleteMovieName = sc2.next();
        int key = intSearchMovie(deleteMovieName);
        System.arraycopy(movies, key + 1, movies, key, ((countMovies--) - 1 - key));
        return !(movies[key].getName().equals(deleteMovieName));
    }

    public void showCurrentUserInfo(User user) {
        System.out.println(user.toString());
    }

    /**
     * 查找用户
     *
     * @param name
     * @return 返回查找的用户
     */
    public User searchUser(String name) {
        for (int i = 0; i < countUsers; i++) {
            if (name.equals(users[i].getUsername())) {
                return users[i];
            }
        }
        return null;
    }

    /**
     * 普通用户登录
     *
     * @return
     */
    public User login() {
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名");
            String name = sc1.next();
            User user = searchUser(name);
            if (user.getRole() == 2) {
                System.out.println("请输入密码");
                String password = sc1.next();
                return user;
            } else {
                System.out.println("输入错误");
                return null;
            }
        }
    }

    /**
     * 管理员登录前检查
     *
     * @return
     */
    public boolean isAdmin() {
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名");
            String name = sc1.next();
            User user = searchUser(name);
            if (user.getRole() == 1) {
                System.out.println("请输入密码");
                String password = sc1.next();
                return user.getPassword().equals(password);
            } else {
                System.out.println("输入错误");
                break;
            }
        }
        return false;
    }


    /**
     * 查找电影模块
     *
     * @return 一个Movie类型的数据，没找到就null
     */
    public Movie searchMovie(String name) {
        for (int i = 0; i < countMovies; i++) {
            if (name.equals(movies[i].getName())) {
                return movies[i];
            }
        }
        return null;
    }

    /**
     * 查找电影所在的下标
     *
     * @param name
     * @return
     */
    public int intSearchMovie(String name) {
        for (int i = 0; i < countMovies; i++) {
            if (name.equals(movies[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 插排 降序
     */
    public void insertSortMovies() {
        for (int i = 1; i < countMovies; i++) {
            int current = movies[i].getDate();
            Movie now = movies[i];
            int prev = i - 1;
            while (prev >= 0 && current > movies[prev].getDate()) {
                movies[prev + 1] = movies[prev];
                prev--;
            }
            movies[++prev] = now;
        }
    }

    /**
     * 展示所有用户信息
     */
    public void showAllUser() {
        for (int i = 0; i < countUsers; i++) {
            System.out.println(users[i].toString());
        }
    }

    /**
     * 展示所有电影
     */
    public void showAllMovie() {
        insertSortMovies();
        for (int i = 0; i < countMovies; i++) {
            System.out.println(movies[i].toString());
        }
    }

    /**
     * 为列表加电影
     */
    public boolean addMovie() {
        dilatation(movies);//检查最后一位有没有满
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入电影名称:");
        String name = sc.next();
        System.out.print("请输入电影价格:");
        double price = sc.nextDouble();
        System.out.print("请输入导演:");
        String director = sc.next();
        System.out.print("请输入上映年份:");
        int date = sc.nextInt();

        // 创建新的电影对象
        Movie newMovie = new Movie(name, price, director, date);

        movies[countMovies++] = newMovie;
        return movies[countMovies - 1] == newMovie;
    }


    static {
        movies[0] = new Movie("阿凡达", 55.5, "詹姆斯·卡梅隆", 2022);
        movies[1] = new Movie("石村号", 42.5, "查克·派顿", 2008);
        movies[2] = new Movie("泰坦尼克号", 35.0, "詹姆斯·卡梅隆", 1997);
        movies[3] = new Movie("教父", 39.9, "弗朗西斯·福特·科波拉", 1972);
        movies[4] = new Movie("指环王3:王者无敌", 56.0, "彼得·杰克逊", 2003);
        movies[5] = new Movie("阿甘正传", 44.9, "罗伯特·泽米吉斯", 1994);
        movies[6] = new Movie("卧虎藏龙", 38.5, "李安", 2000);
        movies[7] = new Movie("辛德勒的名单", 49.9, "史蒂文·斯皮尔伯格", 1993);
        movies[8] = new Movie("盗梦空间", 42.5, "克里斯托弗·诺兰", 2010);
        movies[9] = new Movie("星际穿越", 55.0, "克里斯托弗·诺兰", 2014);

        users[0] = new User("admin", 13811111111L, "123456", 1);
        users[1] = new User("李四", 13822221111L, "123456", 2);
        users[2] = new User("王五", 13833331111L, "123456", 2);
        users[3] = new User("赵六", 13844441111L, "123456", 2);
        users[4] = new User("钱七", 13855551111L, "123456", 2);
        users[5] = new User("孙八", 13866661111L, "123456", 2);
        users[6] = new User("周九", 13877771111L, "123456", 2);
        users[7] = new User("吴十", 13888881111L, "123456", 2);
        users[8] = new User("郑十一", 13899991111L, "123456", 2);
        users[9] = new User("王十二", 13810101111L, "123456", 2);

    }

    public MovieTheater() {

    }

    public MovieTheater(String name, double price, String director, int date) {
        Movie movie = new Movie(name, price, director, date);
    }

    /**
     * 检测数组是否需要扩容，一个方法干一个事情
     *
     * @param arr 传入数组
     * @return Boolean 值
     */
    public boolean needDilatation(Movie[] arr) {
        if (countMovies > arr.length - 5) return true;
        return false;
    }

    /**
     * 全自动数组扩容方法,直接扩容两倍
     * 配合needDilatation 来进行扩容
     *
     * @param arr 传入数组，
     */
    public void dilatation(Movie[] arr) {
        if (needDilatation(arr)) {
            movies = Arrays.copyOf(arr, (arr.length * 2));
        }
    }

    /**
     * 检测数组是否需要扩容，一个方法干一个事情
     *
     * @param arr1 传入数组
     * @return Boolean 值
     */
    public boolean needDilatationU(User[] arr1) {
        if (countUsers > arr1.length - 5) return true;
        return false;
    }

    /**
     * 全自动数组扩容方法,直接扩容两倍
     * 配合needDilatation 来进行扩容
     *
     * @param arr1 传入数组，
     */
    public void dilatationU(User[] arr1) {
        if (needDilatationU(arr1)) {
            users = Arrays.copyOf(arr1, (arr1.length * 2));
        }
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
