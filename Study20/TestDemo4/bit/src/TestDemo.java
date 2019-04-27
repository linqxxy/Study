package TestDemo4.bit.src;

import java.util.Arrays;
import java.util.Random;

public class TestDemo {
    public static void main(String[] args) {
        Random random=new Random();
        int[]arr=new int[1000];
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(10000);
        }
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString((ShellSort.shellSort(arr))));
        //System.out.println((Arrays.toString(InsertSort.sort(arr))));
        //System.out.println((Arrays.toString(BubbleSort.sort(arr))));
        //System.out.println((Arrays.toString(ChoiceSort.sort(arr))));
        //System.out.println(Arrays.toString(heapSort.sort(arr)));
        QuickSort.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
