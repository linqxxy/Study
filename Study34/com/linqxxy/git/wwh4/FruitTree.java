package com.linqxxy.git.wwh4;

public class FruitTree {
    private  FruitTree(){}
    public static Fruit getFruitInstance(String className) throws ClassNotFoundException {
        Class cls=Class.forName(className);
        try {
            return (Fruit) cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }throw new RuntimeException("此树没有嫁接该水果");
    }
}
