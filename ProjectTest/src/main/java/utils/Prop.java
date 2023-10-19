package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Package-name: utils
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 19/10/2023-10-2023 20-13
 * Describe：读取prop并返回值
 */

public class Prop {
    public static String readProperty(String key) {
        Properties prop = new Properties();
        File file = new File("src/main/java/com/cookie/email.properties");
        try (FileReader reader = new FileReader(file)) {
            prop.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return prop.getProperty(key);
    }
}
