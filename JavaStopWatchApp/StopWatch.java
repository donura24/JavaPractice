package JavaPractice.JavaStopWatchApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StopWatch implements ActionListener {

    JFrame frame = new JFrame();
    JButton startButton = new JButton("Start");
    JButton resetButton = new JButton("Reset");
    JLabel timeLabel = new JLabel();
    int elapsedTime = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    int milliseconds = 0;

    boolean started = false;
    String str_seconds = String.format("%02d", seconds);
    String str_minutes = String.format("%02d", minutes);
    String str_hours = String.format("%02d", hours);
    String str_milliseconds = String.format("%02d", milliseconds);

    Timer timer = new Timer(1, new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            elapsedTime += 1;
            hours = (elapsedTime / 3600000);
            minutes = (elapsedTime / 60000) % 60;
            seconds = (elapsedTime / 1000) % 60;
            milliseconds = (elapsedTime) % 1000;

            str_seconds = String.format("%02d", seconds);
            str_minutes = String.format("%02d", minutes);
            str_hours = String.format("%02d", hours);
            str_milliseconds = String.format("%03d", milliseconds);
            timeLabel.setText(str_hours + ":" + str_minutes + ":" + str_seconds + ":" + str_milliseconds);

        }
    });

    StopWatch() {

        timeLabel.setText(str_hours + ":" + str_minutes + ":" + str_seconds + ":" + str_milliseconds);
        timeLabel.setBounds(50, 100, 300, 100);
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 35));
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        startButton.setBounds(50, 200, 150, 50);
        startButton.setFont(new Font("Ink Free", Font.PLAIN, 20));
        startButton.setFocusable(false);
        startButton.addActionListener(this);

        resetButton.setBounds(200, 200, 150, 50);
        resetButton.setFont(new Font("Ink Free", Font.PLAIN, 20));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(startButton);
        frame.add(resetButton);
        frame.add(timeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (started == false) {
                started = true;
                startButton.setText("Stop");
                start();
            } else {
                started = false;
                startButton.setText("Start");
                stop();
            }

        }
        if (e.getSource() == resetButton) {

            started = false;
            startButton.setText("Start");

            reset();
        }

    }

    void start() {
        timer.start();

    }

    void stop() {
        timer.stop();

    }

    void reset() {

        timer.stop();
        elapsedTime = 0;
        seconds = 0;
        hours = 0;
        minutes = 0;
        milliseconds = 0;

        str_seconds = String.format("%02d", seconds);
        str_minutes = String.format("%02d", minutes);
        str_hours = String.format("%02d", hours);
        str_milliseconds = String.format("%03d", milliseconds);
        timeLabel.setText(str_hours + ":" + str_minutes + ":" + str_seconds + ":" + str_milliseconds);

    }
}
