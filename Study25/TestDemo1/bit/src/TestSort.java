package TestDemo1.bit.src;

import java.util.Arrays;
import java.util.Random;

public class TestSort {
    public static void main(String[] args) {
        Random random=new Random();
        int[] array=new int [10];
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(10)+1;
        }
        int[]array1=Arrays.copyOf(array,array.length);
        int[]array2=Arrays.copyOf(array,array.length);
        int[]array3=Arrays.copyOf(array,array.length);
        int[]array4=Arrays.copyOf(array,array.length);
        int[]array5=Arrays.copyOf(array,array.length);
        int[]array6=Arrays.copyOf(array,array.length);
        int[]array7=Arrays.copyOf(array,array.length);
        int[]array8=Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(array));
        BubbleSort.sort(array1);
        ChoiceSort.sort(array2);
        HeapSort.sort(array3);
        InsertSort.sort(array4);
        MergeSort.sort(array5);
        QuickSort.sort(array6);
        ShellSort.sort(array7);
        BinarySort.sort(array8);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array5));
        System.out.println(Arrays.toString(array6));
        System.out.println(Arrays.toString(array7));
        System.out.println(Arrays.toString(array8));
    }
}
