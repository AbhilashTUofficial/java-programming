package com.boardGame;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Window {

    public static void main(String[] args) throws IOException {
        int x=600;
        int y=100;
        int width=610;
        int height=620;
        String imagePath="Assets/Img/TileGame.png";
        BufferedImage logo= ImageIO.read(new File(imagePath));
	JFrame win=new JFrame();
	Board board=new Board();
	win.setIconImage(logo);
	win.setBounds(x,y,width,height);
	win.setTitle("Board Game");
	win.setVisible(true);
	win.setResizable(false);
	win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	win.add(board);
    }
}
