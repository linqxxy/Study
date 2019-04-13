package TestDemo1.bit.src;
import java.lang.*;
import java.math.*;
import java.util.*;
import java.awt.*;

public class TestDemo {
    public static void main(String[] args) {
        //装箱（装包）—》把简单类型包装为类
        Integer a1=new Integer(10);//显示装箱
        System.out.println(a1);
        Integer a2=20;//自动装箱
        System.out.println(a2);
        //拆箱（拆包）-》把包转换类拆分成对应的简单类型
        double a3=a2.doubleValue();//显示拆箱
        System.out.println(a3);
        double a4=a1;//拆箱-》隐式拆箱（自动拆箱）
        System.out.println(a4);
        String string="1234";
        String string1="true";
        int a=Integer.parseInt(string);//字符串转数字（int型）
        System.out.println(a);
        boolean b=Boolean.parseBoolean(string1);
        System.out.println(b);
        String string2=String.valueOf("Hello");
        System.out.println(string2);
    }
}
