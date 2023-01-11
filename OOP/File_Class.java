package JavaPractice.OOP;

import java.io.File;

public class File_Class {
    public static void main(String[] args) {

        File file = new File("/home/teodor.penchev/IdeaProjects/untitled/src/JavaPractice/Dog.java");

        if (file.exists()){
            System.out.println("The file EXISTS!");
        } else {
            System.out.println("The file is MISSING!");
        }
    }
}
