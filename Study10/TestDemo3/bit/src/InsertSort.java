package TestDemo3.bit.src;

import java.util.Arrays;

public class InsertSort {
    public static int[] insertSort(int[] array){
        int j;
        for (int i=1;i<array.length;i++){
         int temp=array[i];
         j=i;
         while (j>0&&temp<array[j-1]){
             array[j]=array[j-1];
             j--;
         }
         array[j]=temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[]array={3,5,7,9,0,1,2,4,6,8};
        insertSort(array);
        System.out.println("排序的结果为"+ Arrays.toString(array));
    }
}
