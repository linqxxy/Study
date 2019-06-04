package com.linqxxy.git.wwh2;

import java.util.concurrent.*;

public class TestMycallable {
    public static void main(String[] args) {
        Callable<Integer> callable=new MyCallable();
        FutureTask<Integer> futureTask=new FutureTask<>(callable);
        Thread thread=new Thread(futureTask);
        thread.start();
        try {
            Integer sum=futureTask.get(1000, TimeUnit.MILLISECONDS);
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println("main结束");
    }
}
