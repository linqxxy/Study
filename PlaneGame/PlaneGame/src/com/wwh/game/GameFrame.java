package com.wwh.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends JFrame {
    @Override
    public void paint(Graphics g) {
        g.drawLine(100,100,300,300);
    }

    public void  launchFrame(){
        this.setTitle("飞机小游戏");
        this.setSize(500,500);
        this.setLocation(500,100);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        GameFrame f=new GameFrame();
        f.launchFrame();
    }
}
