package JavaPractice.JavaPractice.JFrame.JLabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("/home/teodor.penchev/Downloads/AvatarMaker.png");
        Border border = BorderFactory.createLineBorder(new Color(200,50,120),5);
        JLabel label = new JLabel();
        label.setText("How are you?");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(Color.GREEN);
        label.setBackground(new Color(30, 50, 150));
        label.setOpaque(true); // display background color
        label.setFont(new Font("Italic", Font.BOLD,25));
        label.setIconTextGap(25);
        //label.setBounds(0,0, 500,500);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        JFrame jFrame = new JFrame();
        //jFrame.setSize(950,950);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jFrame.setLayout(null);
        jFrame.add(label);
        jFrame.setVisible(true);
        jFrame.pack();

    }
}
