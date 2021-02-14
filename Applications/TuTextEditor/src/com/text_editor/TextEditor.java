package com.text_editor;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.ColorUIResource;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextEditor {
    public static void main(String[] args) {
        new Logic();
    }
}

class Logic extends JFrame implements ActionListener, KeyListener {
    JSpinner fontSpinner = new JSpinner();
    JTextArea textArea;
    Button newFile, delFile, open, close, save, clear, theme, run;


    Logic() {
        // Declarations

        JScrollPane scroll;
        JLabel copy, paste, selectAll, cut, undo;
        Font tileFont = new Font("TimesRoman", Font.BOLD, 18);
        JFrame win = new JFrame();
        Window TextEditor = new Window();
        int winWidth = 800;
        int winHeight = 800;
        int textAreaWidth = winWidth - 40;
        int textAreaHeight = winHeight - 130;
        int numbOfBtn = 7;
        int btnWidth = winWidth / numbOfBtn;
        int btnHeight = 30;
        int btnX = 0;

        int numOfTiles = 5;
        int tileWidth = winWidth / numOfTiles;
        int tileHeight = 30;
        int tileX = 10;
        try {//Tile Binding
            win.setTitle("Tu Text Editor");
            win.setVisible(true);
            win.setResizable(false);
            win.setDefaultCloseOperation(EXIT_ON_CLOSE);
            win.setSize(winWidth, winHeight);
            win.setLocationRelativeTo(null);
            win.setLayout(null);
            System.out.println("Window creation : Successful");
        } catch (Exception e) {
            System.out.println("Error while creating window");
            System.out.println(e);
        }

        try {//Key Binding
            newFile = new Button("New");
            delFile = new Button("Delete");
            open = new Button("Open");
            close = new Button("Close");
            save = new Button("Save");
            clear = new Button("Clear");
            run = new Button("Run");
            newFile.setBounds(btnX, 0, btnWidth, btnHeight);
            btnX = btnX + btnWidth;
            delFile.setBounds(btnX, 0, btnWidth, btnHeight);
            btnX = btnX + btnWidth;
            open.setBounds(btnX, 0, btnWidth, btnHeight);
            btnX = btnX + btnWidth;
            close.setBounds(btnX, 0, btnWidth, btnHeight);
            btnX = btnX + btnWidth;
            save.setBounds(btnX, 0, btnWidth, btnHeight);
            btnX = btnX + btnWidth;
            clear.setBounds(btnX, 0, btnWidth, btnHeight);
            btnX = btnX + btnWidth;
            run.setBounds(btnX, 0, btnWidth, btnHeight);
            newFile.addActionListener(this);
            delFile.addActionListener(this);
            open.addActionListener(this);
            close.addActionListener(this);
            save.addActionListener(this);
            clear.addActionListener(this);
            run.addActionListener(this);
            win.add(newFile);
            win.add(delFile);
            win.add(open);
            win.add(close);
            win.add(save);
            win.add(clear);
            win.add(run);
            System.out.println("Keybinding : Successful");
        } catch (Exception e) {
            System.out.println("Error while keybinding");
            System.out.println(e);
        }
        try {// Hint Tile Creation
            copy = new JLabel("CRL+C COPY");
            paste = new JLabel(("CRL+V PASTE"));
            cut = new JLabel(("CRL+X CUT"));
            selectAll = new JLabel(("CRL+A SELECT ALL"));
            undo = new JLabel(("CRL+Z UNDO"));
            copy.setBounds(tileX, 720, tileWidth, tileHeight);
            tileX = tileX + tileWidth - 12;
            paste.setBounds(tileX, 720, tileWidth, tileHeight);
            tileX = tileX + tileWidth - 5;
            cut.setBounds(tileX, 720, tileWidth, tileHeight);
            tileX = tileX + tileWidth - 25;
            selectAll.setBounds(tileX, 720, tileWidth + 20, tileHeight);
            tileX = tileX + tileWidth + 40;
            undo.setBounds(tileX, 720, tileWidth, tileHeight);
            copy.setFont(tileFont);
            paste.setFont(tileFont);
            cut.setFont(tileFont);
            selectAll.setFont(tileFont);
            undo.setFont(tileFont);
            win.add(selectAll);
            win.add(cut);
            win.add(paste);
            win.add(copy);
            win.add(undo);
            System.out.println("Tile creation : Successful");
        } catch (Exception e) {
            System.out.println("Error while Creating hint tiles");
            System.out.println(e);
        }

        try{// Text Area creation
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
            scroll.setBounds(10, 40, textAreaWidth, textAreaHeight);
            scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
            win.add(scroll);
            System.out.println("Text area creation : Successful");
        }catch (Exception e){
            System.out.println("Error while creating text area");
            System.out.println(e);
        }






    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == open) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
            fileChooser.setFileFilter(filter);

            int response = fileChooser.showOpenDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                Scanner fileIn = null;

                try {
                    fileIn = new Scanner(file);
                    if (file.isFile()) {
                        while (fileIn.hasNextLine()) {
                            String line = fileIn.nextLine() + "\n";
                            textArea.append(line);
                        }
                    }
                } catch (FileNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                } finally {
                    fileIn.close();
                }
            }
        }
        if (e.getSource() == save) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));

            int response = fileChooser.showSaveDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
                File file;
                PrintWriter fileOut = null;

                file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                try {
                    fileOut = new PrintWriter(file);
                    fileOut.println(textArea.getText());
                } catch (FileNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                } finally {
                    fileOut.close();
                }
            }
        }
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
