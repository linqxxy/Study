package top.linqxxy.wwh3;

public interface IMessage {
    void print();
    default String display(){
        return "未知";
    }
    static void printinfo(){
        System.out.println("静态方法");
    }
}
