package com.linqxxy.git;


import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        count(str.toCharArray());
    }
    public static void count(char [] arr){
        int[] arr1=new int[255];
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]++;
        }
//        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            if (arr1[i]!=0){
                System.out.print((i-48)+":"+arr1[i]+"<br/>");
            }
        }
    }
}
