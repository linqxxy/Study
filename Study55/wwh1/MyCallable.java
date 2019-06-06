package com.linqxxy.git.wwh1;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    int ticket=10;
    @Override
    public Object call() throws Exception {
        while (ticket>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName()+"买了一张票，剩余"+(--ticket));
                }
            }
        }
        return "票卖完了";
    }
}
