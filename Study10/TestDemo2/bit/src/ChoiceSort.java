package TestDemo2.bit.src;

import java.util.Arrays;

public class ChoiceSort {
    public static int[] choiceSort(int[]array){
        for(int i=0;i<array.length-1;i++){
            int min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            if (min!=i){
                int temp=array[i];
                array[i]=array[min];
                array[min]=temp;
            }
            System.out.println("第"+i+"次排序的结果是"+Arrays.toString(array));
        }
        return array;
    }

    public static void main(String[] args) {
        int[]array={1,2,6,8,0,9,4,3,5,7};
        choiceSort(array);
        System.out.println("排序的结果为"+Arrays.toString(array));
    }
}
