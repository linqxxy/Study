package com.wwh.src;

import java.util.Arrays;
import java.util.Random;

public class TestSort {
    public static void main(String[] args) {
        int[] arr=new int[100000];
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(100000);
        }
        int[]arr1=Arrays.copyOf(arr,arr.length);
        int[]arr2=Arrays.copyOf(arr,arr.length);
        int[]arr3=Arrays.copyOf(arr,arr.length);
        int[]arr4=Arrays.copyOf(arr,arr.length);
        int[]arr5=Arrays.copyOf(arr,arr.length);
        int[]arr6=Arrays.copyOf(arr,arr.length);
        int[]arr7=Arrays.copyOf(arr,arr.length);
        //BubbleSort.sort(arr1);
        ChoiceSort.sort(arr2);
        HeapSort.sort(arr3);
        InsertSort.sort(arr4);
        MergeSort.sort(arr5);
        QuickSort.sort(arr6);
        ShellSort.sort(arr7);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(arr4));
//        System.out.println(Arrays.toString(arr5));
//        System.out.println(Arrays.toString(arr6));
//        System.out.println(Arrays.toString(arr7));
    }
}
