package JavaPractice.Debugging;

public class Main {
    public static void main(String[] args) {
        int fistInt = 5;
        int secondInt = 6;
        int sum = add(fistInt,secondInt);

        System.out.println(sum);

    }
    private static int add(int int1, int int2){
        int sum = int1 + int2;
        return sum;
    }
}
