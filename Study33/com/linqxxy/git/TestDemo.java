package com.linqxxy.git;
//上限
// 类 T extends ClassType
//类型参数 ？ extends ClassType
//下限
//方法参数 ？extends super ClassType
//可以修改
public class TestDemo {
    public static void main(String[] args) {
        Message<Integer> message=new Message<>(10);
        message.print(message);
        Message<Number> message1=new Message<>(1.00);
        message1.print(message);//上限
        Message<Number> message2=new Message<>(10);
        message2.print2(message2);//下限
    }
}
