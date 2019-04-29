package TestDemo.bit.src;

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
    public static void swap(int[]array,int start,int end){
        int tmp=array[start];
        array[start]=array[end];
        array[end]=tmp;
    }

    public static int midOfThree(int[]arr,int low,int high){
        int mid=(low+high)>>>1;
        if(arr[mid]>arr[high]){
            swap(arr,mid,high);
        }
        if(arr[mid]>arr[low]){
            swap(arr,mid,low);
        }
        if(arr[low]>arr[high]){
            swap(arr,low,high);
        }
        return arr[mid];
    }

    public static void Sort(int[] arr,int start,int end){
        int par = partion(arr,start,end);
        //找左边是否有两个数据以上
        if(par > start+1){
            Sort(arr,start,par-1);
        }
        //右边是否有两个数据以上
        if(par < end-1){
            Sort(arr,par+1,end);
        }
    }
    public static void sort(int[] arr){
        int[] stack=new int[arr.length*2];
        int top=0;
        int low=0;
        int high=arr.length-1;
        int par=partion(arr,low,high);
        if(par>low+1){
            stack[top++]=low;
            stack[top++]=par-1;
        }
        if(par<high-1){
            stack[top++]=par+1;
            stack[top++]=low;
        }
        while (top!=0){
            high=stack[--top];
            low=stack[--top];
            partion(arr,low,high);

        }
    }
}
