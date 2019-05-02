package TestDemo1.bit.src;

public class ChoiceSort {
    public static void sort(int[]arr){
        long start=System.currentTimeMillis();
        int n=arr.length;
        if(n<=1){
            return;
        }
        int min=0;
        for(int i=0;i<arr.length;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                int tmp=arr[min];
                arr[min]=arr[i];
                arr[i]=tmp;
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("选择排序耗时"+(end-start)+"毫秒");
    }
}
