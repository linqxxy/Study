package com.linqxxy.test;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        long[] arr1 = new long[sum+1];
        arr1[0] = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            for (int j = sum; j >= 0; j--) {
                if (j >= arr[i]) {
                    arr1[j] += arr1[j - arr[i]];
                }
            }
        }
        System.out.println(arr1[sum]);
    }
}
