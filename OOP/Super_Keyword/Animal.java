package JavaPractice.OOP.Super_Keyword;

public class Animal {

    int age;
    String name;

    public Animal() {}
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void animalSound() {
        System.out.println("Uarrr,frof-frof!");
    }
}
