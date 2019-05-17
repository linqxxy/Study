package com.linqxxy.git.wwh;

public class FruitTree {
    private FruitTree(){};
    public static Fruit getInstance(String fruitName) throws ClassNotFoundException {
        Class cls=Class.forName(fruitName);
        try {
            return (Fruit) cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }throw new RuntimeException("此树没有嫁接该水果");
    }
}
