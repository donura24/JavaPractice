package JavaPractice.JFrame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("The Great Application");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getJMenuBar();
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(500, 500);
        //this.getContentPane().setBackground(Color.CYAN);
        this.getContentPane().setBackground(new Color(123, 50, 255));


        //ImageIcon imageIcon = new ImageIcon("Honey-birdette-Playboy-3.jpg");
        //this.setIconImage(imageIcon.getImage());


    }

}
