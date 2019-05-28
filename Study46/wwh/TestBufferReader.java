package com.linqxxy.git.wwh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferReader {
    public static void main(String[] args) {
        try  (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("请输入信息");
            String str= reader.readLine();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
