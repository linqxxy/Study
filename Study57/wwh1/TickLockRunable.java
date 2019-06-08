package com.linqxxy.git.wwh1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TickLockRunable implements Runnable {
    private int tick=10;
    private final Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (this.tick>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.lock.lock();
            try {
                if(this.tick>0){
                    System.out.println(Thread.currentThread().getName()+"买票，剩余"+(--tick));
                    if (this.tick==0){
                        System.out.println("票卖完了");
                    }
                }
            }finally {
                this.lock.unlock();
            }

        }
    }
}
