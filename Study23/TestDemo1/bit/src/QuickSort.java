package TestDemo1.bit.src;

public class QuickSort {
    public static int partion(int[] arr,int low,int high){
        int tmp=arr[low];
        while (low<high){
            while ((low<high)&&arr[high]>=tmp){
                high--;
            }
            if(high<=low){
                break;
            }else {
                arr[low]=arr[high];
                }
            while ((low<high)&&arr[low]<=tmp){
                low++;
            }
            if(high<=low){
                break;
            }else {
                arr[high]=arr[low];
            }
        }
        arr[low]=tmp;
        return low;
    }
    public static void sort(int[] array,int start,int end){
        int par=partion(array,start,end);
        if(par>start+1){
            sort(array,start,par-1);
        }
        if(par<end-1){
            sort(array,par+1,end);
        }
    }
    public static void sort2(int[]arr,int start,int end){
    }
}
