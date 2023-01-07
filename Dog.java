package JavaPractice;

public class Dog {
    String name;
    static int numberOfDogs;

    Dog(String name){
        this.name = name;
        numberOfDogs++;
    }
    static void displayDogs(){
        System.out.println("You have "+numberOfDogs+" dogs!");
    }
}
