package JavaPractice.FibonacciWithRecursion;

public class Main {
    private static long[] fibonacciCache; // memoization

    public static void main(String[] args) {


        int n = 9;

        fibonacciCache = new long[n + 1];
        for (int i = 0; i <=n ; i++) {
            System.out.print(fibonacci(i)+" ");

        }
    }

    private static long fibonacci(int n) {
        if (n <= 1) return n;

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }
        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}
