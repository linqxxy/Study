package com.linqxxy.git.wwh;

import java.util.Date;

public class TestDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Date date=new Date();
        System.out.println(date.getClass());
        Class cls=Date.class;
        Class<?> cls1=Class.forName("java.util.Date");
        try {
            Date date1= (Date) cls1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(cls.equals(date.getClass()));
        System.out.println(cls1.equals(cls));
    }
}
