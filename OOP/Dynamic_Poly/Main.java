package JavaPractice.OOP.Dynamic_Poly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal animal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, make your choice: 1 for Horse, 2 for Donkey:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Horse();
            animal.sound();
        } else if (choice == 2) {
            animal = new Donkey();
            animal.sound();
        } else {
            animal = new Animal();
            animal.sound();
        }

    }
}
