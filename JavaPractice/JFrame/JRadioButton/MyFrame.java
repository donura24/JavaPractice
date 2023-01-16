package JavaPractice.JavaPractice.JFrame.JRadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton sandwichButton;
    JRadioButton donutButton;
    ImageIcon pizza;
    ImageIcon sandwich;
    ImageIcon donut;
    ImageIcon selected;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("Pizza");
        pizzaButton.setFocusable(false);
        pizzaButton.addActionListener(this);

        sandwichButton = new JRadioButton("Sandwich");
        sandwichButton.setFocusable(false);
        sandwichButton.addActionListener(this);

        donutButton = new JRadioButton("donut");
        donutButton.setFocusable(false);
        donutButton.addActionListener(this);

        pizza = new ImageIcon("/home/teodor.penchev/Downloads/32384-pizza-icon.png");
        sandwich = new ImageIcon("/home/teodor.penchev/Downloads/32382-hamburger-icon.png");
        donut = new ImageIcon("/home/teodor.penchev/Downloads/donuts-icon.png");
        selected = new ImageIcon("/home/teodor.penchev/Downloads/check-1-icon.png");

        pizzaButton.setIcon(pizza);
        sandwichButton.setIcon(sandwich);
        donutButton.setIcon(donut);

        pizzaButton.setSelectedIcon(selected);
        sandwichButton.setSelectedIcon(selected);
        donutButton.setSelectedIcon(selected);

        ButtonGroup group = new ButtonGroup(); // Only for 1 possible choice.
        group.add(pizzaButton);
        group.add(sandwichButton);
        group.add(donutButton);

        this.add(pizzaButton);
        this.add(sandwichButton);
        this.add(donutButton);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered a Pizza!");
        } else if (e.getSource() == sandwichButton) {
            System.out.println("You ordered a sandwich!");
        } else if (e.getSource() == donutButton) {
            System.out.println("You ordered a donut!");
        }

    }
}
