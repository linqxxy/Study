package TestDemo1.bit.src;

public class QuickSort {
    public static int partion(int[] arr,int low,int high){
        int tmp = arr[low];
        while(low < high) {
            while((low < high) && arr[high] >= tmp){
                high--;
            }
            if(low >= high){
                break;
            }else {
                arr[low] = arr[high];
            }
            while((low < high) && arr[low] <= tmp){
                low++;
            }
            if(low >= high){
                break;
            }else {
                arr[high] = arr[low];
            }

        }
        arr[low] = tmp;
        return low;
    }
    public static void quickSort(int[]arr,int low ,int high){
        int par=partion(arr,low,high);
        if(par>low+1){
            quickSort(arr,low,par-1);
        }
        if (par < high - 1) {
            quickSort(arr, par + 1, high);
        }
    }
    public static void sort(int[] arr){
        long start=System.currentTimeMillis();
        quickSort(arr,0,arr.length-1);
        long end=System.currentTimeMillis();
        System.out.println("快速排序耗时"+(end-start)+"毫秒");
    }
}
