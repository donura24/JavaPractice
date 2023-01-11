package JavaPractice.OOP;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Text.txt");
            int data = fileReader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();

            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
