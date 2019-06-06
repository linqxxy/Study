package com.linqxxy.git.wwh1;

import java.util.concurrent.Callable;

public class TestCallable implements Callable {
    @Override
    public Object call(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"运行第"+i+"次");
        }
        return "运行结束";
    }
}
