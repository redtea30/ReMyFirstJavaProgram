package com.sessionTest;
/**
 * Package-name: com.serverSite
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 19/10/2023-10-2023 23-18
 * Describe：
 */

public class FileRunner {
    public static void main(String[] args) throws Exception {
        com.sessionTest.FileMonitor fileMonitor = new com.sessionTest.FileMonitor(1000);
        fileMonitor.monitor("d:/clouder/server", new com.sessionTest.FileListener());
        fileMonitor.start();
    }
}
