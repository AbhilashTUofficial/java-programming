package com.tictactoe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;


public class GameLogic extends JPanel implements ActionListener, KeyListener, MouseListener {
    Timer time;
    int delay=8;
    int TileSize=260;
    char[][] grid={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
    boolean mouseC =false;
    int xi=3;
    int yj=3;


    public GameLogic() {
        addKeyListener(this);
        addMouseListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        time = new Timer(delay, this);
        time.start();
    }

    public void paint(Graphics g) {
        drawGrid(g);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(grid[i][j]!=' '){
                    if(grid[i][j]=='x'){
                        drawX(i,j,g);
                    }else{
                        drawY(i,j,g);
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(grid));
    }
    public void drawGrid(Graphics g){
        int x = 2;
        int y = 2;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if(xi!=3||yj!=3){
                    if(grid[xi][yj]=='x'){
                        g.setColor(Color.red);
                        g.fillRect(x, y, TileSize, TileSize);
                    }
                    if(grid[xi][yj]=='o'){
                        g.setColor(Color.green);
                        g.fillRect(x, y, TileSize, TileSize);
                    }
                }
                
                g.fillRect(x, y, TileSize, TileSize);
                x += 263;
            }
            y += 263;
            x = 0;
        }

    }
    public void drawX(int xi,int yj,Graphics g){

    }
    public void drawY(int x,int y,Graphics g){

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        int x=e.getX();
        int y=e.getY();
        xi=(x/263);
        yj=(y/263);
        grid[xi][yj]='x';
        System.out.println("xi:"+xi+"yj:"+yj);
        repaint();
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



    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
