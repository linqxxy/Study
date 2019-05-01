package TestDemo1.bit.src;

public class ChoiceSort {
    public static void sort(int[]arr){
        long start=System.currentTimeMillis();
        int n=arr.length;
        if(n<=1){
            return;
        }else {
            for(int i=0;i<n-1;i++){
                int minIndex=i;
                for (int j=i+1;j<n;j++){
                    if(arr[j]<arr[minIndex]){
                        minIndex=j;
                    }
                }
                int tmp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=tmp;
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("选择排序耗时："+(end-start)+"毫秒");
    }
}
