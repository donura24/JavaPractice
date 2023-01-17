package JavaPractice.JavaPractice.JFrame.JProgressBar;

import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar progressBar = new JProgressBar();

    ProgressBarDemo(){

        progressBar.setValue(0);
        progressBar.setBounds(0,0,300,50);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("Ubuntu", Font.BOLD,15));
        progressBar.setForeground(Color.red);
        progressBar.setBackground(Color.black);
        
        frame.add(progressBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        
        progression();

    }

    public void progression() {
        int counter =0;
        while (counter<=100){
            progressBar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter+=1;

        }
        progressBar.setString("Done!");
        progressBar.setForeground(Color.green);
    }
}
