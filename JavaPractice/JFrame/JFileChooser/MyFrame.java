package JavaPractice.JavaPractice.JFrame.JFileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Open file");
        button.addActionListener(this);

        this.setSize(400, 200);
        this.add(button);
        this.setVisible(true);
        //this.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {

            JFileChooser fileChooser = new JFileChooser();
            //int response = fileChooser.showOpenDialog(null);
            int response = fileChooser.showSaveDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }


        }

    }
}
