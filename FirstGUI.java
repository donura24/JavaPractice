import javax.swing.*;

public class FirstGUI {
    public static void main(Strings[] args) {

      String name = JOptionPane.showInputDialog("Enter your name:");
      JOptionPane.showMessageDialog(null, "Hello " +name);

      int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
      JOptionPane.showMessageDialog(null, "You are " + age +" years old");

      double hight  = Double.parseDouble(JOptionPane.showInputDialog("Enter your hight:"));
      JOptionPane.showMessageDialog(null, "You are "+ hight + " cm tall");
    }
}
