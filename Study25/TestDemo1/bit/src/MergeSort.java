package TestDemo1.bit.src;

public class MergeSort {
    public static void sort(int[]arr){
        int n=arr.length;
        if(n<=1){
            return;
        }
        mergeSort(arr,0,n-1);
    }
    private static void mergeSort(int[]arr,int start,int end){
        if(start==end){
            return;
        }
        int mid=(start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    private static void merge(int[]arr,int start,int mid,int end){
        int[]tmpArray=new int[arr.length];
        int tmpIndex=start;
        int i=start;
        int start2=mid+1;
        while (start<=mid&&start2<=end){
            if(arr[start]<=arr[start2]){
                tmpArray[tmpIndex++]=arr[start++];
            }else {
                tmpArray[tmpIndex++]=arr[start2++];
            }
        }
        while (start<=mid){
            tmpArray[tmpIndex++]=arr[start++];
        }
        while (start2<=end){
            tmpArray[tmpIndex++]=arr[start2++];
        }
        while (i<=end){
            arr[i]=tmpArray[i];
            i++;
        }
    }
}
