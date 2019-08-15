package com.linqxxy.git;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 9, 8, 7, 6, 5, 4, 1, 0};
        HeapSort heapSort=new HeapSort();
        heapSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void sort(int[]arr){
        int n=arr.length;
        if (n<=0){
            return;
        }
        for(int i=n-1-1/2;i>=0;i--){
            adjust(arr,i,n-1);
        }
        for (int i=0;i<n;i++){
            int tmp=arr[n-i-1];
            arr[n-i-1]=arr[0];
            arr[0]=tmp;
            adjust(arr,0,n-i-1-1);
        }
    }

    private void adjust(int[] arr, int start, int end) {
        int tmp=arr[start];
        for (int i=2*start+1;i<end;i=i*2+1){
            if (i<end&&arr[i]<arr[i+1]){
                i++;
            }
            if (arr[i]>tmp){
                arr[start]=arr[i];
                start=i;
            }else {
                break;
            }
        }
        arr[start]=tmp;
    }

}
