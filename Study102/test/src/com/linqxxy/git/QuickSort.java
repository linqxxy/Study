package com.linqxxy.git;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 9, 8, 7, 6, 5, 4, 1, 0};
        QuickSort quickSort=new QuickSort();
        quickSort.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public void sort(int[]arr , int start, int end){
        if (start>=end){
            return;
        }
        int par=partation(arr,start,end);
        if (par>start+1){
            sort(arr,start,par-1);
        }
        if (par<end-1){
            sort(arr,par+1,end);
        }
    }
    public int partation(int[] arr,int start,int end){
        int tmp=arr[start];
        while (start<end){
            while (start<end&&arr[end]>=tmp){
                end--;
            }
            if (start>=end){
                break;
            }else {
                arr[start]=arr[end];
            }
            while (start<end&&arr[start]<=tmp){
                start++;
            }
            if (start>=end){
                break;
            }else {
                arr[end]=arr[start];
            }
        }
        arr[start]=tmp;
        return start;
    }
}
