package com.wwh.src;

public class MergeSort {
    public static void sort(int[]arr){
        long start=System.currentTimeMillis();
        int n=arr.length;
        if(n<=1){
            return;
        }
        mergeSort(arr,0,n-1);
        long end=System.currentTimeMillis();
        System.out.println("归并排序耗时"+(end-start)+"毫秒");
    }
    private static void mergeSort(int[]arr,int left,int right){
        if(left==right){
            return;
        }
        int mid=(left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    private static void merge(int[]arr,int left,int mid,int right){
        int[]tmpArray=new int[arr.length];
        int left2=mid+1;
        int i=left;
        int tmpIndex=left;
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
}
