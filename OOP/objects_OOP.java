package JavaPractice.OOP;

import JavaPractice.OOP.Car;

public class objects_OOP {
    public static void main(String[] args) {

        Car myCar = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);

        System.out.println(myCar2.year);
        System.out.println(myCar2.price);

        myCar.drive();
        myCar2.brake();
    }
}
