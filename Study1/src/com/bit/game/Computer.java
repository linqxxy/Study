package com.bit.game;

import java.util.Random;

public class Computer {
    private String name;
    private int score;
    Computer(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    public void addScore() {
        this.score++;
    }
    String fist() {
        Random random = new Random();
        int n = random.nextInt(3) + 1;//[0,3)-->[1-3]
        String str = null;
        switch (n) {
            case 1:
                System.out.println(name + ":" + "出石头 ");
                str = "石头";
                break;
            case 2:
                System.out.println(name + ":" + "出剪刀 ");
                str = "剪刀";
                break;
            case 3:
                System.out.println(name + ":" + "出布 ");
                str = "布";
                break;
        }
        return str;
    }
}
