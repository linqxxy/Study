package com.linqxxy.git.wwh2;

import java.lang.reflect.Field;

public class TestField {
    public static void main(String[] args) {
        Class cls=Student.class;
        System.out.println("获取属性");
        Field[] fields=cls.getFields();
        for (Field f:fields
             ) {
            System.out.println(f);
        }
        try {
            Field skilled=cls.getDeclaredField("skill");
            Student student=new Student();
            Object skil=skilled.get(student);
            System.out.println(skil);
            System.out.println(skilled);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
