package com.linqxxy.git;

public class Message<T extends Number> {
    @Override
    public String toString() {
        return "Message{" +
                "data=" + data +
                '}';
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private T data;
    Message(T data){
        this.data=data;
    }
    public void print(Message<? extends Integer> message){
        System.out.println(message.data);
    }
    public void print2(Message<? super Number> message){
        message.setData(1);
        System.out.println(message.data);
    }
}
