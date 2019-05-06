package com.wwh.src;

public class ShellSort {
    public static void sort(int[]arr){
        long start=System.currentTimeMillis();
        int n=arr.length;
        if(n<=1){
            return;
        }
        int step=n/2;
        while (step>=1){
            for(int i=step;i<n;i++){
                int tmp=arr[i];
                int j=i-step;
                for(;j>=0;j-=step){
                    if(arr[j]>tmp){
                        arr[j+step]=arr[j];
                    }else {
                        break;
                    }
                }
                arr[j+step]=tmp;
            }
            step=step/2;
        }
        long end=System.currentTimeMillis();
        System.out.println("希尔排序耗时"+(end-start)+"毫秒");
    }
}
