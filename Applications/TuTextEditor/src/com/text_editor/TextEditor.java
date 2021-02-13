package com.text_editor;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextEditor {
    public static void main(String[] args) {
        new Logic();
    }
}

class Logic extends JFrame implements ActionListener, KeyListener {
    Logic() {
        // Declarations
        Button newFile, delFile, open, close, save, clear, theme, run;
        JTextArea textArea;
        JScrollPane scroll;
        JLabel copy, paste, selectAll, cut, undo;
        Font tileFont = new Font("TimesRoman", Font.BOLD, 18);
        JFrame win = new JFrame();
        Window TextEditor = new Window();
        int winWidth = 800;
        int winHeight = 800;
        int textAreaWidth = winWidth - 40;
        int textAreaHeight = winHeight - 160;
        int numbOfBtn = 7;
        int btnWidth = winWidth / numbOfBtn;
        int btnHeight = 30;
        int btnX = 0;

        int numOfTiles = 5;
        int tileWidth = winWidth / numOfTiles;
        int tileHeight = 30;
        int tileX = 10;
        // Definitions
        win.setTitle("Tu Text Editor");
        win.setVisible(true);
        win.setResizable(false);
        win.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setSize(winWidth, winHeight);
        win.setLocationRelativeTo(null);
        win.setAlwaysOnTop(true);
        win.setLayout(null);
        // Key binding
        newFile = new Button("New");
        delFile = new Button("Delete");
        open = new Button("Open");
        close = new Button("Close");
        save = new Button("Save");
        clear = new Button("Clear");
        run = new Button("Run");
        win.add(newFile);
        newFile.setBounds(btnX, 0, btnWidth, btnHeight);
        btnX = btnX + btnWidth;
        win.add(delFile);
        delFile.setBounds(btnX, 0, btnWidth, btnHeight);
        btnX = btnX + btnWidth;
        win.add(open);
        open.setBounds(btnX, 0, btnWidth, btnHeight);
        btnX = btnX + btnWidth;
        win.add(close);
        close.setBounds(btnX, 0, btnWidth, btnHeight);
        btnX = btnX + btnWidth;
        win.add(save);
        save.setBounds(btnX, 0, btnWidth, btnHeight);
        btnX = btnX + btnWidth;
        win.add(clear);
        clear.setBounds(btnX, 0, btnWidth, btnHeight);
        win.add(run);
        btnX = btnX + btnWidth;
        run.setBounds(btnX, 0, btnWidth, btnHeight);
        // Tile binding
        copy = new JLabel("CRL+C COPY");
        paste = new JLabel(("CRL+V PASTE"));
        cut = new JLabel(("CRL+X CUT"));
        selectAll = new JLabel(("CRL+A SELECT ALL"));
        undo = new JLabel(("CRL+Z UNDO"));
        copy.setFont(tileFont);
        copy.setBounds(tileX, 720, tileWidth, tileHeight);
        win.add(copy);
        tileX = tileX + tileWidth - 12;
        paste.setFont(tileFont);
        paste.setBounds(tileX, 720, tileWidth, tileHeight);
        win.add(paste);
        tileX = tileX + tileWidth - 5;
        cut.setFont(tileFont);
        cut.setBounds(tileX, 720, tileWidth, tileHeight);
        win.add(cut);
        tileX = tileX + tileWidth - 25;
        selectAll.setFont(tileFont);
        selectAll.setBounds(tileX, 720, tileWidth + 20, tileHeight);
        win.add(selectAll);
        tileX = tileX + tileWidth + 40;
        undo.setFont(tileFont);
        undo.setBounds(tileX, 720, tileWidth, tileHeight);
        win.add(undo);

        // Text area binding

        textArea = new JTextArea();
        //textArea.setBounds(10, 40, textAreaWidth, textAreaHeight);
        textArea.setMargin(new Insets(10, 10, 10, 10));
        textArea.setLineWrap(true);
        textArea.setBackground(Color.darkGray);
        textArea.setForeground(Color.white);
        textArea.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("TimesRoman", Font.BOLD, 24));
        scroll = new JScrollPane(textArea);
        scroll.setBounds(10, 70, textAreaWidth, textAreaHeight);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        win.add(scroll);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    /*
     * Sets the style of wrapping used if the text area is wrapping lines.
     * If set to true the lines will be wrapped at word boundaries (whitespace)
     * if they are too long to fit within the allocated width. If set to false,
     * the lines will be wrapped at character boundaries. By default this property is false.
     */
}
