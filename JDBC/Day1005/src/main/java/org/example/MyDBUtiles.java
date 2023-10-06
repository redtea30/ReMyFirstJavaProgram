package org.example;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/*ref:https://www.tutorialspoint.com/dbutils/dbutils_first_application.htm
 * */
public class MyDBUtiles {

    //单例模式
    private Connection connection;

    private PreparedStatement prepared;
    private DruidDataSource dataSource;

    public int update(String sql, Object... params) throws Exception {
        getPrepared(sql);
        setPrepared(params);
        return prepared.executeUpdate();
    }

    /**
     * 获取第一个
     *
     * @param sql
     * @param handler
     * @param params
     * @param <E>
     * @return
     * @throws Exception
     */
    public <E> E selectOne(String sql, Handler<E> handler, Object... params) throws Exception {
        List<E> list = select(sql, handler, params);
        if (list != null) {
            return list.get(0);
        }
        return null;
    }


    /**
     * 设置泛型方法提供给更多类型
     * 通过list存储数据
     *
     * @param sql
     * @param handler
     * @param params
     * @param <E>
     * @return
     * @throws Exception
     */
    public <E> List<E> select(String sql, Handler<E> handler, Object... params) throws Exception {
        getPrepared(sql);
        setPrepared(params);

        ResultSet resultSet = prepared.executeQuery();
        //可以使用泛型，修改成泛型方法
        List<E> list = new ArrayList<>();
        while (resultSet.next()) {
            E temp = handler.handle(resultSet);
            list.add(temp);
        }
        return list;
    }

    private void setPrepared(Object... params) throws SQLException {
        for (int i = 0; i < params.length; i++) {
            //这里就是给preparedStatement里面塞东西，但是序列不一样
            prepared.setObject(i, params[i - 1]);
        }
    }


    private void getPrepared(String sql) throws Exception {
        getConnection();
        prepared = connection.prepareStatement(sql);
    }

    private void getConnection() throws Exception {
        if (connection == null) {
            getDatasource();//创建DruidDatasource对象
            connection = dataSource.getConnection();
        }
    }

    private void getDatasource() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("JDBC/Day1005/src/main/java/org/example/druid.properties"));
        dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
    }


    /**
     * CClean up the environment − Requires explicitly closing all the database resources versus relying on the JVM's garbage collection.
     *
     * @throws SQLException
     */
    private void close() throws SQLException {
        if (prepared != null) {
            prepared.close();
        }
        if (connection != null) {
            connection.close();
        }
        //使用Druid的关闭方法
        if (dataSource != null) {
            dataSource.close();
        }
    }


}
