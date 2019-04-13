package TestDemo3.bit.src;
import java.util.Scanner;
//如果一个方法声明Exception异常，在调用处必须要进行捕捉
//如果一个方法声明了一场，在方法体内不需要进行捕捉，（try catch）；
class Simple{
    public Simple(){
        System.out.println("   ");
    }
}
public class TestDemo {
    //程序一旦发生异常，将不会继续进行
    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println("1、开始计算");
            System.out.println("2、进行计算X/Y=" + x / y);
        }catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("发生算术异常");
        }finally {
            System.out.println("finally执行");//永远都会被执行（用来关闭资源）
        };
        System.out.println("3、计算结束");
    }
    public static void func(int a){
        if(a==10){
            throw  new UnsupportedOperationException("a==10");
        }
    }
   public void func(){
       System.out.println("func()");
   }

    public static void main(String[] args) {
        String str=null;
        try{
           int len=str.length();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally {
            System.out.println("字符串为空");
        }
    }
}
