package TestDemo1.bit.src;

public class BinaryInsertSort {
    public static void sort(int[] arr) {
        long start = System.currentTimeMillis();
        int n = arr.length;
        if (n <= 1) {
            return;
        } else {
            for (int i = 1; i < n; i++) {
                int low=0;
                int high=i-1;
                int val = arr[i];
                int j = i - 1;
                while (low<=high){
                    int mid=(low+high)/2;
                    if(arr[mid]<val){
                        low=mid+1;
                    }else {
                        high=mid-1;
                    }
                }
                for (; j > high; j--) {
                        arr[j + 1] = arr[j];
                }
                arr[j + 1] = val;
            }
            long end = System.currentTimeMillis();
            System.out.println("二分插入排序耗时" + (end - start) + "毫秒");
        }
    }
}
