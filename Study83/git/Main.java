package com.linqxxy.git;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String c = in.next();
        int row = n / 2;
        if (n % 2 != 0) {
            row = n / 2 + 1;
        }
        if(row==2){
            for(int i=0;i<n;i++){
                System.out.print(c);
            }
            System.out.println();
            for(int i=0;i<n;i++){
                System.out.print(c);
            }
        }else{
            for (int i=0;i<n;i++){
                System.out.print(c);
            }
            System.out.println();
            for (int i = 0; i < row-2; i++) {
                System.out.print(c);
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print(c);
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                System.out.print(c);
            }
        }
    }
}

