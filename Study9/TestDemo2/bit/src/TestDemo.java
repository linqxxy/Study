package TestDemo2.bit.src;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Arrays;

public class TestDemo {
    public static void bubbleSort(int[]arr){
        boolean swap=false;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swap=true;
                }
            }
            if(!swap){
                return;
            }
        }
    }
    public static void main(String[] args){
        int[]array={9,5,2,7,421,31,321,56,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
