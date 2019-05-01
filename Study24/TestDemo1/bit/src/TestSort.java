package TestDemo1.bit.src;

import java.util.Arrays;
import java.util.Random;

public class TestSort {
    public static void main(String[] args) {
        int[] data=new int[100000];
        Random random=new Random();
        for (int i=0;i<data.length;i++){
            data[i]=random.nextInt(50000)+1;
        }
        int[]array1=Arrays.copyOf(data,data.length);
        int[]array2=Arrays.copyOf(data,data.length);
        int[]array3=Arrays.copyOf(data,data.length);
        int[]array4=Arrays.copyOf(data,data.length);
        int[]array5=Arrays.copyOf(data,data.length);
        int[]array6=Arrays.copyOf(data,data.length);
        int[]array7=Arrays.copyOf(data,data.length);
        int[]array8=Arrays.copyOf(data,data.length);
        BubbleSort.sort(array1);
        MergeSort.sort(array2);
        ChoiceSort.sort(array3);
        InsertSort.sort(array4);
        BinaryInsertSort.sort(array5);
        ShellInsertSort.sort(array6);
        HeapSort.sort(array7);
        QuickSort.sort(array8);
//        System.out.println(Arrays.toString(data));
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));
//        System.out.println(Arrays.toString(array4));
//        System.out.println(Arrays.toString(array5));
//        System.out.println(Arrays.toString(array6));
//        System.out.println(Arrays.toString(array7));
//        System.out.println(Arrays.toString(array8));
    }
}
