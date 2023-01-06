package JavaPractice.OOP;

public class overloaded_constructor {
    public static void main(String[] args) {

     Cake cake1 = new Cake("vegan", "brown", "green", "swiss chocolate");
     Cake cake2 = new Cake("vegan", "white", "Red");
     Cake cake3 = new Cake("vegan", "cristal");

        System.out.println("Here are all the ingredients: ");
        System.out.println(cake1.apples);
        System.out.println(cake1.dough);
        System.out.println(cake1.sugar);
        System.out.println(cake1.chocolate);
    }
}
