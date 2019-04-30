package TestDemo1.bit.src;

import java.util.Arrays;
import java.util.Random;

public class TestMySort {
    public static void main(String[] args) {
        int[]arr=new int[10];
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(10)+1;
        }
        System.out.println(Arrays.toString(arr));
        //MergeSort.sort(arr,0,arr.length-1);
        QuickSort.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
