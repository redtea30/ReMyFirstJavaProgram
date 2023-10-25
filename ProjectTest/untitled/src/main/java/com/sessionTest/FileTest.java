package com.sessionTest;


import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Package-name: com.serverSite
 * Project-name:Default (Template) Project
 * Author: Neko
 * 19/10/2023-10-2023 22-19
 * Describe：
 */

public class FileTest {
    public static void main(String[] args) {


    }

    /**
     * File测试使用
     */
    @Test
    public void testFile() {
        File file = new File("ProjectTest/untitled/src/main/resources");
        File[] listFiles = file.listFiles();
//        for (File ele : listFiles) {
//            System.out.println(ele.length() / 1024 + "KB");
//            System.out.println(ele.getName());
//            System.out.println(new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date(ele.lastModified())));
//            System.out.println(ele.getAbsolutePath());
//        }
        new File("C:\\Users\\jksps\\Documents\\ReMyFirstJavaProgram\\ProjectTest\\untitled\\src\\main\\resources\\1001.jpg").delete();
    }

    //测试文件运行
    @Test
    public void testServer() {
        FileService fs;
        try {
            fs = new FileService(9999);
            fs.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}