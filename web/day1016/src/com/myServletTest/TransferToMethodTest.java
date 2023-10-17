package com.myServletTest;

import java.io.*;

public class TransferToMethodTest {

    public static void main(String[] args) throws IOException {
        //测试TransferTo方法 OK
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream(new File("web/day1016/src/com/myServletTest/testimg.jpg")));
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(new File("web/day1016/src/com/myServletTest/out1.jpg")));
        bi.transferTo(bo);
        bo.flush();
        bo.close();
    }
}
