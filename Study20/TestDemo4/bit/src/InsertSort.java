package TestDemo4.bit.src;

import java.util.Arrays;

public class InsertSort {
    public static int[] sort(int[]array){
        long start=System.currentTimeMillis();
        int j;
        for(int i=1;i<array.length;i++){
            j=i;
            int tmp=array[i];
            while (j>0&&tmp<array[j-1]){
                array[j]=array[j-1];
                j--;
            }
            array[j]=tmp;
            System.out.print("第"+i+"趟排序结果为:");
            System.out.println(Arrays.toString(array));
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        return array;
    }
}
