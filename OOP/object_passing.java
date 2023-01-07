package JavaPractice.OOP;

public class object_passing {
    public static void main(String[] args) {

        Garage garage = new Garage();

        Bike bike1 = new Bike("Shockblaze");
        Bike bike2 = new Bike("Specialized");
        Bike bike3 = new Bike("Cube");

        garage.park(bike1);
        garage.park(bike2);
        garage.park(bike3);

    }
}
