package com.linqxxy.git.wwh1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class TestEncodingDecoding {

    public static void code1() {
        System.getProperties().list(System.out);
        String userHome = System.getProperty("user.home");
        System.out.println(userHome);
        //  C:\Users\Deleteorus
        //  /home/zhangsan
        //  /home/lisi
        //  多用户操作系统
    }

    public static void main(String[] args) {
        try (OutputStream out = new FileOutputStream(
                "F:" + File.separator + "test" + File.separator + "encoding.txt"
        )) {
            out.write("LOL".getBytes(StandardCharsets.ISO_8859_1));
            out.write("保持学习".getBytes());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

