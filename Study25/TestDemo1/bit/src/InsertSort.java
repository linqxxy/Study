package TestDemo1.bit.src;

public class InsertSort {
    public static void sort(int[] arr){
        int n=arr.length;
        if(n<=1){
            return;
        }
        for(int i=1;i<arr.length;i++){
            int tmp=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>tmp){
                    arr[j+1]=arr[j];
                }else {
                    break;
                }
            }
            arr[j+1]=tmp;
        }
    }
}
