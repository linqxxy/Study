package TestDemo4.bit.src;

import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[]arr={9,5,2,7};
        System.out.println((Arrays.toString(InsertSort.sort(arr))));
        System.out.println((Arrays.toString(BubbleSort.sort(arr))));
        System.out.println((Arrays.toString(ChoiceSort.sort(arr))));

    }
}
