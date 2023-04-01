package JavaPractice.JavaLoginGUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(panel);

        panel.setLayout(null);

        JLabel label = new JLabel("User:");
        label.setBounds(10,20,80,25);
        panel.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(100, 20,165,25);
        panel.add(textField);


        frame.setVisible(true);


    }
}
