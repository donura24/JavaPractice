package JavaPractice.JavaPractice.JFrame.KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.addKeyListener(this);
        this.setLayout(null);
        this.setTitle("Space game");

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        //label.setBackground(Color.BLUE);
        //label.setOpaque(true);
        icon = new ImageIcon("/home/teodor.penchev/Downloads/PNGs/spaceship-icon.png");
        label.setIcon(icon);
        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //Invoked when a key is typed. Uses KeyChar, char output.

        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Invoked when a physical key is pressed down. Uses KeyCode, int output.

        switch (e.getKeyCode()) {
            case 37: //left
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 39: //right
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 38:// up
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 40: //down
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Called whenever a button is released.

        System.out.println("You released key char: "+e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
