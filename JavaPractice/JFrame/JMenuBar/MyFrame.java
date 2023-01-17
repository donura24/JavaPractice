package JavaPractice.JavaPractice.JFrame.JMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem saveItem;
    JMenuItem loadItem;
    JMenuItem exitItem;
    ImageIcon saveIcon;
    ImageIcon loadIcon;
    ImageIcon exitIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();

        saveIcon = new ImageIcon("/home/teodor.penchev/Downloads/PNGs/save-icon.png");
        loadIcon = new ImageIcon("/home/teodor.penchev/Downloads/PNGs/load-upload-icon.png");
        exitIcon = new ImageIcon("/home/teodor.penchev/Downloads/PNGs/exit-icon.png");

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        saveItem = new JMenuItem("Save");
        loadItem = new JMenuItem("Load");
        exitItem = new JMenuItem("Exit");

        fileMenu.setMnemonic(KeyEvent.VK_F);// Press alt + f; shortcuts;
        editMenu.setMnemonic(KeyEvent.VK_E);// Press alt + e; shortcuts;
        helpMenu.setMnemonic(KeyEvent.VK_H);// Press alt + f; shortcuts;

        saveItem.setMnemonic(KeyEvent.VK_S);// Press s; shortcuts;
        loadItem.setMnemonic(KeyEvent.VK_L);// Press h; shortcuts;
        exitItem.setMnemonic(KeyEvent.VK_Q);// Press e; shortcuts;

        saveItem.setIcon(saveIcon);
        loadItem.setIcon(loadIcon);
        exitItem.setIcon(exitIcon);

        saveItem.addActionListener(this);
        loadItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.add(saveItem);
        fileMenu.add(loadItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == saveItem) {
            System.out.println("You saved the file!");
        }
        if (e.getSource() == loadItem) {
            System.out.println("You loaded the file!");
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }
}
