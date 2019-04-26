package TestDemo4.bit.src;

import java.util.Arrays;

public class BubbleSort {
    public static int[]sort(int[] array){
        for(int i = 1;i<array.length;i++){
            boolean flag=true;
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flag=false;
                }
            }
            if(flag){
                break;
            }
//            System.out.println("第"+i+"轮的输出结果为：");
//            System.out.println(Arrays.toString(array));
        }
        return array;
    }
}
