package JavaPractice.JavaPractice.JFrame.JColorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton BGbutton;
    JButton FGbutton;
    JLabel label;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 200);
        this.setLayout(new GridLayout());

        BGbutton = new JButton("Choose Background color");
        BGbutton.setFocusable(false);
        BGbutton.addActionListener(this);

        FGbutton = new JButton("Choose Foreground color");
        FGbutton.setFocusable(false);
        FGbutton.addActionListener(this);

        label = new JLabel("How are you?");
        label.setOpaque(true);
        label.setBackground(Color.green);
        label.setFont(new Font("Ubuntu", Font.BOLD, 20));
        label.setHorizontalAlignment(JLabel.CENTER);

        this.add(BGbutton);
        this.add(FGbutton);
        this.add(label);
        //this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == BGbutton) {

            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "All colors", Color.blue);
            label.setBackground(color);
        }
        if (e.getSource() == FGbutton) {

            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "All colors", Color.blue);
            label.setForeground(color);
        }

    }
}
