package TestDemo1.bit.src;

public class CountNum {
    public static int countNum(String str){
        int count=0;
        char[]arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if ('0'<=arr[i]&&arr[i]<='9') {
                count++;
            }
            }
            return count;
        }
}
