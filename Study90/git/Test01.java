package com.linqxxy.git;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(fib(scanner.nextInt()));
        }
    }
    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
