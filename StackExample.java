import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushes: " + stack);

        // Peek top element
        System.out.println("Top element (peek): " + stack.peek());

        // Pop element from stack
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);

        // Stack after pop
        System.out.println("Stack now: " + stack);

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
