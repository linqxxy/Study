package TestDemo1.bit.src;

public class ShellInsertSort {
    public static void sort(int[]arr){
        long start=System.currentTimeMillis();
        int n=arr.length;
        if(n<=0){
            return;
        }else {
            int step=n/2;
            while (step>=1){
                for(int i=step;i<n;i++){
                    int val=arr[i];
                    int j=i-step;
                    for(;j>=0;j-=step){
                        if(arr[j]>val){
                            arr[j+step]=arr[j];
                        }else {
                            break;
                        }
                    }
                    arr[j+step]=val;
                }
                step=step/2;
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("希尔排序耗时："+(end-start)+"毫秒");
    }
}
