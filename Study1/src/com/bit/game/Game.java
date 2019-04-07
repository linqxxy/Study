package com.bit.game;
import java.util.Scanner;
public class Game {
    private  Person player;
    private Computer cpu;
    public Game(){
        player=new Person("bit");
        cpu=new Computer("alpha");
    }
    public void playThreeTimes(){
    int count =0;
    while (count<3){
        String pFis=player.fist();
        String cFis=cpu.fist();
        if(pFis.equals("布")&&cFis.equals("剪刀")||pFis.equals("石头")&&cFis.equals("布")||
                pFis.equals("剪刀")&&cFis.equals("石头")){
            cpu.addScore();
            System.out.println("电脑赢");
        }else if(pFis.equals(cFis)){
            System.out.println("平局");
        }else {
            player.addScore();
            System.out.println("玩家赢");
        }
        count++;
    }
    }

    public void getresult(){
        int pScore=player.getScore();
        int cScore=cpu.getScore();
        if(pScore>cScore){
            System.out.println("玩家胜利");
            System.out.println(cpu.getName()+":"+player.getName()+"="+cpu.getScore()+":"+player.getScore());
        }else if(pScore==cScore){
            System.out.println("平局");
            System.out.println(cpu.getName()+":"+player.getName()+"="+cpu.getScore()+":"+player.getScore());
        }else{
            System.out.println("电脑胜利");
            System.out.println(cpu.getName()+":"+player.getName()+"="+cpu.getScore()+":"+player.getScore());
        }
    }
    public void start(){
        while (true){
            playThreeTimes();
            System.out.println("==========================================");
            getresult();
            System.out.println("是否继续？");
            Scanner scanner=new Scanner(System.in);
            String str=scanner.next();
            if(str.equals("是")){
                continue;
            }else{
                break;
            }
        }
    }
}
