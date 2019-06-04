package com.linqxxy.git.wwh2;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        int sum=0;
        for(int i=0;i<=1000;i++){
            sum+=i;
        }
        Thread.sleep(1000);
        return sum;
    }
}
