package TestDemo2.bit.src;

import java.util.Scanner;

public class Client {
    public static void Buy(Computer computer){
        computer.print();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String type=scanner.nextLine();
        Computer computer=ComputeFactory.getInstance(type);
        Buy(computer);
    }
}
