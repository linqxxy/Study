package TestDemo1.bit.src;

public class ShellSort {
    public static void sort(int[]arr){
        int n=arr.length;
        if(n<=1){
            return;
        }else {
            int step = n / 2;
            while (step >= 1) {
                for (int i = step; i < n; i++) {
                    int tmp = arr[i];
                    int j = i - step;
                    for (; j >= 0; j -= step) {
                        if (arr[j] > tmp) {
                            arr[j + step] = arr[j];
                        } else {
                            break;
                        }
                    }
                    arr[j + step] = tmp;
                }
                step = step / 2;
            }
        }
    }
}
