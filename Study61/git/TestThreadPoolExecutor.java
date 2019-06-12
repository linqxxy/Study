package com.linqxxy.git;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class TestThreadPoolExecutor  {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(5,
                10,
                1,
                TimeUnit.MINUTES,
                new LinkedBlockingDeque<>(),
                new ThreadPoolExecutor.AbortPolicy()
                );
//        for (int i=0;i<50;i++){
//            final int tmp=i;
//            executor.execute(() -> System.out.println(Thread.currentThread().getName()+"  "+tmp));
//
//        }
        List<Future> futureList=new ArrayList<>();
        for(int i=0;i<50;i++){
            final int tmp=i;
            final Future<String> future=executor.submit(() -> {
                Thread.sleep(new Random().nextInt(5000));
                return "任务编号:"+ tmp+"时间:"+LocalDateTime.now().toString();
            });
            futureList.add(future);
        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        for (Future future:futureList) {
//            try {
//                System.out.println(future.get());
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//        }
        executor.shutdownNow();
        System.out.println(executor.isShutdown());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(executor.isTerminated());

        System.out.println(executor.isTerminated());
    }
}
