package JavaPractice.Equals_Diff;

public class Main {
    public static void main(String[] args) {

        String string1 = "Hello";
        String string2 = "Hello";

        // if (string1 == string2) // it will still work, but use ".equals" for ref.data types.
        if (string1.equals(string2)){
            System.out.println("Strings are equal!");
        } else {
            System.out.println("Strings are not equal!");
        }
        System.out.println(string1);
        System.out.println(string2);
    }
}
