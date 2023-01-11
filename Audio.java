package JavaPractice;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);

        File file = new File("240895.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip;
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
        try {
            clip.open(audioInputStream);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }

        //clip.start();

        String response = "";
        System.out.println("Please, enter a option:");
        System.out.println("P - play; S - Stop; R - Reset; Q - Quit;");
        while (!response.equals("Q")) {
            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P") -> clip.start();
                case ("S") -> clip.stop();
                case ("R") -> clip.setMicrosecondPosition(0);
                case ("Q") -> clip.close();
                default -> System.out.println("Not a valid option!");
            }
        }
        System.out.println("Quit!");
    }
}
