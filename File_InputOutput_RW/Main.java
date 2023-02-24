package JavaPractice.File_InputOutput_RW;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Code", "Eat", "F***", "Sleep", "Repeat!"};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("File_InputOutput_RW/output.txt"))) {
            writer.write("Here is Teo, Teo, Teo!");
            writer.write("\nHere is Teo, Teo, Teo!6");
            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("File_InputOutput_RW/output.txt"))) {
            String line;
            while ((line= reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
