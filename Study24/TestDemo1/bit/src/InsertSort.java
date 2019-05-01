package TestDemo1.bit.src;

public class InsertSort {
    public static void sort(int[]arr){
        long start=System.currentTimeMillis();
        int n=arr.length;
        if(n<=1){
            return;
        }
        for(int i=0;i<n;i++){
            int val=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>val){
                    arr[j+1]=arr[j];
                }else {
                    break;
                }
            }
            arr[j+1]=val;
        }
        long end=System.currentTimeMillis();
        System.out.println("直接插入排序耗时："+(end-start)+"毫秒");
    }
}
