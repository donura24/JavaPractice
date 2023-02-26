package JavaPractice.UpcastingAndDowncasting;

import JavaPractice.Dog;

public class Casting {
    public static void main(String[] args) {

        Frog myFrog = new Frog();
        doAnimalActions(myFrog);
    }
    public static void doAnimalActions(Animal animal){
        if (animal instanceof Frog){
            Frog frog = new Frog();
            frog.frogSound();
        }
        animal.makeNoise();

    }
}
