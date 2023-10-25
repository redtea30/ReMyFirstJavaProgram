package test;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;

/**
 * Package-name: test
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 21/10/2023-10-2023 11-29
 * Describe：
 */

public class TestHash {
    public static void main(String[] args) throws Exception {
        //ref https://developer.aliyun.com/article/610951


        String before = "加密测试";
        byte[] bytes = before.getBytes("utf-8");
        TestHash encrypt = new TestHash();

        //加密
        String encrypt1 = encrypt(before);
        System.out.println(encrypt1);

        //这个是验证方法
        System.out.println(verify(before, encrypt1));


    }

    public static String encrypt(String input) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(input.getBytes("UTF-8"));
        return Hex.encodeHexString(hash);

    }

    public static boolean verify(String input, String hash) throws Exception {
        String calculatedHash = encrypt(input);
        return calculatedHash.equals(hash);
    }

}
