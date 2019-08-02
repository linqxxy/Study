package com.linqxxy.test;

import java.util.Scanner;


public class Test11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] c = new int[8];
        c[2] = 1;
        c[3] = 2;
        for (int i = 4; i < c.length; i++) {
            c[i] = (i - 1) * (c[i - 1] + c[i - 2]);
        }
        while (in.hasNext()) {
            int n = in.nextInt();
            if(n<7){
                int mul = 1;
                for (int i = 1; i <= n; i++) {
                    mul *= i;
                }
                System.out.printf("%2.2f", (double) c[n] / mul * 100);
                System.out.print("%\n");
            }else {
                int mul = 1;
                for (int i = 1; i <= 7; i++) {
                    mul *= i;
                }
                System.out.printf("%2.2f", (double) c[7] / mul * 100);
                System.out.print("%\n");
            }
        }
    }
}
