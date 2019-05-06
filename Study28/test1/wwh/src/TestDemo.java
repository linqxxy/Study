package test1.wwh.src;
//静态导入，如果当前类中有和静态导入的方法重名，采用就近原则。
import test1.wwh.src.util.Message;
import test1.wwh.src.util.Point;
import test1.wwh.src.util.Point2;
import test1.wwh.src.util.Point3;

//import static test1.wwh.src.util.MyMath.*;

public class TestDemo {
    public static void main(String[] args) {
//        System.out.println(Add.add(new int[]{1,2,3,4}));
//        System.out.println(Add.sum(1,2,3,4,5));
//        System.out.println(sum(2,3));
//        System.out.println(sub(3,1));
//        System.out.println(div(2,1));
//        System.out.println(su(3,4));
        Point<Integer> point1=new Point<>();
        point1.setX(1);
        point1.setY(2);
        //System.out.println(point1.toString());
        Point<String> point2=new Point<>();
        point2.setX("北纬38");
        point2.setY("东经120");
        //System.out.println(point2.toString());
        Point2<Integer,String> point21=new Point2<>();
        point21.setX(10);
        point21.setY("东经120");
        //System.out.println(point21.toString());
        Point3 point3=new Point3();
        point3.printPoint(point2,point21);
        Point3<Integer> point31=new Point3<>();
        point31.printPoint("Hello World!");
        Message<Integer>message=new Message<>();
        message.setMessage(666);
        func(message);
    }
    //func方法接收的Message对象类型参数为任意类型。
    public static void func(Message<?> message){
        System.out.println(message.getMessage());
    }
}
