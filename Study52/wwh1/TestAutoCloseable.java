package com.linqxxy.git.wwh1;

public class TestAutoCloseable {
    public static void main(String[] args) {
       try(Message message=new Message()){
           message.print();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}
class Message implements AutoCloseable{
    public void print(){
        System.out.println("调用方法");
    }

    @Override
    public void close() {
        System.out.println("关闭");
    }
}