package com.linqxxy.git;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
        File file=new File("F:"+File.separator+"test"+"123.txt");
        if(file.exists()){
            file.delete();
            try {
                file.createNewFile();
                System.out.println(file.getAbsoluteFile());
                System.out.println("文件已存在，删除后创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                file.createNewFile();
                System.out.println("创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
