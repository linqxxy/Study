package com.linqxxy.git.wwh2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMethod {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class cls=Person.class;
        System.out.println("获取所有方法");
        Method[] methods=cls.getDeclaredMethods();
        for (Method m:methods
             ) {
            System.out.println(m);
        }
        System.out.println("获取指定方法");
        try {
            //toString
            // 访问修饰符 返回类型 类名.方法名（[参数列表]）
            Method method=cls.getMethod("setName", String.class);
            Method method1=cls.getMethod("getName");
            Person person=new Person(11,"jake");
            System.out.println(person.toString());
            method.invoke(person,"Tom");
            System.out.println( method1.invoke(person));
            System.out.println(person.toString());
            System.out.println(method);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
