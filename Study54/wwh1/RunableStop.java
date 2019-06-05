package com.linqxxy.git.wwh1;

public class RunableStop implements Runnable {
    private  boolean flag=true;
    @Override
    public void run() {
        int i=0;
        while (flag){
            try {
                Thread.sleep(1000);
                boolean status = Thread.currentThread().isInterrupted();
                if(status){
                    System.out.println("非阻塞状态"+status);
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                boolean status = Thread.currentThread().isInterrupted();
                    System.out.println("阻塞状态"+status);
                    return;
            }
            i++;
            System.out.println(Thread.currentThread().getName()+"运行了"+i+"次");
        }
        System.out.println(Thread.currentThread().getName()+"线程终于停了");
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
