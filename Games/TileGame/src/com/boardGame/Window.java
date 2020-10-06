package com.boardGame;

import javax.swing.JFrame;

public class Window {

    public static void main(String[] args) {
        int x=600;
        int y=100;
        int width=610;
        int height=620;
	JFrame win=new JFrame();
	Board board=new Board();
	win.setBounds(x,y,width,height);
	win.setTitle("Board Game");
	win.setVisible(true);
	win.setResizable(false);
	win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	win.add(board);
    }
}
