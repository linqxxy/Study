package top.linqxxy.www;

import java.lang.reflect.Field;

//泛型类在使用时（运行）和普通类没有区别
//验证.运行时T的真正类型
/* 类型参数：泛型信息是编译阶段的内容，编译时会类型擦除，JVM运行时泛型类和普通类没有区别
类型擦除的原则：T 变成Object类型，有上限变为上限类型。
 */
public class TestDemo {
    public static void main(String[] args) {
        IMessage<String> iMessage=new MessageImpl();
        iMessage.print("dsa");
        MyMessage<Integer> myMessage=new MyMessage<>();
        myMessage.print(1);
        MyMessage myMessage1=new MyMessage();
        myMessage1.print(1);
        Field[] fields=iMessage.getClass().getDeclaredFields();
        for (Field field:fields
             ) {
            System.out.println(field.getName()+"  "+field.getType());
        }
    }
}
