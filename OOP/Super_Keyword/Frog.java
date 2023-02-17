package JavaPractice.OOP.Super_Keyword;

public class Frog extends Animal {

    String foodForFrogs;

    public Frog(int age, String name, String foodForFrogs) {
        super(age, name);
        this.foodForFrogs = foodForFrogs;
    }

    @Override
    public void animalSound() {
        super.animalSound();
        System.out.println("Frof-Frof-Frooof!");
    }
}
