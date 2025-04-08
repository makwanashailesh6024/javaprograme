import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue of strings
        Queue<String> queue = new LinkedList<>();

        // Add elements (enqueue)
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Queue: " + queue);

        // Peek front element
        System.out.println("Front element: " + queue.peek());

        // Remove element (dequeue)
        String removed = queue.poll();
        System.out.println("Removed: " + removed);

        // Queue after removal
        System.out.println("Queue now: " + queue);
    }
}
