package com.linqxxy.git.wwh1;

import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        Properties properties=new Properties();
        properties.setProperty("java","java is best");
        properties.setProperty("C++","C++ is Best");
        System.out.println(properties.getProperty("java"));
        System.out.println(properties.getProperty("C++"));
    }
}
