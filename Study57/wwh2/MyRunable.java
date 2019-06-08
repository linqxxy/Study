package com.linqxxy.git.wwh2;

public class MyRunable implements  Runnable {
    private int tick=10;
    @Override
    public void run() {
        while(tick>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                if(this.tick>0){
                    System.out.println(Thread.currentThread().getName()+"：买了一张票，剩余"+(--this.tick));
                    if (this.tick==0){
                        System.out.println("票卖完了");
                    }
                }
            }
        }
    }
}
