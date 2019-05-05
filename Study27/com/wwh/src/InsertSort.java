package com.wwh.src;

public class InsertSort {
    public static void sort(int[]arr){
        long start=System.currentTimeMillis();
        int n=arr.length;
        if(n<=1){
            return;
        }
        for(int i=1;i<n;i++){
            int tmp=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>tmp){
                    arr[j+1]=arr[j];
                }else {
                    break;
                }
            }
            arr[j+1]=tmp;
        }
        long end=System.currentTimeMillis();
        System.out.println("插入排序耗时"+ (end-start)+"毫秒");
    }
}
