package com.linqxxy.git.wwh;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestEmp {
    public static void main1(String[] args) {
       Emp emp=new Emp();
//        emp.setEname("Jack");
//        emp.setJob("Java Soft Engineer");
        String text="ename:jack | job : Java Soft Engineer ";
        String[] attributeNameAndValues=text.split("\\|");
        for (String nameAndValueText: attributeNameAndValues
             ) {
            String[] nameAndValue=nameAndValueText.split(":");
            String name=nameAndValue[0];
            String value=nameAndValue[1];
            //attributeNameAndValues(emp,name,value);
            methodSetValue(emp,name,value);
        }
        System.out.println(emp.toString());

    }

    private static void methodSetValue(Object object, String name, String value) {
        Class cls=object.getClass();
        String setMethodName="set"+name.substring(0,1).toUpperCase()+(name.length()==1
        ?"":name.substring(1));
        try {
            Method setMethod =cls.getDeclaredMethod(setMethodName,value.getClass());
            setMethod.invoke(object,value);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private static void attributeNameAndValues(Object object, String name, String value) {
        Class cls=object.getClass();
        try {
            Field attributeField=cls.getDeclaredField(name);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Class cls=Class.forName("com.linqxxy.git.wwh.Emp");
//            Field[] fields=cls.getDeclaredFields();
//            for (Field f:fields
//                 ) {
//                System.out.println(f);
//            }
            try {
                Object obj=cls.newInstance();
                try {
                    Field name=cls.getDeclaredField("ename");
                    name.set(obj,"Tom");
                    System.out.println(name.getType().getSimpleName());
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
