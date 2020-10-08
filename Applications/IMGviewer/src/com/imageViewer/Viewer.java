package com.imageViewer;

import javax.swing.*;
import java.awt.*;

public class Viewer extends JPanel {
    int width=800;
    int height=800;

    Viewer(){
        setFocusable(true);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        g.fillRect(0,0,width,height);
        Toolkit t= Toolkit.getDefaultToolkit();
        Image img=t.getImage("Assets/Img/logo.png");
        g.drawImage(img,100,100,this);
    }
}
