package com.linqxxy.git;

public class QuickSort {
    public static void sort(int[]arr){
        int n=arr.length;
        if(n<=1){
            return;
        }
        quickSort(arr,0,n-1);
    }
    private static void quickSort(int[]arr,int start,int end){
        int par=partition(arr,start,end);
        if(par>start+1){
            quickSort(arr,start,par-1);
        }
        if(par<end-1){
            quickSort(arr,par+1,end);
        }
    }
    private static int partition(int[]arr,int low,int high){
        int tmp=arr[low];
        while (low<high){
            while ((low<high)&&arr[high]>=tmp){
                high--;
            }
            if(low>=high){
                break;
            }else {
                arr[low]=arr[high];
            }
            while ((low<high)&&arr[low]<=tmp){
                low++;
            }
            if(low>=high){
                break;
            }else {
                arr[high]=arr[low];
            }
        }
        arr[low]=tmp;
        return low;
    }
    public static int find(int arr[],int len,int k){
        QuickSort.sort(arr);
        int i=arr[len-k];
        return i;
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,2,2};
        System.out.println(find(arr,5,3));
    }
}
