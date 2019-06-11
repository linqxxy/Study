package com.linqxxy.git.wwh1;

public class WaitThread extends  Thread {
    private final Object obj=TestWait.obj;
    @Override
    public void run() {
        synchronized (this.obj){
            System.out.println(Thread.currentThread().getName()+"：等待");
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"：结束");
        }
    }
}
