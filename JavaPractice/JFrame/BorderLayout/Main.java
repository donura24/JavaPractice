package JavaPractice.JavaPractice.JFrame.BorderLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout()); // Setting a margin b/w the panels: frame.setLayout(new BorderLayout(10,10));
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        //--------------- sub-panels ----------------
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();

        panel6.setBackground(Color.black);
        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setBackground(Color.DARK_GRAY);
        panel7.setPreferredSize(new Dimension(50, 50));

        panel1.setLayout(new BorderLayout());
        panel1.add(panel6, BorderLayout.NORTH);
        panel1.add(panel7, BorderLayout.SOUTH);

        panel1.setBackground(Color.green);
        panel2.setBackground(Color.yellow);
        panel3.setBackground(Color.red);
        panel4.setBackground(Color.blue);
        panel5.setBackground(Color.pink);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);


    }
}
