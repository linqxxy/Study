package com.wwh.src;

public class QuickSort {
    private static int partition(int[]arr,int left,int right){
        int tmp=arr[left];
        while (left<right){
            while (left<right&&arr[right]>tmp){
                right--;
            }
            if(left>right){
                break;
            }else {
                arr[left]=arr[right];
            }
            while (left<right&&arr[left]<tmp){
                left++;
            }
            if(left>right){
                break;
            }else {
                arr[right]=arr[left];
            }
        }
        arr[left]=tmp;
        return left;
    }
    private static void quickSort(int[] arr,int left,int right){
        int par=partition(arr,0,arr.length-1);
        if(par>left+1){
            quickSort(arr,left,par-1);
        }
        if(par<right-1){
            quickSort(arr,par+1,right);
        }
    }
    public static void sort(int[]arr){
        int n=arr.length;
        if(n<=1){
            return;
        }
        quickSort(arr,0,n-1);
    }
}
