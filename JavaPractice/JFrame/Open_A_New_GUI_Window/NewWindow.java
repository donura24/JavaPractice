package JavaPractice.JavaPractice.JFrame.Open_A_New_GUI_Window;

import javax.swing.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("This is the new window!");
    NewWindow(){

        label.setHorizontalAlignment(JLabel.CENTER);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);

    }

}
