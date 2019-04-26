package TestDemo4.bit.src;

import java.util.Arrays;

public class ChoiceSort {
    public static int[] sort(int[]array){
        for(int i=0;i<array.length-1;i++){
            int min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]) {
                    min = j;
                }
            }
            if(i!=min){
                int tmp=array[i];
                array[i]=array[min];
                array[min]=tmp;
            }
//            System.out.println("第"+i+"轮的排序结果为");
//            System.out.println(Arrays.toString(array));
        }
        return array;
    }
}
