package JavaPractice.JavaPractice.JFrame._2D_Graphics;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyPanel panel;
    MyFrame(){

        panel = new MyPanel();
        this.add(panel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.orange);
        this.setVisible(true);

    }


}
