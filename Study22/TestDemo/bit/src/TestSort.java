package TestDemo.bit.src;

import java.util.Arrays;
import java.util.Random;

public class TestSort {
    public static void main(String[] args) {
        int[]arr=new int[10];
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(10)+1;
        }
        //System.out.println(QuickSort.midOfThree(arr,0,arr.length-1));
        System.out.println(Arrays.toString(arr));
//        QuickSort.sort(arr);
        mergeSort.mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(heapSort.sort(arr)));
    }
}
