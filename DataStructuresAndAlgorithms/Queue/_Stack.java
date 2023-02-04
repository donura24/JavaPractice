package JavaPractice.DataStructuresAndAlgorithms.Queue;

import java.util.Stack;

public class _Stack {
    public static void main(String[] args) {

        // Stack = LIFO data structure. Last-In First-Out
        //         stores objects into a sort of 'vertical tower'
        //         push(); to add to the top
        //         pop(); to remove from the top

        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.empty());

        stack.push("WOW");
        stack.push("Toyota");
        stack.push("Subaru");
        stack.push("Mercedes");


        String make1 = stack.pop(); // removes "Mercedes";

        //System.out.println(stack.peek());
        //System.out.println(make1);
        //System.out.println(stack);

        //System.out.println(stack.search("Toyota"));

        // Usage:
        // undo/redo features in text editors
        // moving back/forward through browser history
        // backtracking algorithms (maze, file directories)
        // calling functions (call stack)

    }
}
