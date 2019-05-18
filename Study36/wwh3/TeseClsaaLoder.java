package com.linqxxy.git.wwh3;

public class TeseClsaaLoder {
    public static void main(String[] args) {
        Class cls=Member.class;
        //APPClassLoader应用程序类加载器
        System.out.println(cls.getClassLoader());
        //ExtClassLoader扩展类加载器
        System.out.println(cls.getClassLoader().getParent());
        //bootstrap启动类加载器
        System.out.println(cls.getClassLoader().getParent().getParent());
    }
}
