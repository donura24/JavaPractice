package JavaPractice.OOP;

import java.io.File;

public class File_Class {
    public static void main(String[] args) {

        File file = new File("Dog.java");

        if (file.exists()){
            System.out.println("The file EXISTS!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            System.out.println(file.getTotalSpace());
        } else {
            System.out.println("The file is MISSING!");
        }
    }
}
