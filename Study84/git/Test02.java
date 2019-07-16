package com.linqxxy.git;
import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {
        int[] arr = new int[11];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        if (arr[0] == 0) {
            for (int i = 1; i < 10; i++) {
                int s = arr[i];
                for (int j = 0; j < s; j++) {
                    System.out.print(i);
                }
            }
        } else {
            for (int i = 1; i < 10; i++) {
                if (arr[i] != 0) {
                    System.out.print(i);
                    arr[i] = arr[i] - 1;
                    break;
                }
            }
            for (int i = 0; i < arr[0]; i++) {
                System.out.print("0");
            }
            for (int i = 1; i < 10; i++) {
                int sd = arr[i];
                for (int j = 0; j < sd; j++) {
                    System.out.print(i);
                }
            }
        }
        sc.close();
    }
}