package com.linqxxy.git;

import java.util.Scanner;

public class Test02 {

    public static int countWays(int x, int y) {
        int num = 0;
        if (x == 1 && y == 1) {
            return 1;
        }
        if (x > 1) {
            num += countWays(x - 1, y);
        }
        if (y > 1) {
            num += countWays(x, y - 1);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int num = countWays(a, b);
        System.out.println(num);
    }
}
