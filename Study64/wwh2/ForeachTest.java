package com.linqxxy.git.wwh2;

public class ForeachTest {
    public static void main(String[] args) {
        int[]arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        for (int i:arr
             ) {
            System.out.print(i);
        }
    }
}
