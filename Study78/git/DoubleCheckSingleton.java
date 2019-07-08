package com.inqxxy.git;

public class DoubleCheckSingleton {
    volatile private static DoubleCheckSingleton singleton;
    private DoubleCheckSingleton(){ }
    public static DoubleCheckSingleton getInstence(){
        if (singleton==null){
            synchronized (DoubleCheckSingleton.class) {
                if (singleton==null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
