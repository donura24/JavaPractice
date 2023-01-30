package JavaPractice.JavaTicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;
    TicTacToe() throws InterruptedException {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(90,10,100));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(new Color(5,95,25));
        textfield.setForeground(new Color(200,2,255));
        textfield.setFont(new Font("Ink Free", Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("TicTacToe");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);

        button_panel.setLayout(new GridLayout(3,3,5,5));
        button_panel.setBackground(new Color(180,40,90));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.PLAIN,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);

        }


        title_panel.add(textfield);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel);

        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void firstTurn() throws InterruptedException {

        Thread.sleep(5000);
        if (random.nextInt(2)==0){
            player1_turn = true;
            textfield.setText("X turn");
        }
        else {
            player1_turn = false;
            textfield.setText("O turn");
        }

    }

    public void check() {

    }

    public void xWin(int a, int b, int c) {

    }

    public void oWin(int a, int b, int c) {

    }
}
