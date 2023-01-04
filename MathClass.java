import java.util.Scanner;

public class MathClass {
    public static void main(Strings[] args) {
        /*
        double x = 3.14;
        double y = -20;

        double z = Math.max(x ,y);
        double g = Math.min(x ,y);
        double f = Math.abs(y);
        */

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
// Hypotenuse..
        System.out.println("Enter side x:");
        x = scanner.nextDouble();
        System.out.println("Enter side y:");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse is: " + z);
    }
}
