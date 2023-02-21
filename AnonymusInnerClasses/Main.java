package JavaPractice.AnonymusInnerClasses;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeNoise();

        Animal frog = new Animal(){
            @Override
            public void makeNoise() {
                System.out.println("FOg-forh-frog!");
            }
        };
        frog.makeNoise();

        Runnable myAnonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am AnonymousRunnable!");
            }
        };
        myAnonymousRunnable.run();
    }
}
