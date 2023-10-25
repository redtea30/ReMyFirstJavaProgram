package util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Package-name: util
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 25-10-2023  19:15
 * Describe：
 */

public class LoadDatasource {
    private static Properties properties;


    static {
        properties = new Properties();
        // getClassLoader 获取类加载器
        InputStream resource = LoadDatasource.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            properties.load(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDatasource() throws Exception {
        return DruidDataSourceFactory.createDataSource(properties);
    }



}
