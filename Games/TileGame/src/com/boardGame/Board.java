package com.boardGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Random;

public class Board extends JPanel implements KeyListener, ActionListener {
    //Variables
    private int row = 3;
    private int col = 3;
    private int screenWidth = 600;
    private int screenHeight = 600;
    private int tileSize = 200 + 3 * 4;
    private static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int index = 0;
    private String number;

    //SetUp functions
    public void setUp() {
        randomize(array);
        main();
    }

    static void main() {
        Board obj = new Board();
        System.out.println(Arrays.toString(array));
    }


    public static int[] randomize(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }


    public void tile(Graphics g, int x, int y, int index) {
        g.setColor(Color.gray);
        g.fillRect(x, y, tileSize, tileSize);
        g.setColor(Color.lightGray);
        g.fillRect(x + 2, y + 2, tileSize - 4, tileSize - 4);
        g.setColor(Color.darkGray);
        g.setFont(new Font("serif", Font.BOLD, 100));
        number = String.valueOf(array[index]);
        if (number.equals("9")) {
            g.setColor(Color.darkGray);
            g.fillRect(x+30,y+30,tileSize-80,tileSize-80);
        } else {
            g.drawString(number, x + 1 * 70, y + 1 * 130);
        }


    }

    @Override
    public void paint(Graphics g) {
        setUp();
        super.paint(g);
        //Background
        g.setColor(Color.gray);
        g.fillRect(0, 0, screenWidth, screenHeight);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int x = i * 200;
                int y = j * 200;
                tile(g, x, y, index);
                index += 1;
            }
        }
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
}