package TestDemo4.bit.src;

import java.util.Arrays;

public class QuickSort {
    public static int sort(int[]array,int low,int high){
        if(low==high){
            return array[low];
        }
        if(low>high){
            return 0;
        }
        int tmp=array[low];
        while (low<high){
            while ((low<high)&&array[high]>=tmp){
                high--;
            }
            if(low>=high){
                break;
            }else if(array[high]<tmp){
                array[low]=array[high];
            }
            while ((low<high)&&array[low]<tmp){
                low++;
            }
            if(low>=high){
                break;
            }else if(array[high]<tmp){
                array[high]=array[low];
            }
        }
        array[low]=tmp;
        return low;
    }
    public static void insert(int[]array,int start,int end){
        int j;
        for(int i=start;i<end;i++){
            j=i;
            int tmp=array[i];
            while (j>0&&tmp<array[j-1]){
                array[j]=array[j-1];
                j--;
            }
            array[j]=tmp;
        }
    }
    public static void quickSort(int[]array,int start,int end){
        long Start= System.currentTimeMillis();
        if((end-start+1)<=16){
            insert(array,start,end);
        }
            int par = sort(array, start, end);
            if (par > start + 1) {
                quickSort(array, start, par - 1);
            }
            if (par < end - 1) {
                quickSort(array, par + 1, end);
        }
        long End= System.currentTimeMillis();
        System.out.println(end-start);
    }
}
