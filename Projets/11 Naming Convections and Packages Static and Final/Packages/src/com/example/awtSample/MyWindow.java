package com.example.awtSample;

import java.awt.*; //awt stands for abstract window toolkit
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title){
        super(title);
        setSize(520,140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font ("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("Peter is the biggest java king in the world!!", 60,60);
        g.setFont(sansSerifSmall);
        g.drawString("by Peter Koncz",60,100);
    }
}
