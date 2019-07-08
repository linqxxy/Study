package com.inqxxy.git;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        System.out.println(num(x,y));
    }
    public static int num(int x,int y){
        for(int i=(x>y?x:y);i<=x*y;i++){
            if(i%x==0&&i%y==0){
                return i;
            }
        }
        return x*y;
    }
}
