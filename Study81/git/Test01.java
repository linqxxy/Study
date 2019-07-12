package com.linqxxy.git;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int first = 0;
        int second = 1;
        if(n == 1) {
            System.out.println("0");
            return;
        }
        while(true){
            int temp = first;
            first = second;
            second = temp + second;
            if(n > first && n <= second){
                int step = Math.min(n-first,second - n);
                System.out.println(step);
                return;
            }
        }
    }
}