package com.linqxxy.git.util;

import java.util.Scanner;

public class Clint {
    public static void buyComputer(Computer computer){
        if (computer==null){
            System.out.println("购买失败");
        }else {
            computer.printComputer();
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        buyComputer(ComputerFactory.getInstance(scanner.nextLine()));
    }
}
