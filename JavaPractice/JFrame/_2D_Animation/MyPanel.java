package JavaPractice.JavaPractice.JFrame._2D_Animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 720;
    final int PANEL_HEIGHT = 712;
    Image turboSnail;
    Image backGround;
    Timer timer;
    int xVelocity = 3;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel() {

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        //this.setBackground(Color.green);
        turboSnail = new ImageIcon("/home/teodor.penchev/IdeaProjects/code/src/JavaPractice/PNGs/Turbo-Snail-icon.png").getImage();
        backGround = new ImageIcon("/home/teodor.penchev/IdeaProjects/code/src/JavaPractice/PNGs/wooo.jpg").getImage();

        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {

        super.paint(g); // for background color
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(backGround,0,0,null);
        g2d.drawImage(turboSnail, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x>=PANEL_WIDTH - turboSnail.getWidth(null)|| x<0){
            xVelocity = xVelocity * -1;
        }
            x = x + xVelocity;

        if (y>=PANEL_WIDTH - turboSnail.getHeight(null)|| y<0){
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();

    }
}
