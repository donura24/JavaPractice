package JavaPractice.OOP.CopyObjects;

import JavaPractice.OOP.Encapsulation.Car;

public class Main {
    public static void main(String[] args) {
        Bike bike1 = new Bike("Drag","Ontario",200);
        //Bike bike2 = new Bike("Sprint","Apollon", 150);
        Bike bike2 = new Bike(bike1);

        //bike2.copy(bike1);

        System.out.println(bike1);
        System.out.println(bike2);
        System.out.println();
        System.out.println(bike1.getModel());
        System.out.println(bike1.getMake());
        System.out.println(bike1.getCost());
        System.out.println();
        System.out.println(bike2.getModel());
        System.out.println(bike2.getMake());
        System.out.println(bike2.getCost());

    }
}
