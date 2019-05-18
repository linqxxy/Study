package com.linqxxy.git.wwh2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class TestClass {
    public static void main1(String[] args) {
        Class cls =Test1.class;
        System.out.println("包名"+cls.getPackage().getName());
        System.out.println("包名"+cls.getSuperclass().getName());
        System.out.println("类名"+cls.getSuperclass().getSimpleName());
        System.out.println("接口"+"------------------------------");
        Class[] interfaces =cls.getInterfaces();
        for (Class cls1:interfaces
             ) {
            System.out.println(cls1.getName());
            System.out.println(cls1.getSimpleName());
        }
    }

    public static void main2(String[] args) throws NoSuchMethodException {
        Class cls=Test1.class;
        Constructor[] constructors=cls.getConstructors();
        for (Constructor c:constructors
             ) {
            Class[] parametersCls= c.getParameterTypes();
            String parameter =Arrays.toString(parametersCls);
            System.out.println(c.getName()+"("+parameter+")");
        }
        Constructor constructor=cls.getConstructor(Integer.class,Integer.class);
        try {
            Object obj=constructor.newInstance(1,2);
            System.out.println(obj.getClass());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(constructor);
    }
}
