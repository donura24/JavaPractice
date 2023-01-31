package JavaPractice.JavaQuizGame;

import javax.swing.*;
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
    JLabel labelA = new JLabel();
    JLabel labelB = new JLabel();
    JLabel labelC = new JLabel();
    JLabel labelD = new JLabel();

    JLabel time_label = new JLabel();
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();
    public Quiz() {

    }

    public void nextQuestion() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void displayAnswer() {

    }

    public void results() {

    }
}
