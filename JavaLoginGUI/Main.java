package JavaPractice.JavaLoginGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    private static JFrame frame;
    private static JPanel panel;
    private static JLabel userlabel;
    private static JLabel passlabel;
    private static JTextField userField;
    private static JPasswordField passField;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {

        panel = new JPanel();

        frame = new JFrame("My APP");
        frame.setSize(300, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(panel);

        panel.setLayout(null);

        userlabel = new JLabel("User:");
        userlabel.setBounds(10, 20, 80, 25);
        panel.add(userlabel);

        passlabel = new JLabel("Password:");
        passlabel.setBounds(10, 50, 80, 25);
        panel.add(passlabel);

        userField = new JTextField();
        userField.setBounds(100, 20, 165, 25);
        panel.add(userField);

        passField = new JPasswordField();
        passField.setBounds(100, 50, 165, 25);
        panel.add(passField);

        button = new JButton("LOGIN");
        button.setBounds(125, 90, 80, 25);
        button.addActionListener(new Main());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userField.getText();
        String pass = passField.getText();

        if (user.equals("Teodor")&& pass.equals("123")){
            success.setText("Login successful!");
        }
    }
}
