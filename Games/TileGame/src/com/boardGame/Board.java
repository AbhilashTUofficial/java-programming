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
    private static int holeIndex;


    Board() {
        setUp();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }


    //SetUp functions
    public void setUp() {
        randomize(array);
    }


    public static void randomize(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void findHole(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == 9) {
                holeIndex = i;
            }
        }


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
            g.fillRect(x + 30, y + 30, tileSize - 80, tileSize - 80);
        } else {
            g.drawString(number, x + 70, y + 130);
        }
    }

    @Override
    public void paint(Graphics g) {
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

        g.dispose();

    }


    @Override
    public void actionPerformed(ActionEvent e) {


    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        repaint();
        System.out.println(Arrays.toString(array));
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            findHole(array);
            if (holeIndex < 9 && holeIndex > 5) {
                System.out.println("Cant move");
            } else {
                int temp = array[holeIndex];
                array[holeIndex] = array[holeIndex + 3];
                array[holeIndex + 3] = temp;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            findHole(array);
            if (holeIndex < 3 && holeIndex > -1) {
                System.out.println("Cant move");
            } else {
                int temp = array[holeIndex];
                array[holeIndex] = array[holeIndex - 3];
                array[holeIndex - 3] = temp;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            findHole(array);
            if (holeIndex == 0 || holeIndex == 3 || holeIndex == 6) {
                System.out.println("Cant move");
            } else {
                int temp = array[holeIndex];
                array[holeIndex] = array[holeIndex - 1];
                array[holeIndex - 1] = temp;
            }

        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            findHole(array);
            if (holeIndex == 2 || holeIndex == 5 || holeIndex == 8) {
                System.out.println("Cant move");
            } else {
                int temp = array[holeIndex];
                array[holeIndex] = array[holeIndex + 1];
                array[holeIndex + 1] = temp;
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}