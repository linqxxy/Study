package com.linqxxy.git.util;

public class ComputerFactory {
    public static Computer getInstance(String type){
        Computer computer=null;
        switch (type){
            case "MacBook": computer=new MacBook();break;
            case "SurfaceBook":computer=new SurfaceBook();break;
            default:
                System.out.println("暂时无货");
        }
        return computer;
    }
}
