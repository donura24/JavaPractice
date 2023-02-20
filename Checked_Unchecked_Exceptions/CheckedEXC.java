package JavaPractice.Checked_Unchecked_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedEXC {
    public static void main(String[] args) {
        try {
            readFile("file1.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist!");
        }
    }
    private  static void readFile(String fileName) throws FileNotFoundException {
        FileReader reader = new FileReader(fileName);
    }

}
