package com.imageViewer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Window {

    public static void main(String[] args) throws IOException {
        int winWidth=800;
        int winHeight=800;
        String imagePath="Assets/Img/logo.png";
        BufferedImage logo= ImageIO.read(new File(imagePath));
        JFrame win=new JFrame();
        Viewer view=new Viewer();
        win.setIconImage(logo);
        win.setResizable(true);
        win.setBounds(600,100,winWidth,winHeight);
        win.setVisible(true);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JMenuBar menuBar=new JMenuBar();
        JMenu Open,Edit,Slides;
        Open =new JMenu("Open");
        Edit=new JMenu("Edit");
        Slides=new JMenu("Slides");

        win.add(Open);
        win.add(Edit);
        win.add(Slides);
        menuBar.add(Open);
        menuBar.add(Edit);
        menuBar.add(Slides);

        win.setJMenuBar(menuBar);

        win.add(view);
    }
}
