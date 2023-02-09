package JavaPractice.DataStructuresAndAlgorithms.Queue;

public class Recursion {
    public static void main(String[] args) {


        System.out.println(power(2,5));
        //System.out.println(factorial(5));
        //walk(5);
    }

    private static int power(int base, int exponent) {
        if (exponent<1 )return 1; //base case
        return base * power(base,exponent -1);
    }

    private static int factorial(int number) {
        if (number<1)return 1; // base case
        return number * factorial(number -1); //recursive
    }

    private static void walk(int steps) {
        if (steps < 1) return;
        System.out.println("1 step done.");
        walk(steps-1);
    }
}
