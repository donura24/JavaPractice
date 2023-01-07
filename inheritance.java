package JavaPractice;

public class inheritance {

    public static void main(String[] args) {

        Boat boat1 = new Boat();
        boat1.drive();

        SkiJet skiJet1 = new SkiJet();
        skiJet1.stop();

        System.out.println(boat1.color);
        System.out.println(skiJet1.color);
    }
}
