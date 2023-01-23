package JavaPractice.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {


        User user = new User();

        user.name = "TeoTeo";
        user.password = "pass123456";

        FileOutputStream fileOutputStream = new FileOutputStream("UserPass.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("Object info saved!");

    }
}
