package top.linqxxy.www;

public class MyMessage<T>implements IMessage<T>{

    @Override
    public void print(T t) {
        System.out.println(t);
    }
}
