package TestDemo1.bit.src;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            boolean flag=true;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=false;
                }
            }
            if (flag){
                break;
            }
            System.out.print("第"+i+"趟排序为:");
            disPlay(array);
        }
        return array;
    }
    public static void disPlay(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array={3,2,5,6,9,8,1,7,0,4};
        BubbleSort.bubbleSort(array);
        System.out.println(Arrays.toString(array));
        }
}
