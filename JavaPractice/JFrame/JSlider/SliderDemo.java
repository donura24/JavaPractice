package JavaPractice.JavaPractice.JFrame.JSlider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo() {

        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        label.setText("C = " + slider.getValue());
        label.setBounds(100,300,150,100);

        slider.setPreferredSize(new Dimension(200, 500));
        slider.setPaintTicks(true);

        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);

        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);

        slider.setFont(new Font("Ubuntu", Font.BOLD, 15));
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        panel.setLayout(new FlowLayout());
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(200, 600);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("C = " + slider.getValue());

    }
}
