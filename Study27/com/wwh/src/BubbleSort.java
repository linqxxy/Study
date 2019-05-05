package com.wwh.src;

public class BubbleSort {
    public static void sort(int[]arr){
        long start=System.currentTimeMillis();
        int n=arr.length;
        if(n<=1){
            return;
        }
        for(int i=0;i<n;i++){
            boolean flag=true;
            for(int j=1;j<n;j++){
                if(arr[j]<arr[j-1]){
                    int tmp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                    flag=false;
                }
            }
            if(flag){
                return;
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("插入排序耗时"+ (end-start)+"毫秒");
    }
}
