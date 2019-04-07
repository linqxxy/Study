package com.bit.game;

public class Testmain {
    public static void main(String[] args) {
        Game game=new Game();
        System.out.println("================欢迎来到猜拳游戏================");
        System.out.println("游戏规则：三局两胜，每局统计分数，判断"+"\n"
                +"哪一方获胜，三局过后，得到最终胜利玩家"+"\n"+"最后选择继续游戏或者退出游戏");
        System.out.println("================================================");
        game.start();
    }
}
