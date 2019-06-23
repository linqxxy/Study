package Clint;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadDataThread extends Thread {
    private final Socket client;

    public ReadDataThread(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            InputStream in =this.client.getInputStream();
            Scanner scanner=new Scanner(in);
            while (true){
                try {

                    String message=scanner.nextLine();
                    System.out.println("来自服务端>"+message);
                }catch (NoSuchElementException e){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
