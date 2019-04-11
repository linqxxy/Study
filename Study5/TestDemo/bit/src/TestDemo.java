package TestDemo.bit.src;

public class TestDemo {
    public static void main(String[] args) {
        String str="Hello";
        str+="bit";//优化为StringBuilder.append，调用toString（）return new String "Hello bit"
        str+="world";
        String str1=new String("Hello");
        String str3=null;//需要初始化，否则会空指针异常
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("ab");//append 返回当前对象的引用。
        System.out.println(stringBuffer);
        stringBuffer.append("cd");
        stringBuffer.append("ef");
        System.out.println(stringBuffer);//不会产生垃圾空间
        System.out.println(str.equals(str1));
        System.out.println("=======================================");
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("ab");//append 返回当前对象的引用。
        System.out.println(stringBuffer);
        stringBuilder.append("cd");
        stringBuilder.append("ef");
        System.out.println(stringBuilder);//不会产生垃圾空间
    }//String
    // StringBuffer StringBuilder操作字符串的两个类
    //1、StringBuffer synchronized(线程安全关键字)在多线程的时候使用
    //String StringBuilder 单线程使用，多线程不安全。
    //2、//String的每次变更都会产生一个新的对象
    //StringBuffer和StringBuilder的append 方法不会产生新的对象，放回值是this
    //3、String在进行拼接的时候，底层会自动的优化为StringBuilder的append方法，最后调用toString()
    //返回new String
}
