package com.linqxxy.git.wwh2;

public class TestTick {
    public static void main(String[] args) {
        Runnable runnable1=new MySyncLock();
        Thread thread1=new Thread(runnable1,"黄牛1");
        Thread thread2=new Thread(runnable1,"黄牛2");
        thread1.start();
        thread2.start();
    }
}
