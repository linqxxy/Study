package top.linqxxy.wwh4;

public interface IMessage {
    void print();

    public static void main(String[] args) {
        IMessage iMessage=new IMessage() {
            @Override
            public void print() {
                System.out.println("接口打印");
            }
        };
        iMessage.print();
    }
}
