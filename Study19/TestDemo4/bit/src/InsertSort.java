package TestDemo4.bit.src;

public class InsertSort {
    public static int[] sort(int[]array){
        int j;
        for(int i=1;i<array.length;i++){
            int tmp=array[i];
            j=i;
            while (j>0&&tmp<array[j-1]){
                array[j]=array[j-1];
                j--;
            }
            array[j]=tmp;
        }
        return array;
    }
}
