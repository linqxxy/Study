package TestDemo1.bit.src;

public class BubbleSort {
    public static void sort(int[]arr){
        long start =System.currentTimeMillis();
        int n=arr.length;
        if(n<=1){
            return;
        }
        for(int i=0;i<n-1;i++){
            boolean flag=true;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int tmp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=tmp;
                    flag=false;
                }
            }
            if(flag){
                return;
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("冒泡排序耗时"+(end-start)+"毫秒");
    }
}
