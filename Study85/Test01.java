package com.linqxxy.git;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        System.out.println(add(a,b));
    }

        static int add(int a, int b) {
        if (b == 0){
            return a;
        }
        int sum = a ^ b;
        int ab = (a & b) << 1;
        return add(sum, ab);
    }
}
