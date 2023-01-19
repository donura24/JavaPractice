package JavaPractice.JavaPractice.JFrame.MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon summer;
    ImageIcon spring;
    ImageIcon autumn;
    ImageIcon winter;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(128, 160);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 128, 128);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        label.addMouseListener(this);

        summer = new ImageIcon("/home/teodor.penchev/IdeaProjects/code/src/JavaPractice/PNGs/summer-beach-girl-finger-icon.png");
        spring = new ImageIcon("/home/teodor.penchev/IdeaProjects/code/src/JavaPractice/PNGs/spring-icon.png");
        autumn = new ImageIcon("/home/teodor.penchev/IdeaProjects/code/src/JavaPractice/PNGs/autumn-icon.png");
        winter = new ImageIcon("/home/teodor.penchev/IdeaProjects/code/src/JavaPractice/PNGs/winter-skating-icon.png");


        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked ( pressed and released ) on a component
        System.out.println("You clicked on the component");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        System.out.println("You pressed the mouse button on the component");
        //label.setBackground(Color.cyan);
        label.setIcon(summer);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        System.out.println("You released the mouse button on the component");
        //label.setBackground(Color.green);
        label.setIcon(spring);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse entered a component
        System.out.println("You entered the component with the cursor");
        //label.setBackground(Color.yellow);
        label.setIcon(autumn);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Invoked when the mouse exits a component
        System.out.println("You exited the component with the cursor");
        //label.setBackground(Color.blue);
        label.setIcon(winter);

    }
}
