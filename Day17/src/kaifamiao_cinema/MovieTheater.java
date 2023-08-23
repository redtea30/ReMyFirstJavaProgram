package kaifamiao_cinema;

import util.List;

import java.util.Arrays;
import java.util.Scanner;

import static kaifamiao_cinema.Test.logged;
import static kaifamiao_cinema.Test.menuAdmin;


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
    private static Scanner sc = new Scanner(System.in);//这样的静态方法就只能本类里使用
    List listMovie = new List();
    List listUser = new List();

    /**
     * 通过电影名称进行搜索，并返回该电影的所有数据
     */
    public void searchMovie() {
        System.out.println("请输入你要查找的电影名称");
        String inputStr = sc.next();
        System.out.println(searchMovie(inputStr).toString());
    }

    public void searchListMovie() {
        System.out.println("请输入你要查找的电影名称");
        String inputStr = sc.next();


    }


    /**
     * 补丁，phone值类型为long，拿到long的长度
     *
     * @param phone
     * @return
     */
    public int getPhoneLength(long phone) {
        int phoneLength = 0;
        while (true) {
            phoneLength++;
            phone /= 10;
            if (phone == 0) break;
        }
        return phoneLength;
    }

    /**
     * 检查电话号有没有被注册过
     *
     * @param phone 传入的电话号码
     * @return true 表示被注册过了，false表示没有被注册过
     */
    public boolean searchUserByPhone(Long phone) {
        for (int i = 0; i < countUsers; i++) {
            if (users[i].getPhone() == phone) return true;
        }
        return false;
    }

    /**
     * 在users数组中新增一名用户
     *
     * @return 返回user是否创建成功
     */
    public boolean addUser() {
        dilatationU(users);//检查最后一位有没有满
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入新用户名称:");
        String username1 = sc.next();

        System.out.print("请输入手机号:");
        long phone1 = sc.nextLong();
        //电话号码长度和历史注册号码判断
        while (true) {
            if (getPhoneLength(phone1) != 11) {
                System.out.println("电话号码输入错误");
                System.out.print("请重新输入手机号:");
                phone1 = sc.nextLong();
            } else if (searchUserByPhone(phone1)) {
                System.out.println("电话号码已经被备注册过了");
                System.out.print("请重新输入手机号:");
                phone1 = sc.nextLong();
            } else {
                break;
            }
        }
        System.out.print("请输入密码:");
        String password1 = sc.next();
        System.out.println("请再次输入密码");
        String rePassword1 = sc.next();
        while (true) {
            if (rePassword1.equals(password1)) {
                break;
            } else {
                System.out.println("两次密码不一致请重新设置密码");
                System.out.print("请输入密码:");
                password1 = sc.next();
                System.out.println("请再次输入密码");
                rePassword1 = sc.next();
            }
        }
        //用户的权限值是2
        int role1 = 2;
        // 创建新的电影对象
        User newUser = new User(username1, phone1, password1, role1);

        users[countUsers++] = newUser;
        return users[countUsers - 1] == newUser;
    }


    /**
     * 属性编辑器，可以对user和movie两个类的属性进行编辑
     *
     * @param index    属性的下标
     * @param selector 对应不同的修改模式，1-4是movie的属性5-7是user的属性
     * @param value    传入的值，即将修改到原对象上
     */
    public void propertyEditor(int index, int selector, String value) {
        if (selector == 1) {
            int temp = Integer.parseInt(value);
            movies[index].setDate(temp);
        } else if (selector == 2) {
            movies[index].setName(value);
        } else if (selector == 3) {
            double temp = Double.parseDouble(value);
            movies[index].setPrice(temp);
        } else if (selector == 4) {
            movies[index].setDirector(value);
        } else if (selector == 5) {
            users[index].setUsername(value);
        } else if (selector == 6) {
            long temp = Long.parseLong(value);
            users[index].setPhone(temp);
        } else if (selector == 7) {
            users[index].setPassword(value);
        }
    }

    /**
     * 删除电影
     *
     * @return
     */
    public void deleteMovie() {
        System.out.println("请输入你想要删除的电影名称");
        Scanner sc2 = new Scanner(System.in);
        String deleteMovieName = sc2.next();
        int key = intSearchMovie(deleteMovieName);
        System.arraycopy(movies, key + 1, movies, key, ((countMovies--) - 1 - key));
        if (!(movies[key].getName().equals(deleteMovieName))) {

        }

    }

    /**
     * 展示当前的用户信息，并打印
     *
     * @param user 需要打印的用户对象
     */
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
    public User login(int role) {
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名");
            String name = sc1.next();
            User user = searchUser(name);
            if (user.getRole() == role) {
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
     * 搜索需要的movie对象，并返回下标
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
     * 搜索需要的user对象，并返回下标
     *
     * @param name
     * @return
     */
    public int intSearchUser(String name) {
        for (int i = 0; i < countUsers; i++) {
            if (name.equals(users[i].getUsername())) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 电影年份插排 降序
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
            System.out.println((i + 1) + ". " + movies[i].toString());
        }
    }

    /**
     * 用来替换原先ShowAllMovie的list类方法
     */
    public void showAllListMovie() {
        System.out.println(listMovie.toString());
    }

    /**
     * 为列表加电影
     */
    public void addMovie() {
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
        System.out.println("请输入电影票数量");
        int ticketNum = sc.nextInt();
        // 创建新的电影对象
        Movie newMovie = new Movie(name, price, director, date, ticketNum);

        movies[countMovies++] = newMovie;
        if (movies[countMovies - 1] == newMovie) System.out.println("添加成功");
        else System.out.println("添加失败");
    }


    {
        movies[0] = new Movie("阿凡达", 55.5, "詹姆斯·卡梅隆", 20221212, 2);
        movies[1] = new Movie("石村号", 42.5, "查克·派顿", 20081231, 2);
        movies[2] = new Movie("泰坦尼克号", 35.0, "詹姆斯·卡梅隆", 19971111, 2);
        movies[3] = new Movie("教父", 39.9, "弗朗西斯·福特·科波拉", 19721212, 2);
        movies[4] = new Movie("指环王3:王者无敌", 56.0, "彼得·杰克逊", 20030903, 2);
        movies[5] = new Movie("阿甘正传", 44.9, "罗伯特·泽米吉斯", 19940506, 2);
        movies[6] = new Movie("卧虎藏龙", 38.5, "李安", 20000101, 2);
        movies[7] = new Movie("辛德勒的名单", 49.9, "史蒂文·斯皮尔伯格", 19931115, 2);
        movies[8] = new Movie("盗梦空间", 42.5, "克里斯托弗·诺兰", 20101218, 2);
        movies[9] = new Movie("星际穿越", 55.0, "克里斯托弗·诺兰", 20141029, 2);

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

        for (int i = 0; i < countMovies; i++) {
            listMovie.add(movies[i]);
            listUser.add(users[i]);
        }


    }

    public MovieTheater() {

    }

    public MovieTheater(String name, double price, String director, int date, int leftTicket) {
        Movie movie = new Movie(name, price, director, date, leftTicket);
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


    /**
     * 为了少打几个字建的方法，实现更改某电影信息的效果
     */
    public void modifyMovieInfo() {
        System.out.println("请输入想要修改的电影名");
        String changeMovie = sc.next();
        int changeMovieIndex = intSearchMovie(changeMovie);
        if (changeMovieIndex == -1) {
            System.out.println("未找到");
        } else {

            System.out.println("1.修改名称");
            System.out.println("2.修改价格");
            System.out.println("3.修改导演");
            System.out.println("4.修改上映年份");
            System.out.println("0.返回上级菜单");
            int input = sc.nextInt();

            switch (input) {
                case 0 -> menuAdmin();
                case 1 -> {
                    System.out.print("请输入新的电影名称:");
                    String name1 = sc.next();
                    propertyEditor(changeMovieIndex, 2, name1);
                }
                case 2 -> {
                    System.out.print("请输入新的电影价格:");
                    double price1 = sc.nextDouble();
                    propertyEditor(changeMovieIndex, 3, String.valueOf(price1));
                }
                case 3 -> {
                    System.out.print("请输入新的导演名:");
                    String director1 = sc.next();
                    propertyEditor(changeMovieIndex, 4, String.valueOf(director1));
                }
                case 4 -> {
                    System.out.print("请输入新的上映年份:");
                    int date1 = sc.nextInt();
                    propertyEditor(changeMovieIndex, 4, String.valueOf(date1));
                }
                default -> System.out.println("输入错误");
            }

        }


    }

    /**
     * 用户信息编辑器，同电影编辑器
     */
    public void modifyUserInfo(User user1) {
        String modifyUser = user1.getUsername();
        int changeUserIndex = intSearchUser(modifyUser);
        if (changeUserIndex == -1) {
            System.out.println("未找到");
        } else {

            System.out.println("1.修改用户名");
            System.out.println("2.修改手机号");
            System.out.println("3.修改密码");
            System.out.println("0.返回上级菜单");
            int input = sc.nextInt();

            switch (input) {
                case 0 -> menuAdmin();
                case 1 -> {
                    System.out.print("请输入新的用户名:");
                    String username1 = sc.next();
                    propertyEditor(changeUserIndex, 5, username1);
                }
                case 2 -> {
                    System.out.print("请输入新的手机号:");
                    long phone1 = sc.nextLong();
                    propertyEditor(changeUserIndex, 6, String.valueOf(phone1));
                }
                case 3 -> {
                    System.out.print("请输入新的密码:");
                    String password1 = sc.next();
                    propertyEditor(changeUserIndex, 7, String.valueOf(password1));
                }
                default -> System.out.println("输入错误");
            }

        }


    }

    /**
     * 买票模块
     * reference 马浩kfm8
     */
    public void buyTicket() {
        showAllMovie();
        System.out.println("请输入想要购买的电影名");
        String input = sc.next();
        int index = intSearchMovie(input);
        int num = movies[index].getTicketsNum();
        while (index == -1 || num == 0) {
            showAllMovie();
            System.out.println("该电影不可购买,请重新输入");
            if (num == 0) System.out.println("当前余票0张");
            input = sc.next();
            index = intSearchMovie(input);
            num = movies[index].getTicketsNum();
        }

        //判断剩余票数
        System.out.println("请输入想要购买的票数");
        num = sc.nextInt();
        while (movies[index].getTicketsNum() - num < 0) {
            showAllMovie();
            System.out.println("电影票库存不足,请重新输入");
            System.out.println("当前电影" + movies[index].getName() + "剩余票数" + movies[index].getTicketsNum() + "张");
            num = sc.nextInt();
        }
        movies[index].setTicketsNum(movies[index].getTicketsNum() - num);
        Movie movie = new Movie(movies[index], num);
        logged.purchasedRecord(movie, num);
        System.out.println("买票成功");
    }


    /**
     * 展示已购买的票
     * 我直接一个循环
     */
    public void showPurchasedTicket() {
        System.out.println("======  当前已购买：  ======");
        for (int i = 0; i <= logged.getCountPurchased() - 1; i++) {
            System.out.println(logged.ticketToString(logged.getPurchased()[i]));
        }
    }
}
