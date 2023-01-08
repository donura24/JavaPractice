package JavaPractice.OOP;

public class super_keyword {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Shrek", 50, "Strength");
        Hero hero2 = new Hero("BatMan", 35, "Flying");

        Person person1 = new Person("BatTeo", 26);

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
        System.out.println(person1.toString());
    }
}
