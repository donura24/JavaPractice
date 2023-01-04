public class LogicalOperators {
    public static void main(Strings[] args) {

        int speed =150;

        if (speed>=200 && speed<300) {
            System.out.println("Slow down!");
        } else if (speed>=150 && speed<199) {
            System.out.println("Drive cautiously");
        } else {
            System.out.println("You are driving normally.");
        }
    }
}
