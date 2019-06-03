package com.linqxxy.git.wwh1;

import java.io.*;

public class TestInputStream {
    public static void main(String[] args) {
        File file=new File("F:"+File.separator+"test"+File.separator+"inputStream.txt");
        try {
            FileInputStream input=new FileInputStream(file);
            byte[] buff=new byte[5];
            input.read(buff);
            System.out.println(new String(buff));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
