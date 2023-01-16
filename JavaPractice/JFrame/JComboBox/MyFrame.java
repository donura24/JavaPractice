package JavaPractice.JavaPractice.JFrame.JComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox jComboBox;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setBounds(1000, 700, 1, 1);

        String[] words = {"Fire", "Water", "Wind"};
        //Integer[] numbers = {1,2,3,4}; using wrapper class for primitive data types.

        jComboBox = new JComboBox(words);
        jComboBox.addActionListener(this);

        /*

        jComboBox.setEditable(true);
        System.out.println(jComboBox.getItemCount());
        jComboBox.insertItemAt("stone",0);
        jComboBox.setSelectedIndex(0); // default start position.
        jComboBox.removeItem("Water");
        jComboBox.removeItemAt(2);
        jComboBox.removeAllItems();

         */

        this.add(jComboBox);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jComboBox) {
            System.out.println(jComboBox.getSelectedItem());
            //System.out.println(jComboBox.getSelectedIndex());
        }

    }
}
