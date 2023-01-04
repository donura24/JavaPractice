public class Arrays {
    public static void main(Strings[] args) {

        /*String[] cars = {"Audi","Ford","Subaru"};

        cars[0] = "Mercedes";
        System.out.println(cars[2]);

         */
        String[] cars = new String[3];
        cars[0] = "VW";
        cars[1] = "Lexus";
        cars[2] = "Ferrari";

        for (String car : cars) {
            System.out.println(car);

        }
    }
}
