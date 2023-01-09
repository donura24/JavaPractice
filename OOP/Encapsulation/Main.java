package JavaPractice.OOP.Encapsulation;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Subaru", "Impreza", 2023);
        car.setYear(1999);
        System.out.println(car.getYear());

    }
}
