package com.linqxxy.git.wwh1;

public class TestLock {
    public static void main(String[] args) {
        Runnable runnable= new TickLockRunable();
        Thread thread1=new Thread(runnable,"黄牛1");
        Thread thread2=new Thread(runnable,"黄牛2");
        Thread thread3=new Thread(runnable,"黄牛3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
