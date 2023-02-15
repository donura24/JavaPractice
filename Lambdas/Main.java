package JavaPractice.Lambdas;

public class Main {
    public static void main(String[] args) {

        //Frog frog = new Frog();
        //frog.print();
        //printThing(frog);

        Printable lambdaPrintable = (s) -> "Froooogggg" + s;
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing){
        thing.print("!");
    }

}
