package com.linqxxy.git.wwh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {
    public static void main1(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("从键盘读取数据");
        if (scanner.hasNext()){
            System.out.println(scanner.next());
        }
        System.out.println("请输入含整数的字符串");
        if(scanner.hasNextInt()){
            System.out.println(scanner.nextInt());
        }else {
            System.out.println("格式错误");
        }
        System.out.println("请输入生日：");
        if(scanner.hasNext("\\d{4}-\\d{2}-\\d{2}")){
            System.out.println(scanner.next());
        }else {
            System.out.println("类型不合法");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            Scanner scanner= new Scanner(new File("F:"+File.separator+"test"+File.separator+"1.txt"));
            scanner.useDelimiter("\n");
            while (scanner.hasNext()){
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
