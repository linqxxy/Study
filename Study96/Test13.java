package com.linqxxy.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            BigDecimal[] arr=new BigDecimal[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextBigDecimal();
            }
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
        }

    }
}
