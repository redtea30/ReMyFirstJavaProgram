package ApacheDbutilTest;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.example.Books;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class QueryRunnerTest1 {
    public static void main(String[] args) throws Exception {
        DbUtils dbUtils = new DbUtils();
        QueryRunner queryRunner = new QueryRunner(getDatasource());
        String select = "SELECT * FROM books";//todo 留着查询的时候补充
        String sql = "UPDATE books SET book_title = ? WEHERE book_tile =?";

        //  int query1 = queryRunner.query(sql, , );


        //ArrayHandler --> 第一行数据 --> Object 数组中
        Object[] query = queryRunner.query(select, new ArrayHandler());
        System.out.println(Arrays.toString(query));

        //ArrayListHandler --> 每一行数据 --> Object 数组中，最后放到 List 集合中
        List<Object[]> query1 = queryRunner.query(select, new ArrayListHandler());
        query1.forEach(obj -> {
            System.out.println(Arrays.toString(obj));
        });

        //BeanHandler --> 第一行数据 --> 对象
        Books query2 = queryRunner.query(select, new BeanHandler<>(Books.class));
        System.out.println(query2.toString());

        //BeanListHandler --> 每一行数据 --> 对象 将对象放到 List 集合中
        List<Books> query3 = queryRunner.query(select, new BeanListHandler<>(Books.class));
        query3.forEach(obj -> {
            System.out.println(obj);
        });

        //ColumnListHandler --> 将某一列取出来放到 List 集合中
        List<Books> query4 = queryRunner.query(select, new ColumnListHandler<Books>());
        System.out.println(query4);

        // MapHandler --> 将第一行数据 列名当做 key 列内容 当做value 放到 Map 集合中
        Map<String, Object> query5 = queryRunner.query(select, new MapHandler());
        query5.forEach((k, v) -> {
            System.out.println(k + "-->" + v);
        });

        // MapListHandler 将每一行的数据 列名当 key 列内容 当 value 放到 Map 集合中，最后放到 List 集合中
        List<Map<String, Object>> query6 = queryRunner.query(select, new MapListHandler());
        query6.forEach((obj) -> {
            obj.forEach((k, v) -> {
                System.out.println(k + "--->" + v);
            });
        });

        // KeyedHandler 每一行的数据 列名 作为 key  列内容作为value 封装成 Map1对象 在将结果放到新的Map对象，key是执行的列的值 value就是Map1对象
        Map<Integer, Map<String, Object>> query7 = queryRunner.query(select, new KeyedHandler<Integer>("id"));
        query7.forEach((k, v) -> {
            System.out.println(k + "==>" + v);
        });

        // ScalarHandler 查询只有一行一列的结果 用这个实现类
        String sql1 = "select book_title from books where id = ?";
        List<Integer> query8 = queryRunner.execute(sql1, new ScalarHandler<Integer>(1), 1);
        System.out.println(query8);

    }


    private static DataSource getDatasource() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("JDBC/Day1005/src/main/java/org/example/druid.properties"));
        //以上为我项目中的相对路径
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        return dataSource;

    }

}
