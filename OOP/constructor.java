package JavaPractice.OOP;

public class constructor {

    public static void main(String[] args) {
           Human human1 = new Human("Teo", 26, 94.0);
           Human human2 = new Human("Bojidar", 30, 100.0);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human2.eat();
        human1.party();
    }
}
