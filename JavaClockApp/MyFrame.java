package JavaPractice.JavaClockApp;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    SimpleDateFormat timeFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dateLabel;
    String time;
    String date;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Java Clock");
        this.setLayout(new FlowLayout());
        this.setSize(480, 200);
        this.setBackground(Color.cyan);
        this.setResizable(true);
        this.setLocationRelativeTo(null);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dateFormat = new SimpleDateFormat("EEEE - MM dd, yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.BOLD, 50));
        timeLabel.setForeground(Color.green);
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 40));
        dateLabel.setForeground(Color.green);
        dateLabel.setBackground(Color.black);
        dateLabel.setOpaque(true);


        this.add(timeLabel);
        this.add(dateLabel);
        this.setVisible(true);

        try {
            setTime();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void setTime() throws InterruptedException {

        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);
            Thread.sleep(1000);

        }

    }

}
