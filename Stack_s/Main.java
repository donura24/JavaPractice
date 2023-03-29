package JavaPractice.Stack_s;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> names = new Stack<String>();

        names.add("Teo");
        names.add("Andro");
        names.add("John");

        System.out.println(names.pop());
        System.out.println(names.peek());
        System.out.println(names.get(0));
        System.out.println(names.set(1,"Michel"));
        System.out.println(names.size());

        System.out.println(names);
    }
}
