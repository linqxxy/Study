package com.linqxxy.git.wwh3;


public class MyTickThread  extends Thread{
    private int tick=10;
    private String title;
    public MyTickThread(String title){
        this.title=title;
    }

    @Override
    public void run() {

    }
}
