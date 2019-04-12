package TestDemo.bit.src;

public class StringCompress {
    public static StringBuffer stringCompress(String str) {
        int count = 1;
        int i = 1;
        StringBuffer str3 = new StringBuffer();//利用StringBuffer的append方法进行字符串连接
        char[] arr = str.toCharArray();//将字符串转化为字符数组
        str3.append(arr[i-1]);//将字符串的第一个元素加到新的字符串上。
        for (i=1; i < arr.length ; i++) {
            if(arr[i-1]==arr[i]) {//如果有相等的字符，Count++
                count ++;
                continue;//跳出本次循环，继续查找是否还有相等的元素
            }
            if(count!=1) {
                str3.append(count).append(arr[i]);//将前一个元素的总数以及下一个元素加到新的字符串上。
            }else
                str3.append(arr[i]);
            count=1;//将count初始化为1；
        }
        str3.append(count);//将最后一个值的总数加到字符串的最后面
        return str3;//返回新的字符串。
    }
}

