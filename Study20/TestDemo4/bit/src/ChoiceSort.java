package TestDemo4.bit.src;

import java.util.Arrays;

public class ChoiceSort {
    public static int[] sort(int[]array){
        long start=System.currentTimeMillis();
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[i]){
                    int tmp=array[j];
                    array[j]=array[i];
                    array[i]=tmp;
                }
            }
            System.out.print("第"+i+"轮的排序结果为");
            System.out.println(Arrays.toString(array));
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        return array;
    }
}
