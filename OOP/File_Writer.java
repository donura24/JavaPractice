package JavaPractice.OOP;

import java.io.FileWriter;

public class File_Writer {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("Text.txt");
            fileWriter.write("Oneone \nTwotwo\nThreethree\nFourfour\nFivefive");
            fileWriter.append("\nTHE END!");
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("Something, went wrong!");
        }
    }
}
