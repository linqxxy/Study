package com.linqxxy.git.wwh1;

public class TestDeadLock {
    private final static Pen pen = new Pen() ;
    private final static Book book = new Book() ;
    public static void main(String[] args) {
        new TestDeadLock().deadLock();
    }
    private void deadLock() {
        // 笔线程
        Thread thread1 = new Thread(() -> {
            synchronized (pen) {
                System.out.println(Thread.currentThread().getName()+" :我有笔，我就不给你");
                synchronized (book) {
                    System.out.println(Thread.currentThread().getName()+" :我完成了");
                }
            }
        },"Pen") ;

        // 本子线程
        Thread thread2 = new Thread(() -> {
            synchronized (book) {
                System.out.println(Thread.currentThread().getName()+" :我有本子，我就不给你！");
                synchronized (pen) {
                    System.out.println(Thread.currentThread().getName()+" :我完成了");
                }
            }

        },"Book") ;
        thread1.start();
        thread2.start();
    }
}
