package JavaPractice.Encryption_Program;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EncryptionProgram {

    private Scanner scanner;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private String line;
    private char[] letters;
    private char[] secretLetters;
    EncryptionProgram(){

        scanner = new Scanner(System.in);
        random = new Random();
        list = new ArrayList<>();
        shuffledList = new ArrayList<>();
        character = ' ';

        newKey();
        askQuestion();

    }

    private void askQuestion(){

    }
    private void newKey(){

    }
    private void getKey(){

    }
    private void encrypt(){

    }
    private void decrypt(){

    }
    private void quit(){

    }
}
