package TestDemo1.bit.src;

public class MergeSort {
    public static void sort(int[]arr){
        long start=System.currentTimeMillis();
        mergeSort(arr,0,arr.length-1);
        long end=System.currentTimeMillis();
        System.out.println("归并排序耗时"+(end-start)+"毫秒");
    }
    private static void mergeSort(int[] array,int start,int end){
        if(start==end){
            return;
        }
        int mid=(start+end)/2;
        mergeSort(array,start,mid);
        mergeSort(array,mid+1,end);
        //一个个的有序数列
        merge(array,start,mid,end);
    }
    private static void merge(int[]array,int start,int mid,int end){
        int[]arr=new int[array.length];
        int tmpIndex=start;
        int start2=mid+1;
        int i=start;
        while (start<=mid&&start2<=end){
            if(array[start]<=array[start2]){
                arr[tmpIndex++]=array[start++];
            }else {
                arr[tmpIndex++]=array[start2++];
            }
        }
        while (start<=mid){
            arr[tmpIndex++]=array[start++];
        }
        while (start2<=end){
            arr[tmpIndex++]=array[start2++];
        }
        while (i<=end){
            array[i]=arr[i];
            i++;
        }
    }
}
