package com.linqxxy.test;

import java.util.Scanner;
public class Test09{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            int b=a*a;
            if(a<10){
                if(a==(b%10)){
                    System.out.println("Yes!");
                }else {
                    System.out.println("No!");
                }
            }else {
                if(a==(b%100)){
                    System.out.println("Yes!");
                }else {
                    System.out.println("No!");
                }
            }
        }
    }
}