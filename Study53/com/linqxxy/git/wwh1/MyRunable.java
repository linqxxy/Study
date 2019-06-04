package com.linqxxy.git.wwh2;

public class MyRunable implements Runnable {
    private String title;
    MyRunable(String title){
        this.title=title;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(title+i);
        }
    }
}
