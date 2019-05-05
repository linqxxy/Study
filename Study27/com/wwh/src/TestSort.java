package com.wwh.src;

import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {
        int[]arr={9,5,2,7};
        //BubbleSort.sort(arr);
        //ChoiceSort.sort(arr);
        //InsertSort.sort(arr);
        //HeapSort.sort(arr);
        //MergeSort.sort(arr);
        //QuickSort.sort(arr);
        ShellSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
