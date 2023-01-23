package JavaPractice.Deserialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;

        FileInputStream fileIN = new FileInputStream("/home/teodor.penchev/IdeaProjects/code/src/JavaPractice/UserPass.ser");
        ObjectInputStream IN = new ObjectInputStream(fileIN);
        user = (User) IN.readObject();
        IN.close();
        fileIN.close();

        System.out.println(user.name);
        System.out.println(user.password);

    }

}
