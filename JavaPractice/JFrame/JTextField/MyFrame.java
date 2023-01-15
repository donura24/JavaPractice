package JavaPractice.JavaPractice.JFrame.JTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);


        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 50));
        textField.setFont(new Font("Italic", Font.BOLD,24));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.red);
        textField.setText("name");

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Hello "+textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);

        }

    }
}
