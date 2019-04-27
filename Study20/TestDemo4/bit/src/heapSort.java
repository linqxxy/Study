package TestDemo4.bit.src;

public class heapSort {
    //一次调整的时间复杂度为
    public static void adjust(int[]array,int start,int end){
        int tmp=array[start];
        for(int i=2*start+1;i<=end;i=i*2+1){
            if((i<end)&&(array[i]<array[i+1])){
                i++;
            }
            if(array[i]>tmp){
                array[start]=array[i];
                start=i;
            }else if(array[i]<tmp){
                array[start]=tmp;
                break;
            }
        }
        array[start]=tmp;
    }
    public static int[] sort(int[] array){
        for(int i=(array.length-1-1)/2;i>=1;i--){
        adjust(array,i,array.length-1);
        }
        for(int i=0;i<array.length-1;i++){
            int tmp=array[array.length-1-i];
            array[array.length-1-i]=array[0];
            array[0]=tmp;
            adjust(array,0,array.length-1-i-1);
        }
        return array;
    }
}

