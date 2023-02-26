package JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        // A prime number is a whole number greater than 1
        // that has only two factors - 1 and the number itself.


        System.out.println("Please, type a number:");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        List<Integer> primeNumbers = new ArrayList<>();

        for (int numToCheck = 2; numToCheck <= limit; numToCheck++){
            boolean isPrime = true;
            for (int factor = 2; factor <= numToCheck/2; factor++){
                if (numToCheck % factor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primeNumbers.add(numToCheck);
            }
        }
        System.out.println("Prime numbers from 1 to "+limit+" are: ");
        for (int number : primeNumbers){
            System.out.print(" "+number);
        }
    }
}
