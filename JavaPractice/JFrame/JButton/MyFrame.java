package JavaPractice.JavaPractice.JFrame.JButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {
        ImageIcon icon = new ImageIcon("/home/teodor.penchev/Downloads/communityIcon_i91iz7i42ok91.png");
        ImageIcon icon2 = new ImageIcon("/home/teodor.penchev/Downloads/LinkedIn+thumbs+up+emoji.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(275, 175, 256, 256);
        label.setVisible(false);
        label.setBorder(BorderFactory.createLineBorder(Color.orange,3));

        button = new JButton();
        button.setBounds(150, 150, 550, 350);
        button.addActionListener(this); // Can be replaced with: button.addActionListener(e -> System.out.println("Click!"));
        button.setText("Click me!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setVerticalTextPosition(JButton.TOP);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFont(new Font("Italic", Font.BOLD, 15));
        button.setIconTextGap(1);
        button.setForeground(Color.green);
        button.setBackground(Color.black);
        button.setBorder(BorderFactory.createLineBorder(Color.green, 10));
        //button.setEnabled(true/false); Enable/disable button;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800, 600);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            //System.out.println("Click!");
            //button.setEnabled(true/false); Enable/disable button; One click and the button will be disabled in this case;
            label.setVisible(true);
            button.setVisible(false);
        }
    }
}
