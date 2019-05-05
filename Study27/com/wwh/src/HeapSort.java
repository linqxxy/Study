package com.wwh.src;

public class HeapSort {
    private static void adjust(int[]arr,int start,int end){
        int tmp=arr[start];
        for(int i=2*start+1;i<=end;i=2*i+1){
            if(arr[i]<end&&arr[i]<arr[i+1]){
                i++;
            }
            if(arr[i]>tmp){
                arr[start]=arr[i];
                start=i;
            }else {
                break;
            }
        }
        arr[start]=tmp;
    }
    public static void sort(int[]arr){
        int n=arr.length;
        if(n<=1){
            return;
        }
        for(int i=(n-1-1)/2;i>=0;i--){
            adjust(arr,i,n-1);
        }
        for(int i=0;i<n-1;i++){
            int tmp=arr[n-1-i];
            arr[n-1-i]=arr[0];
            arr[0]=tmp;
            adjust(arr,0,n-1-i-1);
        }
    }
}
