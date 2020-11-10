package com.imageViewer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Window {

    public static void main(String[] args) throws IOException {

        //Variables
        int winWidth=800;
        int winHeight=800;

        //Image buffer
        String imagePath="Assets/Img/logo.png";
        BufferedImage logo= ImageIO.read(new File(imagePath));
        JFrame win=new JFrame();
        Viewer view=new Viewer(logo);

        // Window build
        win.setIconImage(logo);
        win.setResizable(true);
        win.setBounds(600,100,winWidth,winHeight);
        win.setVisible(true);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Menu bar build
        JMenuBar menuBar=new JMenuBar();
        JMenu Open,Edit,Slides;

        Open =new JMenu("Open");
        Open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Runtime.getRuntime().exec("explorer.exe /select," + "C:/");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
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
//JTextField search;
//search=new JTextField("SEARCH");
//search.setBounds(50,100, 200,30);
//win.add(search);