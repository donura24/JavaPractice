package JavaPractice.JavaPractice.JFrame.JLabel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("AvatarMaker.png");

        JLabel label = new JLabel();
        label.setText("How are you?");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(Color.GREEN);
        label.setBackground(new Color(30, 50, 150));
        label.setFont(new Font("Italic", Font.BOLD,25));
        label.setBounds(0,0, 250,250);

        JFrame jFrame = new JFrame();
        jFrame.setSize(950,950);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(label);
        jFrame.setBackground(Color.DARK_GRAY);
        jFrame.setVisible(true);

    }
}
