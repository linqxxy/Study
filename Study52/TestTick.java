package com.linqxxy.git;

import com.linqxxy.git.wwh3.MyTickRunable;


public class TestTick {

    public static void main(String[] args) {
        Runnable runnable=new MyTickRunable("黄牛");
        Thread thread=new Thread(runnable);
        Thread thread1=new Thread(runnable);
        Thread thread2=new Thread(runnable);
        thread.start();
        thread1.start();
        thread2.start();
    }

}
