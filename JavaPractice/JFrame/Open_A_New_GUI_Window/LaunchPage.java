package JavaPractice.JavaPractice.JFrame.Open_A_New_GUI_Window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Opens a new window!");

    LaunchPage() {

        button.setBounds(100, 110, 220, 120);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        NewWindow newWindow = new NewWindow();

    }
}
