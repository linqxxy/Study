package com.linqxxy.git.wwh1;

public class MyRunable implements  Runnable {
    private int ticket=10;
    @Override
    public void run() {
        while (ticket>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName()+"买了一张票，剩余"+(--ticket));
                    if(ticket==0){
                        System.out.println("票卖完了");
                    }
                }
            }
        }
    }
}
