package com.linqxxy.git.wwh3;


import java.util.Date;

public class TestDemo {
    @SuppressWarnings("never used")
    public static void main1(String[] args) throws ClassNotFoundException {
        Date date=new Date();
        //类的全限定名
        Class cls=Class.forName("java.util.Date");
        System.out.println(cls);
        System.out.println(date.getClass());
        System.out.println(Date.class);
        System.out.println(cls==date.getClass());
        System.out.println(cls==Date.class);
    }

    public static void main(String[] args) {
        Class dataClass=Date.class;
        try {
            //使用此方法进行实例化是，类必须有无参的构造方法。
            Object obj=dataClass.newInstance();
            Date date=(Date) obj;
            System.out.println(date);
            System.out.println(obj != null);
            System.out.println(date.getClass());
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
