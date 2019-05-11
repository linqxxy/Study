package top.linqxxy.wwh3;

public class QQMessage implements IMessage {
    @Override
    public void print() {
        System.out.println("QQ消息");
    }
}
class WeChat implements IMessage{

    @Override
    public void print() {
        System.out.println("微信消息");
    }
}
