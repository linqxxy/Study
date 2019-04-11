package TestDemo3.bit.src;

import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        char[] value={'a','b','c','d'};
        String str =new String(value);
        String str2=new String(value,1,3);
        System.out.println(str2);
        String str3="abcde";
        char ch=str3.charAt(3);//取得指定下标的值（默认从0号位置开始找）
        System.out.println(ch);
        char[] chars=str3.toCharArray();//将字符串转换为字符数组
        System.out.println(Arrays.toString(chars));
        String str4="dahda";
        System.out.println(isNumber(str4));
        byte[] bytes={97,98,99,100};
        String s=new String(bytes,1,3);
        System.out.println(s);
        byte[] bytes1=s.getBytes();
        System.out.println(Arrays.toString(bytes1));
        String str5="HELLO";
        String str6="Hello";
        System.out.println(str5.equals(str6));
        System.out.println(str5.equalsIgnoreCase(str6));
        System.out.println(str5.compareTo(str6));//字符串比较，找到第一个不相同的字符，进行比较
        //如果长度不一样，先结束的字符串小。
        System.out.println(str6.contains("lo"));//查找字符串中是否存在另一个字符串返回Boolea类型
        System.out.println(str6.indexOf("lle",2));//从默认位置查找是否存在另一个字符串返回第一个匹配的下标
        //找不到返回-1
        System.out.println(str6.lastIndexOf("llo",3));//从后向前找
        System.out.println(str5.startsWith("H"));//判断字符串是否以指定参数开始
        System.out.println(str5.endsWith("LO"));//判断字符串是否以指定参数结束
        System.out.println(str5.replace(str6,str5));
    }
    public  static Boolean isNumber(String str4){
        char[] arr=str4.toCharArray();
        for(int i=0;i<arr.length;i++){
            if('0'<=arr[i]&&arr[i]<='9'){
               return false;
            }
        }
        return true;
    }
}
