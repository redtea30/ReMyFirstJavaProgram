package util;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Package-name: utils
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 21-10-2023  15:59
 * Describe：
 */

public class Reader {
    public static String readProp(String key) {
        Properties properties = new Properties();
        File file = new File("web/day1025/src/main/resources/db.properties");
        try {
            properties.load(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        //验证命令读取器
        Reader reader = new Reader();
        System.out.println(reader.readProp("password"));


    }



}
