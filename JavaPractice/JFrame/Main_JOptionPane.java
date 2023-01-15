package JavaPractice.JavaPractice.JFrame;

import javax.swing.*;

public class Main_JOptionPane {
    public static void main(String[] args) {

        //JOptionPane.showMessageDialog(null,"This is the default pop-up!", "Title title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Nothing to say..", "Title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Who are you?", "No title!", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Call 911!", "Title", JOptionPane.ERROR_MESSAGE);

        //int hungry = JOptionPane.showConfirmDialog(null, "Are you hungry?", "IMPORTANT!", JOptionPane.YES_NO_CANCEL_OPTION);
        //System.out.println(hungry);

        //String name = JOptionPane.showInputDialog("What is your name?");
        String[] responses = {"Hello!", "Go away!", "Guten tag!"};
        ImageIcon icon = new ImageIcon("/home/teodor.penchev/Downloads/communityIcon_i91iz7i42ok91.png");
        JOptionPane.showOptionDialog(null,
                "Hello!",
                "This is the title",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);

    }
}
