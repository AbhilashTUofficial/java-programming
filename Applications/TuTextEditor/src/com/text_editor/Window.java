package com.text_editor;

import javax.swing.*;

public class Window extends JFrame {
    JFrame win=new JFrame();
    Window(){
        win.setTitle("Tu Text Editor");
        win.setVisible(true);
        win.setResizable(false);
        win.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setSize(800,800);
        win.setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        Window TextEditor=new Window();
    }

}