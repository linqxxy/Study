package com.linqxxy.git.wwh2;

public class TestStaticOverFlow {
    private static int stackDeep=0;
    private static int  func(){
        while (true) {
            stackDeep++;
            func();
        }
    }

    public static void main(String[] args) {
        try{func();}catch (Throwable e){
            System.out.println(stackDeep);
            throw  e;
        }
    }
}
