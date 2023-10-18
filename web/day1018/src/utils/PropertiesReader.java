package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Package-name: utils
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 18/10/2023-10-2023 22-10
 * Describe：
 */

public class PropertiesReader {
    public static String read(String key) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(new File("C:\\Users\\jksps\\Documents\\ReMyFirstJavaProgram\\web\\day1018\\resources\\myMysqlPassword.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);

    }
}
