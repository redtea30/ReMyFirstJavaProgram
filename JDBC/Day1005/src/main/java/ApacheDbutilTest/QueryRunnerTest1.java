package ApacheDbutilTest;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.util.Properties;

public class QueryRunnerTest1 {
    public static void main(String[] args) throws Exception {
        DbUtils dbUtils = new DbUtils();
        QueryRunner queryRunner = new QueryRunner(getDatasource());
        String select = "SELECT * FROM manger";//todo 留着查询的时候补充
        String sql = "UPDATE manger SET book_title = ? WEHERE book_tile =?";
        int update = queryRunner.update(select);


    }


    private static DataSource getDatasource() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("JDBC/Day1005/src/main/java/org/example/druid.properties"));
        //以上为我项目中的相对路径
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        return dataSource;

    }

}
