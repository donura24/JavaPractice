package JavaPractice.instanceOf;

class Reptile{}

class Iguana extends Reptile {}

public class ExampleObject {
    public static void main(String[] args) {

        Iguana  iguana1 = new Iguana();

        ExampleObject exampleObject = new ExampleObject();
        System.out.println(iguana1 instanceof Reptile);
    }
}
