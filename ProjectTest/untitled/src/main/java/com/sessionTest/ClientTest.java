package com.sessionTest;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * Package-name: com.serverSite
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 20/10/2023-10-2023 02-03
 * Describe：
 */

public class ClientTest {
    public static void main(String[] args) throws IOException {
        Socket socket;
        try {
            socket = new Socket("127.0.0.1", 9999);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        InputStream is = socket.getInputStream();




    }
}
