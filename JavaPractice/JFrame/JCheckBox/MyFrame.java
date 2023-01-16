package JavaPractice.JavaPractice.JFrame.JCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    ImageIcon iconx;
    ImageIcon iconcheked;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        iconx = new ImageIcon("/home/teodor.penchev/Downloads/xicon.png");
        iconcheked = new ImageIcon("/home/teodor.penchev/Downloads/checkicon.png");

        button = new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot!");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Times New Roman",Font.BOLD,17));
        checkBox.setIcon(iconx);
        checkBox.setSelectedIcon(iconcheked);

        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println(checkBox.isSelected());
        }

    }
}
