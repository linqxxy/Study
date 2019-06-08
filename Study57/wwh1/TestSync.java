package com.linqxxy.git.wwh1;

public class TestSync{
    public static void main(String[] args) {
        Sync sync=new Sync();
        for (int i=0;i<10;i++){
            Thread thread=new SyncThread(sync);
        }
    }
}
class Sync {
    public synchronized void test(){
        System.out.println(Thread.currentThread().getName()+"开始执行");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"结束执行");
    }
}
