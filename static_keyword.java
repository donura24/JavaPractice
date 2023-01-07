package JavaPractice;

public class static_keyword {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Sara");
        Dog dog3 = new Dog("Bark");

        System.out.println(Dog.numberOfDogs);

        Dog.displayDogs();
    }

}
