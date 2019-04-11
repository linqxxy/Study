package TestDemo2.bit.src;

public class TestDemo {
    public int data1=10;//堆
    public  static int data2=20;//方法区
    public  static final int data3=30;//方法区
    public final int data4=40;//堆
    public void fun(){
        int a=10;//栈
        int b=20;//栈
    }
    public static void main(String[] args) {
        String str = "Hello!";//堆内存中的常量池
        String str1 = new String("Hello!");//堆
        String str2="Hello!";//指向常量池中的str
        String str3="He"+"llo!";
        String str4="He";
        String str5=str4+"llo!";
        String str6=str4+new String("llo!");
        String str7=new String("Hello!").intern();
        System.out.println(str2==str7);
        System.out.println(str2==str5);
        System.out.println(str2==str3);
        System.out.println(str1==str6);
        System.out.println(str==str2);
        System.out.println(str==str1);
    }
}
