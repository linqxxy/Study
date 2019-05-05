package com.wwh.src;

public class MergeSort {
    private static void mergeSort(int[]arr, int left, int right){
        if(left==right){
            return;
        }
        int mid=(left+right)/2;
        mergeSort(arr,0,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    private static void merge(int[]arr,int left,int mid,int right){
        int[]tmpArray=new int[arr.length];
        int left2=mid+1;
        int tmpIndex=left;
        int i=left;
        while (left<=mid&&left2<=right){
            if(arr[left]<arr[left2]){
                tmpArray[tmpIndex++]=arr[left++];
            }else {
                tmpArray[tmpIndex++]=arr[left2++];
            }
        }
        while (left<=mid){
            tmpArray[tmpIndex++]=arr[left++];
        }
        while (left2<=right){
            tmpArray[tmpIndex++]=arr[left2++];
        }
        while (i<=right){
            arr[i]=tmpArray[i];
            i++;
        }
    }
    public static void sort(int[] arr){
        int n=arr.length;
        if(n<=1){
            return;
        }
        mergeSort(arr,0,n-1);
    }
}
