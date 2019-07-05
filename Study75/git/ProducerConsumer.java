package com.linqxxy.git;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class ProducerConsumer {
    private static Integer count = 0;
    private static final Integer FULL = 10;
    private static Lock lock = new ReentrantLock();
    private static final Condition notFull = lock.newCondition();
    private static final Condition notEmpty = lock.newCondition();
    public static void main(String[] args) {
        new Thread(new Producer(),"生产者1").start();
        new Thread(new Consumer(),"消费者1").start();
        new Thread(new Producer(),"生产者2").start();
        new Thread(new Consumer(),"消费者2").start();
        new Thread(new Producer(),"生产者3").start();
        new Thread(new Consumer(),"消费者3").start();
        new Thread(new Producer(),"生产者4").start();
        new Thread(new Consumer(),"消费者4").start();
    }

    public static class Producer implements Runnable {
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                lock.lock();
                try {
                    while (count == FULL) {
                        try {
                            notFull.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName()
                            + "生产者生产，目前总共有" + count);
                    notEmpty.signal();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    public static class Consumer implements Runnable {
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                lock.lock();
                try {
                    while (count == 0) {
                        try {
                            notEmpty.await();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName()
                            + "消费者消费，目前总共有" + count);
                    notFull.signal();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}