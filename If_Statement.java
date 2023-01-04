import java.util.Scanner;

public class If_Statement {
    public static void main(Strings[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());

        if (age==21){
            System.out.println("Your age is: "+age);
        } else if (age<21) {
            System.out.println("You are underage");
        } else {
            System.out.println("You are not 20 yeas old.");
        }
    }
}
