package JavaPractice.JavaQuizGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz implements ActionListener {

    String[] questions = {
            "How created Linux?",
            "Which year was Linux created?",
            "What is the name of the first distribution?"
    };
    String[][] options = {
            {"Steve Jobs", "Elon Musk", "Bill Gates", "Linus Torvalds"},
            {"2002", "1991", "2006", "2011"},
            {"Ubuntu", "Arch", "BSD", "Slackware"}
    };
    char[] answers = {
            'A',
            'B',
            'C',
            'D'
    };

    char guess;
    char answer;
    int index;
    int correct_guesses;
    int total_Questions = questions.length;
    int result;
    int seconds = 10;

    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JTextArea textArea = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JLabel ans_labelA = new JLabel();
    JLabel ans_labelB = new JLabel();
    JLabel ans_labelC = new JLabel();
    JLabel ans_labelD = new JLabel();

    JLabel time_label = new JLabel();
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();
    public Quiz() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,650);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(90,20,200));
        frame.setLayout(null);
        frame.setResizable(false);

        textField.setBounds(0,0,900,50);
        textField.setBackground(new Color(100,25,100));
        textField.setForeground(Color.green);
        textField.setFont(new Font("Ubuntu", Font.BOLD,25));
        textField.setBorder(BorderFactory.createBevelBorder(1));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);

        textArea.setBounds(0,50,900,50);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(20,200,100));
        textArea.setForeground(Color.blue);
        textArea.setFont(new Font("Ubuntu", Font.BOLD,35));
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setEditable(false);

        buttonA.setBounds(0,100,100,100);
        buttonA.setFont(new Font("Ubuntu",Font.BOLD,35));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");

        buttonB.setBounds(0,200,100,100);
        buttonB.setFont(new Font("Ubuntu",Font.BOLD,35));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setText("B");

        buttonC.setBounds(0,300,100,100);
        buttonC.setFont(new Font("Ubuntu",Font.BOLD,35));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setText("C");

        buttonD.setBounds(0,400,100,100);
        buttonD.setFont(new Font("Ubuntu",Font.BOLD,35));
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);
        buttonD.setText("D");

        ans_labelA.setBounds(125,100,500,100);
        ans_labelA.setBackground(new Color(15,50,130));
        ans_labelA.setForeground(Color.green);
        ans_labelA.setFont(new Font("Ubuntu",Font.PLAIN,20));

        ans_labelB.setBounds(125,200,500,100);
        ans_labelB.setBackground(new Color(15,50,130));
        ans_labelB.setForeground(Color.green);
        ans_labelB.setFont(new Font("Ubuntu",Font.PLAIN,20));

        ans_labelC.setBounds(125,300,500,100);
        ans_labelC.setBackground(new Color(15,50,130));
        ans_labelC.setForeground(Color.green);
        ans_labelC.setFont(new Font("Ubuntu",Font.PLAIN,20));

        ans_labelD.setBounds(125,400,500,100);
        ans_labelD.setBackground(new Color(15,50,130));
        ans_labelD.setForeground(Color.green);
        ans_labelD.setFont(new Font("Ubuntu",Font.PLAIN,20));

        seconds_left.setBounds(800,512,100,100);
        seconds_left.setBackground(Color.orange);
        seconds_left.setForeground(Color.red);
        seconds_left.setFont(new Font("Ubuntu",Font.BOLD,45));
        seconds_left.setBorder(BorderFactory.createBevelBorder(1));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf(seconds));

        time_label.setBounds(800,477,100,25);
        time_label.setBackground(new Color(50,50,50));
        time_label.setForeground(new Color(255,160,30));
        time_label.setFont(new Font("Ubuntu",Font.PLAIN,20));
        time_label.setHorizontalAlignment(JTextField.CENTER);
        time_label.setText("TIMER ");

        number_right.setBounds(400,225,200,100);
        number_right.setBackground(Color.blue);
        number_right.setForeground(Color.green);
        number_right.setFont(new Font("Ubuntu",Font.BOLD,25));
        number_right.setBorder(BorderFactory.createBevelBorder(1));
        number_right.setHorizontalAlignment(JTextField.CENTER);
        number_right.setEditable(false);

        percentage.setBounds(400,325,200,100);
        percentage.setBackground(Color.LIGHT_GRAY);
        percentage.setForeground(Color.black);
        percentage.setFont(new Font("Ubuntu",Font.BOLD,25));
        percentage.setBorder(BorderFactory.createBevelBorder(1));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);


        frame.add(time_label);
        frame.add(seconds_left);
        frame.add(ans_labelA);
        frame.add(ans_labelB);
        frame.add(ans_labelC);
        frame.add(ans_labelD);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(textArea);
        frame.add(textField);
        frame.setVisible(true);

        nextQuestion();
    }

    public void nextQuestion() {

        if (index>=total_Questions){
            results();
        }
        else {
            textField.setText("Question "+(index)+1);
            textArea.setText(questions[index]);
            ans_labelA.setText(options[index][0]);
            ans_labelB.setText(options[index][1]);
            ans_labelC.setText(options[index][2]);
            ans_labelD.setText(options[index][3]);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if (e.getSource()==buttonA){
            answer = 'A';
            if (answer == answers[index]){
                correct_guesses++;
            }
        }
        if (e.getSource()==buttonB){
            answer = 'B';
            if (answer == answers[index]){
                correct_guesses++;
            }
        }
        if (e.getSource()==buttonC){
            answer = 'C';
            if (answer == answers[index]){
                correct_guesses++;
            }
        }
        if (e.getSource()==buttonD){
            answer = 'D';
            if (answer == answers[index]){
                correct_guesses++;
            }
        }
        displayAnswer();
    }

    public void displayAnswer() {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if (answers[index]!= 'A'){
            ans_labelA.setForeground(Color.red);
        }
        if (answers[index]!= 'B'){
            ans_labelB.setForeground(Color.red);
        }
        if (answers[index]!= 'D'){
            ans_labelC.setForeground(Color.red);
        }
        if (answers[index]!= 'D'){
            ans_labelD.setForeground(Color.red);
        }

        Timer pause = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ans_labelA.setForeground(Color.green);
                ans_labelB.setForeground(Color.green);
                ans_labelC.setForeground(Color.green);
                ans_labelD.setForeground(Color.green);

                answer= ' ';
                seconds = 10;
                seconds_left.setText(String.valueOf(seconds));
                buttonA.setEnabled(true);
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                buttonD.setEnabled(true);

                index++;
                nextQuestion();
            }
        });

    }

    public void results() {

    }
}
