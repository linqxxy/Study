package com.bit.game;
import java.util.Scanner;

public class Person{
    private String name;
    private int score;
    public Person(String name){
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
    public String fist(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入出的招数：石头，剪刀，布");
        String str = scanner.nextLine();
        return str;
    }
}
