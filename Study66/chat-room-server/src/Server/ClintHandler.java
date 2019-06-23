package Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class ClintHandler implements Runnable {
    //存放客户端信息数据结构，采用map的形式存储
    private static final Map<String, Socket> clientMap = new ConcurrentHashMap<>();
    private final Socket clint;
    private String name;

    public ClintHandler(Socket socket) {
        this.clint = socket;
    }

    @Override
    public void run() {
        try {
            //客户输入信息
            InputStream in = this.clint.getInputStream();
            Scanner scanner = new Scanner(in);
            while (true) {
                String line = scanner.nextLine();
                //客户注册
                if (line.startsWith("register")) {
                    String[] segment = line.split(":");
                    if (segment.length == 2 && segment[0].equals("register")) {
                        register(segment[1]);
                    }
                    continue;
                }
                //群聊
                if (line.startsWith("groupchat")) {
                    String[] segment = line.split(":");
                    if (segment.length == 2 && segment[0].equals("groupchat")) {
                        groupChat(segment[1]);
                    }
                    continue;
                }
                //私聊
                if (line.startsWith("privatechat")) {
                    String[] segment=line.split(":");
                    if(segment.length==3&&segment[0].equals("privatechat")){
                        privateChat(segment[1],segment[2]);
                    }
                    continue;
                }
                //退出
                if (line.contains("bye")) {
                    quit();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void register(String name) {
        this.name = name;
        clientMap.put(name, this.clint);
        System.out.println(name+"注册成功");
        System.out.println("欢迎"+name + "加入我们");
        printUser();
    }

    // 群聊流程
    private void groupChat(String msg) {
        for (Map.Entry<String, Socket> entry:
        clientMap.entrySet()){
            Socket socket=entry.getValue();
            if(socket==this.clint){
                continue;
            }
            sendMessage(socket,this.name+"说 : "+msg);
        }
    }

    // 私聊流程
    private void privateChat(String userName, String msg) {
        Socket socket = clientMap.get(userName);
       if(socket!=null){
           sendMessage(socket,this.name+"说"+msg);
       }
    }
    //退出聊天室
    private void quit(){
        clientMap.remove(this.name);
        System.out.println(this.name+"下线了");
        printUser();
    }
    //显示当前聊天室在线人数
    private void printUser() {
        System.out.println("当前群聊人数为: " + clientMap.size() + "人,用户列表如下：");
        for (String name :
                clientMap.keySet()) {
            System.out.println(name);
        }
    }
    //发送信息
    private void sendMessage(Socket socket,String message){
        try {
            OutputStream out =socket.getOutputStream();
            PrintStream printStream = new PrintStream(out);
            printStream.println(message);
            printStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}