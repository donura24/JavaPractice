package JavaPractice.JavaPractice.JFrame.DragAndDrop;

import javax.swing.*;

public class MyFrame extends JFrame {
    DragPanel dragPanel = new DragPanel();
    MyFrame(){
        this.add(dragPanel);
        this.setTitle("Drag and Drop demo");
        this.setSize(550,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
