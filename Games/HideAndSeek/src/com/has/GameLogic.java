package com.has;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameLogic extends JPanel implements ActionListener, KeyListener {

    private int TileSize = 260;
    private Timer time;
    private int delay = 8;

    public GameLogic() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        time = new Timer(delay, this);
        time.start();

    }

    public void paint(Graphics g) {
        int x=2;
        int y=2;
        for (int i = 0; i<=3;i++) {
            for (int j = 0; j <= 3;j++ ) {
                g.setColor(Color.white);
                g.fillRect(x, y, TileSize, TileSize);
                x += 263;
            }
            y+=263;
            x=0;

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
