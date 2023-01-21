package JavaPractice.JavaPractice.JFrame._2D_Graphics;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Image image;
    MyPanel() {
        image = new ImageIcon("/home/teodor.penchev/IdeaProjects/code/src/JavaPractice/PNGs/Rio2-Blu-icon.png").getImage();
        this.setPreferredSize(new Dimension(512, 512));


    }

    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        //g2D.setStroke(new BasicStroke(5));
        //g2D.setColor(Color.BLUE);
        //g2D.drawLine(0,0,500,500);
        //g2D.drawRect(200,200,150,150);
        //g2D.setColor(Color.red);
        //g2D.fillArc(200, 200, 150, 150, 0, 180);
        //g2D.setColor(Color.white);
        //g2D.fillArc(200,200,150,150,180,180);
        //g2D.setColor(Color.blue);
        //int[] xPoints = {550, 455, 491, 609, 645};
        //int[] yPoints = {450, 519, 631, 631, 519};
        //g2D.fillPolygon(xPoints, yPoints, 5);
        g2D.setColor(Color.white);
        g2D.fillRect(0,0,180,40);
        g2D.setColor(new Color(1,180,10));
        g2D.fillRect(0,40,180,40);
        g2D.setColor(new Color(200,10,10));
        g2D.fillRect(0,80,180,40);

        g2D.drawImage(image,0,0,null);


        g2D.setColor(new Color(70,50,250));
        g2D.setFont(new Font("Ubuntu",Font.BOLD,35));
        g2D.drawString("Hello, Smile!",300,320);

    }
}
