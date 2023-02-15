package JavaPractice.Lambdas;

public class Frog implements Printable{

    String name;
    int age;

    Frog(){}


    public String print(String suffix) {
        System.out.println("Frooogh");
        return suffix;
    }
}
