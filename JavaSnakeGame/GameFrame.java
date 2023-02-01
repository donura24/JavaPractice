package JavaPractice.JavaSnakeGame;


import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame(){

        //GamePanel panel = new GamePanel();
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);


        this.setVisible(true);

    }
}
