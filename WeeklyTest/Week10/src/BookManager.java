/**
 * 随便写写啦
 */


import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookManager {
    Scanner scanner = new Scanner(System.in);

    public BookManager() {
        init();
    }

    public void init() {
        File file = new File("WeeklyTest/Week10/src/sql.txt");
        String url = "jdbc:mysql://localhost:3306/manger";

        //测试链接
        try {
            Connection conn = DriverManager.getConnection(url, "root", "qwertyuiop");
            System.out.println("检查对应数据库是否存在...");
        } catch (SQLException e) {
            try {
                System.out.println("数据库不存在，创建中");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "qwertyuiop");
                Statement statement = conn.createStatement();
                statement.execute("CREATE DATABASE IF NOT EXISTS manger ");
                System.out.println("数据库创建成功");
            } catch (SQLException ex) {
            }
        }


        try (
                //链接数据库
                Connection conn = DriverManager.getConnection(url, "root", "qwertyuiop");
                //JDBC
                Statement statement = conn.createStatement();
                //Reader
                Reader reader = new FileReader(file);
                BufferedReader br = new BufferedReader(reader);

        ) {
            //打个驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            //获取metaData
//            ResultSet rs = statement.getResultSet();
//            ResultSetMetaData rsmd = rs.getMetaData();
            //上边有点问题，会报空指针异常

            //执行代码塞到方法里了
            checkAndCreate(statement, br);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("初始化完成");
    }


    /**
     * 检测，通过扔异常进行创建
     *
     * @param statement
     * @param br
     */
    private static void checkAndCreate(Statement statement, BufferedReader br) {
        System.out.println("检测对应数据表格是否存在中...");
        try {
            statement.execute("SELECT * FROM books");
            statement.execute("SELECT * FROM operation_log");
        } catch (SQLException e) {
            //检测不存在 调用createDB（）
            System.out.println("缺少对应的数据库表格");
            try {
                createDB(statement, br);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

    }


    /**
     * 创建两个table的方法
     *
     * @param statement
     * @param br
     * @throws IOException
     * @throws SQLException
     */
    private static void createDB(Statement statement, BufferedReader br) throws IOException {
        //mysql语句转成String类型暂存
        String upper = "";
        String lower = "";
        for (int i = 0; i < 9; i++) {
            upper += br.readLine();
            upper += System.lineSeparator();
        }
        for (int i = 9; i < 15; i++) {
            lower += br.readLine();
            lower += System.lineSeparator();
        }

        //生成对应的数据库
        try {

            statement.executeUpdate(upper);
            statement.executeUpdate(lower);
            System.out.println("所需表格创建成功");
        } catch (SQLException e) {
            System.out.println("数据库创建失败，请检查");
            e.getMessage();
        }

    }

    /**
     * 增加图书的模块
     * 有没有模块能生成啊，太多了，写着真的累
     */
    public void addBookInfo(BookManager bm) {
        System.out.println("-----创建图书-----");
        //BookName
        System.out.println("请输入书名");
        String name;
        //这个count作为计数器，后面会重复使用
        int count = 0;
        do {
            if ((count++) != 0) {
                System.out.println("书名输入错误，请检查，退出请输入0");
            }
            Scanner sc = new Scanner(System.in);
            name = sc.next();
            if (name.equals(0)) start(bm);
        } while (name == null || name.equals(""));


        //year
        System.out.println("请输入出版年份");
        Integer year;
        count = 0;
        do {
            if ((count++) != 0) {
                System.out.println("年份输入错误，请检查，退出请输入0");
            }
            try {
                //这里必须新建一个Scanner对象，令人迷惑
                //否则会一直循环下去
                Scanner sc = new Scanner(System.in);
                year = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("你输入了个不是数字的东西");
                year = null;
            }
            if (year == 0) start(bm);
        } while (year == null || year < 0 || year > LocalDate.now().getYear());


        //month
        System.out.println("请输入出版月份");
        Integer month = null;
        count = 0;
        do {
            if ((count++) != 0) {
                System.out.println("月份输入错误，请检查，退出请输入0");
            }
            try {
                //这里必须新建一个Scanner对象，令人迷惑
                //否则会一直循环下去
                Scanner sc = new Scanner(System.in);
                month = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("你输入了个不是数字的东西");
                month = null;
            }
            //退出
            if (month != null && month == 0) start(bm);
        } while (month == null || month < 0 || month > 12);

        //day
        System.out.println("请输入出版天数");
        Integer day = null;
        count = 0;
        do {
            if ((count++) != 0) {
                System.out.println("天数输入错误，请检查，退出请输入0");
            }
            try {
                //这里必须新建一个Scanner对象，令人迷惑
                //否则会一直循环下去
                Scanner sc = new Scanner(System.in);
                day = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("你输入了个不是数字的东西");
                day = null;
            }
            //退出
            if (day != null && day == 0) start(bm);
        } while (day == null || day < 0 || day > 31);


        //AuthorName
        System.out.println("请输入作者名");
        String author;
        //这个count作为计数器，后面会重复使用
        count = 0;
        do {
            if ((count++) != 0) {
                System.out.println("作者名输入错误，请检查，退出请输入0");
            }
            Scanner sc = new Scanner(System.in);
            author = sc.next();
            if (author.equals(0)) start(bm);
        } while (author == null || author.equals(""));


        //price
        System.out.println("请输入价格");
        Double price = null;
        count = 0;
        do {
            if ((count++) != 0) {
                System.out.println("价格输入错误，请检查，退出请输入0");
            }
            try {
                //这里必须新建一个Scanner对象，令人迷惑
                //否则会一直循环下去
                Scanner sc = new Scanner(System.in);
                price = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("你输入了个不是数字的东西");
                price = null;
            }
            //退出
            if (price != null && price == 0) start(bm);
        } while (price == null || price < 0);


        //unit
        System.out.println("请输入数量");
        Integer unit = null;
        count = 0;
        do {
            if ((count++) != 0) {
                System.out.println("数量输入错误，请检查，退出请输入0");
            }
            try {
                //这里必须新建一个Scanner对象，令人迷惑
                //否则会一直循环下去
                Scanner sc = new Scanner(System.in);
                unit = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("你输入了个不是数字的东西");
                unit = null;
            }
            //退出
            if (unit != null && unit == 0) start(bm);
        } while (unit == null || unit < 0);


        //可以执行
        //但是这个拼接方法非常的反人类，还是不要这么写的好
        String sql = "INSERT INTO BOOKS (book_title,publication_date,author,price,quantity) VALUES('" + name + "','" + year + "-" + month + "-" + day + "','" + author + "','" + price + "','" + unit + "')";

        String url = "jdbc:mysql://localhost:3306/manger";
        try {
            Connection conn = DriverManager.getConnection(url, "root", "qwertyuiop");
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
            System.out.println("创建成功,返回主菜单");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("创建失败");
        }


    }

    /**
     * 就是个简单的菜单
     */
    private static void menu() {
        System.out.println("=================");
        System.out.println("KFM图书管理系统");
        System.out.println("1. 增加图书");
        System.out.println("2. 删");
        System.out.println("3. 改");
        System.out.println("4. 展示所有内容");
        System.out.println("0. 退出系统");
        System.out.println("=================");
        System.out.println("输入你想要进行的操作");
    }

    private void start(BookManager bm) {
        while (true) {
            menu();
            switch (scanner.nextInt()) {
                case 0 -> {
                    System.out.println("退出系统");
                    System.exit(1);
                }
                case 1 -> {
                    bm.addBookInfo(bm);
                }
                case 2 -> {
                    System.out.println("退出系统");
                    System.exit(1);
                }
                case 3 -> {
                    System.out.println("退出系统");
                    System.exit(1);
                }
                case 4 -> {
                    System.out.println("展示所有内容");
                    showAll();
                }
                default -> System.out.println("输入错误，请重新输入");
            }
        }

    }

    private static void showAll() {

    }

    public static void main(String[] args) {

        BookManager bm = new BookManager();
        bm.start(bm);

    }


}
