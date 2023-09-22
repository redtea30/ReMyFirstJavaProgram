import java.sql.*;


public class Start {
    public static void main(String[] args) {

        metaData1();
    }


    public static void update() {

        //链接（实现了autocloseable接口）
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "qwertyuiop");
             Statement stat = conn.createStatement();

        ) {
            //驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());


            //创建执行对象
            String insert = "INSERT INTO table1 (column1,column2,column3) VALUES( 'test1','test2','test3')";
            String delete = "DELETE FROM table1 where column1 = 'test1'";
            String update = "UPDATE table1 SET column1 = '张三' ,column2 = '李四',column3 = '王五' where column1 ='test1'";
            String select = "SELECT * FROM table1";
            int num;
            //num = stat.executeUpdate(insert);
            //num = stat.executeUpdate(update);
            //num = stat.executeUpdate(delete);

            ResultSet resultSet = stat.executeQuery(select);
            Array arr = resultSet.getArray(1);


            System.out.println(arr.toString());
            resultSet.close();

            //判断条件，返回值0或者-1就是没改不存在
/*            if (num > 0) {
                System.out.println("成功");
            } else {
                System.out.println("没改好");
            }*/

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void query() {
        //链接（实现了autocloseable接口）
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "qwertyuiop");
             Statement stat = conn.createStatement();

        ) {
            //驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            String select = "SELECT * FROM table1";

            boolean success = stat.execute(select);

            if (success) {
                ResultSet resultSet = stat.getResultSet();
                ResultSetMetaData rd = resultSet.getMetaData();
                //通过resultSetMetadata获取每个列的标题名称，不必要，练手用
                //resultset没有提供获取列明的方法
                System.out.println(rd.getColumnName(1) + "\t" + rd.getColumnName(2) + "\t" + rd.getColumnName(3));
                //这里还差个获取列名
                while (resultSet.next()) {
                    String column1 = resultSet.getString(1);
                    String column2 = resultSet.getString(2);
                    String column3 = resultSet.getString(3);
                    System.out.println(column1 + "\t" + column2 + "\t" + column3);
                }
                resultSet.close();
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void metaData1() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "qwertyuiop");
             Statement stat = conn.createStatement();
        ) {


            String select = "SELECT column1 one, column2 two, column3 three FROM table1";
            if (stat.execute(select)) {
                //resultset 和 resultsetmetaData必须写在执行语句后面
                ResultSet resultSet = stat.getResultSet();
                ResultSetMetaData metaData = resultSet.getMetaData();//通过前面3步进行转换
                int columnCount = metaData.getColumnCount();
                System.out.println(columnCount);//获取列数 3
                System.out.println(metaData.getCatalogName(1));//获取该数据库名称，这里的输入值 >0&&< columnCount
                System.out.println(metaData.getColumnName(1));//获取第一列的名称 显示原名称
                System.out.println(metaData.getColumnLabel(1));//获取第一列的别名，如果有的话
                System.out.println(metaData.getColumnType(1));//获取某列的某列数据库数据类型，返回数字对应Type()类的类型
                System.out.println(metaData.getColumnTypeName(1));//返回某列对应数据库的类型名称

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
