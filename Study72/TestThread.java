package com.linqxxy.git;

public class TestThread {
    public static void main(String[] args) {
        Task task=new Task();
        Thread thread1=new Thread(task,"黄牛A");
        Thread thread2=new Thread(task,"黄牛B");
        Thread thread3=new Thread(task,"黄牛C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
