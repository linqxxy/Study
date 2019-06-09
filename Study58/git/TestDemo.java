package com.linqxxy.git;

import java.io.*;

public class TestDemo {
    public static void main(String[] args) {
        int c;
        try {
            InputStream is=new MyOwnInputStream(new BufferedInputStream(new FileInputStream(
                    "F:"+ File.separator+"text"+File.separator+"text.txt")));
            while ((c=is.read())>=0){
                System.out.print((char)c);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
