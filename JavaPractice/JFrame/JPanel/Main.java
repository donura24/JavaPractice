package JavaPractice.JavaPractice.JFrame.JPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components.
        ImageIcon imageIcon = new ImageIcon("/home/teodor.penchev/Downloads/phone-flat.png");
        //imageIcon.setDescription("Call Icon!");

        JLabel jLabel = new JLabel("This is JLabel!");
        jLabel.setIcon(imageIcon);
        //jLabel.setVerticalAlignment(JLabel.BOTTOM); // For BorderLayout option.
        //jLabel.setHorizontalAlignment(JLabel.CENTER); //For BorderLayout option.
        jLabel.setBounds(0, 100, 500, 256); // setLayout = null; width and height should match the icon size + JLabel text.

        JPanel greenJPanel = new JPanel();
        greenJPanel.setBackground(Color.green);
        greenJPanel.setBounds(0, 0, 500, 500);

        JPanel blueJPanel = new JPanel();
        blueJPanel.setBackground(Color.blue);
        blueJPanel.setBounds(500, 0, 500, 500);
        //blueJPanel.setLayout(new BorderLayout());
        blueJPanel.setLayout(null);


        JPanel redJPanel = new JPanel();
        redJPanel.setBackground(Color.red);
        redJPanel.setBounds(0, 500, 1000, 700);
        //redJPanel.setLayout(new BorderLayout());
        redJPanel.setLayout(null);

        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(1000, 1200);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        //redJPanel.add(jLabel);
        blueJPanel.add(jLabel);
        jFrame.add(greenJPanel);
        jFrame.add(blueJPanel);
        jFrame.add(redJPanel);


    }
}
