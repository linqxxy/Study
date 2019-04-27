package TestDemo4.bit.src;

import java.util.Arrays;

public class ShellSort {

    public static int[] shellSort(int[] array){
        long start=System.currentTimeMillis();
        int j,tmp;
        int count=0;
        int gap=array.length;
        do{
             count++;
            gap=gap/2;
            for(int i=gap;i<array.length;i++){
                if(array[i]<array[i-gap]){
                    tmp=array[i];
                    for(j=i-gap;j>=0&&array[j]>tmp;j-=gap){
                        array[j+gap]=array[j];
                    }
                    array[j+gap]=tmp;
                }
            }
            System.out.print("第"+count+"次排序的结果为；" );
            System.out.println(Arrays.toString(array));
        }while (gap!=1);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
         return  array;
    }
}
