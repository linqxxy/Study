package TestDemo2.bit.src;

import java.util.Arrays;
import java.util.List;

public class ReverseSentence {
    public  static String reverseSentense(String str){
        String[] arr=str.split(" ");
        StringBuffer str2=new StringBuffer();
        for(int i=arr.length-1;i>=0;i--){
                str2.append(arr[i]);
        }
        return str2.toString();
    }
}
