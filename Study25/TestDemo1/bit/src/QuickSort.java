package TestDemo1.bit.src;

public class QuickSort {
    public static void sort(int[]arr){
        int n=arr.length;
        if(n<=1){
            return;
        }
        quickSort(arr,0,n-1);
    }
    private static void quickSort(int[]arr,int start,int end){
//        if(start>=end){
//            return;
//        }
        int par=partition(arr,start,end);
        if(par>start+1){
            quickSort(arr,start,par-1);
        }
        if(par<end-1){
            quickSort(arr,par+1,end);
        }
    }
    private static int partition(int[]arr,int low,int high){
        int tmp=arr[low];
        while (low<high){
            while ((low<high)&&arr[high]>=tmp){
                high--;
            }
            if(low>=high){
                break;
            }else {
                arr[low]=arr[high];
            }
            while ((low<high)&&arr[low]<=tmp){
                low++;
            }
            if(low>=high){
                break;
            }else {
                arr[high]=arr[low];
            }
        }
        arr[low]=tmp;
        return low;
    }
}
