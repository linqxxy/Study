package TestDemo.bit.src;

public class heapSort {
    public static void adjust(int[]arr,int start,int  end){
        int tmp=arr[start];
        for(int i=2*start+1;i<=end;i=2*i+1){
            if((i<end)&&arr[i]<arr[i+1]){
                i++;
            }
            if(arr[i]>tmp){
                arr[start]=arr[i];
                start=i;
            }else if(arr[i]<tmp){
                break;
            }
        }
        arr[start]=tmp;
    }
    public static int[] sort(int[] arr){
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            adjust(arr,i,arr.length-1);
        }
        for(int i=0;i<arr.length-1;i++){
            int tmp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[0];
            arr[0]=tmp;
            adjust(arr,0,arr.length-1-1-i);
        }
        return arr;
    }
}
