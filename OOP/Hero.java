package JavaPractice.OOP;

public class Hero extends Person {
    String power;

    public Hero(String name, int age, String strength) {

        super(name, age);
        this.power = strength;
    }

    public String toString() {
        return super.toString() + "\n" + this.power + "\n";
    }

}
