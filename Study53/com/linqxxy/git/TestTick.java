package com.linqxxy.git;
import com.linqxxy.git.wwh3.MyCallable;
import com.linqxxy.git.wwh3.MyTickRunable;

import java.util.concurrent.*;


public class TestTick {

    public static void main(String[] args){
        Runnable runnable=new MyTickRunable("黄牛");
        Callable<String> callable=new MyCallable("黄牛");
        FutureTask<String> futureTask=new FutureTask<>(callable);
        Thread thread0=new Thread(futureTask);
        Thread thread1=new Thread(futureTask);
        thread0.start();
        thread1.start();
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
//        Thread thread=new Thread(runnable);
//        Thread thread1=new Thread(runnable);
//        Thread thread2=new Thread(runnable);
//        thread.start();
//        thread1.start();
//        thread2.start();
    }

}
