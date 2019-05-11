package top.linqxxy.wwh3;

public class TestDemo {
    public static void main(String[] args) {
        IMessage iMessage=new QQMessage();
        iMessage.print();
        IMessage iMessage1=new WeChat();
        iMessage1.print();
        IMessage.printinfo();
        System.out.println(iMessage1.display());
    }
}
