package TestDemo.bit.src;

import java.util.Arrays;

public class mergeSort {
    public static void mergeSort(int[] array,int start,int end){
        if(start==end){
            return;
        }
        int mid=(start+end)/2;
        mergeSort(array,start,mid);
        mergeSort(array,mid+1,end);
        //一个个的有序数列
        merge(array,start,mid,end);
    }
    public static void merge(int[]array,int start,int mid,int end){
    int[]arr=new int[array.length];
    int tmpIndex=start;
    int i=start;;
    int start2=mid+1;
    while (start<=mid&&start2<=end){
        if(array[start]<array[start2]){
            arr[tmpIndex++]=array[start++];
        }else {
            arr[tmpIndex++]=array[start2++];
        }
    }
    while (start<mid){
        arr[tmpIndex++]=arr[start++];
    }
    while (start2<end){
        arr[tmpIndex++]=arr[start2++];
    }
    while (i<=end){
        array[i]=arr[i];
        i++;
    }
    }
}
